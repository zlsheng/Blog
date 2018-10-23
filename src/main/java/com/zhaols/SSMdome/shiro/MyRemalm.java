package com.zhaols.SSMdome.shiro;

import com.zhaols.SSMdome.entity.ActiveUser;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.mapper.SysUserMapper;
import com.zhaols.SSMdome.utils.CommonUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.AntPathMatcher;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.PatternMatcher;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-21 10:38
 */
public class MyRemalm extends AuthorizingRealm {

    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Autowired
    private SysUserMapper sysUserMapper;


    /**
    *   功能描述: 授权
    *
    *@Author: zhaols
    *@param:
    *@Return:
    *@CreateTime: 2018-08-21  10:39
    */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        ActiveUser activeUser = (ActiveUser) principals.getPrimaryPrincipal();
        List<SysResources> sysResourcesList = null;
        try{
            sysResourcesList = sysResourcesMapper.getSysResourceListByUid(activeUser.getUserid());
        }catch(Exception e){
            e.printStackTrace();
        }
        List<String> resourceslist = new ArrayList<>();
        if(sysResourcesList != null){
            for(SysResources sysResources:sysResourcesList){
                if(sysResources.getUrl() != null && !(sysResources.getUrl().trim().equals(""))){
                    resourceslist.add(sysResources.getUrl());
                }
            }
        }
        // 查到权限数据，返回授权信息(要包括 上边的permissions)
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setStringPermissions(new HashSet<String>(resourceslist));
        return simpleAuthorizationInfo;
    }

    /**
     *   功能描述: 认证
     *
     *@Author: zhaols
     *@param:
     *@Return:
     *@CreateTime: 2018-08-21  10:39
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        SysUser sysUser = null;
        try{
            sysUser = sysUserMapper.getUserByUloginid(username);
        }catch(Exception e ){
            e.printStackTrace();
        }
        if (sysUser == null ){
            return null;
        }
        String password = sysUser.getuPassword();
        String salt = sysUser.getRealSalt();

        ActiveUser activeUser = new ActiveUser();
        activeUser.setUserid(sysUser.getuId());
        activeUser.setUserCode(sysUser.getUserName());
        activeUser.setUsername(sysUser.getuName());
        // 根据用户id取出菜单
        List<SysResources> menus = null;
        try {
            menus = sysResourcesMapper.findMenuListByUserId(sysUser.getuId());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 将用户菜单 设置到activeUser
        activeUser.setMenus(menus);
        // 将activeUser设置simpleAuthenticationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(activeUser, password,
                ByteSource.Util.bytes(salt), "MyRemalm");

        return simpleAuthenticationInfo;

    }

    private List<SysResources> getMenus(List<SysResources> resourceList){
        List<SysResources> list = new ArrayList<>();
        if(resourceList.size() > 0){
            for (SysResources s: resourceList) {
                if(!"0".equals(s.getType())){
                    list.add(s);
                }
            }
        }
        return list;
    }


    @Override
    public boolean isPermitted(Permission permission, AuthorizationInfo info) {
        Collection<Permission> perms = getPermissions(info);
        if (perms != null && !perms.isEmpty()) {
            for (Permission perm : perms) {
                if (implies(perm,permission)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean implies(Permission permission1,Permission permission2) {
        if(!(permission1 instanceof Permission)){
            return false;
        }
        if(!(permission2 instanceof Permission)){
            return false;
        }
        return matches(permission1.toString(),permission2.toString());
    }

    private boolean matches(String ss,String ss2){
        String url1 = ss.substring(0, ss.indexOf("_")); //+ ss.substring(ss.length() - 3, ss.length());
        String url2 = ss2.substring(0, ss2.indexOf("_")); //+ ss2.substring(ss2.length() - 3, ss.length());
        return url1.equals(url2);
    }
}

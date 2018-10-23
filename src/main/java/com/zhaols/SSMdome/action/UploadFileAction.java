package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.entity.UploadFile;
import com.zhaols.SSMdome.service.IUserSysService;
import com.zhaols.SSMdome.utils.CommonUtils;
import com.zhaols.SSMdome.utils.Result;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-09-14 15:14
 */
public class UploadFileAction extends BasicAction<UploadFile,IUserSysService> {
    @Autowired
    private IUserSysService userSysService;

    public final static String IMG_PATH = "E:\\javaFiles\\IDEA\\SSMdome\\src\\main\\webapp\\layui\\images\\avatar"; //头像文件存放处
    public final static String DEFALUT_IMG_NAME = "defalut.jpg";
    public final static String ADMIN_IMG_NAME = "admin.jpg";
    File file;
    String fileFileName;
    String fileContentType;

    public String uploadImage(){
        //上传旧文件的名字 删除用，以保证多次上传只保存最后提交的头像
        String oldFileName = getHttpServletRequest().getParameter("oldFileName");
        System.out.println(oldFileName);
        String id = getHttpServletRequest().getParameter("id");
        SysUser sysUser = userSysService.getUserById(id);
        String suffixName = "";
        String fileName = "";
        String deleteName =sysUser.getuHeadportrait();
        if(StringUtils.isNotEmpty(fileFileName)) {
            try {
                if(!deleteName.equals(oldFileName)){
                    File file = new File(IMG_PATH + "\\" + oldFileName);
                    if(!file.isDirectory()){
                        file.delete();
                    }
                }
                suffixName = fileFileName.substring(fileFileName.lastIndexOf("."));
                fileName = CommonUtils.getFileName() + suffixName;
                FileUtils.copyFile(file, new File(IMG_PATH, fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                result = new Result(false, "图片上传失败");
            } catch (IOException e) {
                e.printStackTrace();
                result = new Result(false, "图片上传失败");
            }
        }
        result = new Result(true ,"图片上传成功",fileName,false);
        return RESULT;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    @Override
    protected IUserSysService getEntityManager() {
        return userSysService;
    }
}

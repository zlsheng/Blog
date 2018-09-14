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
public class UploadFileAction extends BasicAction<UploadFile> {
    @Autowired
    private IUserSysService userSysService;

    public final static String IMG_PATH = "E:\\javaFiles\\IDEA\\SSMdome\\src\\main\\webapp\\layui\\images\\avatar"; //头像文件存放处
    File file;
    String fileFileName;
    String fileContentType;

    public String uploadImage(){
        String suffixName = "";
        String fileName = "";
        String deleteName = "";
        String id = getHttpServletRequest().getParameter("id");
        SysUser sysUser = userSysService.getUserById(id);
        if(StringUtils.isNotEmpty(fileFileName)){
            suffixName = fileFileName.substring(fileFileName.lastIndexOf("."));
            fileName = CommonUtils.getFileName() + "." + suffixName;
        }
        try {
            FileUtils.copyFile(file,new File(IMG_PATH,fileName));
        }catch (FileNotFoundException e){
            e.printStackTrace();
            result = new Result(false ,"上传失败");
        } catch (IOException e){
            e.printStackTrace();
            result = new Result(false ,"上传失败");
        }
        deleteName = sysUser.getuHeadportrait();
        if(StringUtils.isNotEmpty(deleteName)){
            File file = new File(IMG_PATH);
            File[] fs = file.listFiles();
            for(File f:fs){
                //文件名和用户头像名相同且不为文件夹  则删除该头像文件
                if(deleteName.equals(f.getName()) && !f.isDirectory()){
                    f.delete();
                }
            }
        }
        result = new Result(true ,"上传成功",fileName,false);
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
}

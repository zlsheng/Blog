#Author zhaols
#CreationTime 2018-09-13 10:10

alter table SYS_USER rename column u_loginid to USER_NAME;
alter table sys_user add(BASE64_PASSWORD VARCHAR2(500));
comment  on  column  sys_user.BASE64_PASSWORD   is  'Base64加密后密码';
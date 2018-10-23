#Author zhaols
#CreationTime 2018-09-25 11:30

alter table sys_role add(IS_DEL CHAR(2));
comment  on  column  sys_role.IS_DEL   is  '是否删除 11-正常 00-删除';
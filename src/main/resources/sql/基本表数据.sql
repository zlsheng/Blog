prompt PL/SQL Developer Export Tables for user BASIC_USER@ORCL
prompt Created by zhaols on 2018年10月23日 星期二
set feedback off
set define off

prompt Disabling triggers for SYS_RESOURCES...
alter table SYS_RESOURCES disable all triggers;
prompt Disabling triggers for SYS_ROLE...
alter table SYS_ROLE disable all triggers;
prompt Disabling triggers for SYS_ROLE_RESOURCES...
alter table SYS_ROLE_RESOURCES disable all triggers;
prompt Disabling triggers for SYS_ROLE_USER...
alter table SYS_ROLE_USER disable all triggers;
prompt Disabling triggers for SYS_USER...
alter table SYS_USER disable all triggers;
prompt Deleting SYS_USER...
delete from SYS_USER;
commit;
prompt Deleting SYS_ROLE_USER...
delete from SYS_ROLE_USER;
commit;
prompt Deleting SYS_ROLE_RESOURCES...
delete from SYS_ROLE_RESOURCES;
commit;
prompt Deleting SYS_ROLE...
delete from SYS_ROLE;
commit;
prompt Deleting SYS_RESOURCES...
delete from SYS_RESOURCES;
commit;
prompt Loading SYS_RESOURCES...
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('COMMON_URL_1', 'COMMON_URL_1', '获取系统首页', '获取系统首页', 'COMMON_URL', '0', '/admin/login_index.do', '0', null, null, null, null, null, to_date('19-10-2018 14:19:46', 'dd-mm-yyyy hh24:mi:ss'), 1, 'layui-icon layui-icon-template-1');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('COMMON_URL', 'COMMON_URL', '基本URL', '基本URL', null, '0', null, '0', null, null, null, null, null, to_date('19-10-2018 17:23:47', 'dd-mm-yyyy hh24:mi:ss'), 0, 'layui-icon layui-icon-template-1');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_SYSTEM', 'MENU_SYSTEM', '系统管理', '系统管理-管理员', null, '1', null, '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 20, 'layui-icon layui-icon-set-sm');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_SYSTEM_USER', 'MENU_SYSTEM_USER', '用户管理', '用户管理-管理员', 'MENU_SYSTEM', '1', '/system/user_list.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 21, 'layui-icon layui-icon-user');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_SYSTEM_ROLE', 'MENU_SYSTEM_ROLE', '角色管理', '角色管理-管理员', 'MENU_SYSTEM', '1', '/system/role_list.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 22, 'layui-icon layui-icon-auz');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_DEFAULT', 'MENU_DEFAULT', '默认菜单', '默认菜单-普通用户', null, '1', null, '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 10, 'layui-icon layui-icon-home');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_DEFAULT_OPTION_1', 'MENU_DEFAULT_OPTION_1', '选项一', '选项一-普通用户', 'MENU_DEFAULT', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 13, 'layui-icon layui-icon-template-1');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_DEFAULT_OPTION_2', 'MENU_DEFAULT_OPTION_2', '选项二', '选项二-普通用户', 'MENU_DEFAULT', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 14, 'layui-icon layui-icon-template-1');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_DEFAULT_OPTION_3', 'MENU_DEFAULT_OPTION_3', '选项三', '选项三-普通用户', 'MENU_DEFAULT', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 15, 'layui-icon layui-icon-template-1');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_DEFAULT_OPEN_VIP', 'MENU_DEFAULT_OPEN_VIP', '开通VIP', '开通VIP-普通用户', 'MENU_DEFAULT', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 11, 'layui-icon layui-icon-senior');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_DEFAULT_OPEN_SVIP', 'MENU_DEFAULT_OPEN_SVIP', '开通SVIP', '开通SVIP-普通用户', 'MENU_DEFAULT', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 12, ' layui-icon layui-icon-diamond');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_BUSINESS', 'MENU_BUSINESS', '业务菜单', '业务菜单-VIPSVIP', null, '1', null, '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 30, ' layui-icon layui-icon-template');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_BUSINESS_ONE', 'MENU_BUSINESS_ONE', '业务一', '业务一-VIPSVIP', 'MENU_BUSINESS', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 32, ' layui-icon layui-icon-read');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_BUSINESS_TWO', 'MENU_BUSINESS_TWO', '业务二', '业务二-VIPSVIP', 'MENU_BUSINESS', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 33, ' layui-icon layui-icon-component');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_BUSINESS_THREE', 'MENU_BUSINESS_THREE', '业务三', '业务三-VIPSVIP', 'MENU_BUSINESS', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 34, ' layui-icon layui-icon-water');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('MENU_BUSINESS_SVIP', 'MENU_BUSINESS_SVIP', '专属特权', '专属特权-SVIP', 'MENU_BUSINESS', '1', '/admin/login_getTestPage.do', '0', null, null, null, null, null, to_date('24-08-2018 19:50:43', 'dd-mm-yyyy hh24:mi:ss'), 31, ' layui-icon layui-icon-engine');
insert into SYS_RESOURCES (id, code, display, description, parent_code, type, url, status, updator, updator_name, update_time, creator, creator_name, create_time, sort, icon)
values ('COMMON_URL_2', 'COMMON_URL_2', '获取首页用户信息', '获取首页用户信息', 'COMMON_URL', '0', '/admin/login_getUser.do', '0', null, null, null, null, null, to_date('19-10-2018 14:52:56', 'dd-mm-yyyy hh24:mi:ss'), 2, 'layui-icon layui-icon-template-1');
commit;
prompt 17 records loaded
prompt Loading SYS_ROLE...
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('MBWl3eRWp8GsS7FBwcyq9PZdhufMMR', 'dasds', 'dsads', null, 'dsad', '1', '管理员', to_date('25-09-2018 11:18:56', 'dd-mm-yyyy hh24:mi:ss'), '1', '管理员', to_date('25-09-2018 11:18:56', 'dd-mm-yyyy hh24:mi:ss'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('sGrFljdZcXIgnWW9xadGC8shBwXf4D', 'dasds123', 'dsads', null, 'dsad', '1', '管理员', to_date('25-09-2018 11:19:45', 'dd-mm-yyyy hh24:mi:ss'), '1', '管理员', to_date('25-09-2018 11:19:45', 'dd-mm-yyyy hh24:mi:ss'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('3xzWhykrOWle5vgnueNvupCwujE6ku', 'dasds', 'dsads', null, 'dsad', '1', '管理员', to_date('25-09-2018 11:22:46', 'dd-mm-yyyy hh24:mi:ss'), '1', '管理员', to_date('25-09-2018 11:21:10', 'dd-mm-yyyy hh24:mi:ss'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('5gYMO8vxn4FeJlbnkV5E2aiAebcEBV', 'rew123', 'ew123', null, 'rew', '1', '管理员', to_date('25-09-2018 15:54:44', 'dd-mm-yyyy hh24:mi:ss'), '1', '管理员', to_date('25-09-2018 11:21:44', 'dd-mm-yyyy hh24:mi:ss'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('XyEjIGGCuSEyzlNSrx8QauELLxzaGI', 'dsaxz', 'sddsa', null, 'dsa123', '1', '管理员', to_date('30-09-2018 14:24:16', 'dd-mm-yyyy hh24:mi:ss'), '1', '管理员', to_date('25-09-2018 11:22:56', 'dd-mm-yyyy hh24:mi:ss'), '00', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('1', 'SYS_ADMIN', '管理员', null, '管理员', '1', 'admin', to_date('19-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('19-06-2018', 'dd-mm-yyyy'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('test', 'TEST', '测试专用角色', null, '测试专用角色', '1', 'admin', to_date('19-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('19-06-2018 14:44:30', 'dd-mm-yyyy hh24:mi:ss'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('VIP', 'VIP', 'VIP用户', null, 'VIP用户', null, null, null, null, null, to_date('24-08-2018 10:26:12', 'dd-mm-yyyy hh24:mi:ss'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('SVIP', 'SVIP', 'SVIP用户', null, 'SVIP用户', null, null, null, null, null, to_date('24-08-2018 10:26:12', 'dd-mm-yyyy hh24:mi:ss'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('PTYH', 'PTYH', '普通用户', null, '普通用户', null, null, null, null, null, to_date('24-08-2018 10:29:45', 'dd-mm-yyyy hh24:mi:ss'), '11', '11');
insert into SYS_ROLE (id, code, name, remark, description, updator, updator_name, update_time, creator, creator_name, create_time, status, is_del)
values ('v1X2c4DgSkRL4zQbJ8Vty5kBSpKOii', 'ewqewq', 'rewqewq', null, 'ewqeq', '1', '管理员', to_date('25-09-2018 14:37:12', 'dd-mm-yyyy hh24:mi:ss'), '1', '管理员', to_date('25-09-2018 14:37:12', 'dd-mm-yyyy hh24:mi:ss'), '11', '00');
commit;
prompt 11 records loaded
prompt Loading SYS_ROLE_RESOURCES...
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_BUSINESS');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_BUSINESS_ONE');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_BUSINESS_SVIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_BUSINESS_THREE');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_BUSINESS_TWO');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_DEFAULT');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_DEFAULT_OPEN_SVIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_DEFAULT_OPEN_VIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_DEFAULT_OPTION_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_DEFAULT_OPTION_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_DEFAULT_OPTION_3');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_SYSTEM');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_SYSTEM_ROLE');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('1', 'MENU_SYSTEM_USER');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('3xzWhykrOWle5vgnueNvupCwujE6ku', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('3xzWhykrOWle5vgnueNvupCwujE6ku', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('3xzWhykrOWle5vgnueNvupCwujE6ku', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('5gYMO8vxn4FeJlbnkV5E2aiAebcEBV', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('5gYMO8vxn4FeJlbnkV5E2aiAebcEBV', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('5gYMO8vxn4FeJlbnkV5E2aiAebcEBV', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('MBWl3eRWp8GsS7FBwcyq9PZdhufMMR', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('MBWl3eRWp8GsS7FBwcyq9PZdhufMMR', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('MBWl3eRWp8GsS7FBwcyq9PZdhufMMR', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'COMMON_UR');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'MENU_DEFAULT');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'MENU_DEFAULT_OPEN_SVIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'MENU_DEFAULT_OPEN_VIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'MENU_DEFAULT_OPTION_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'MENU_DEFAULT_OPTION_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('PTYH', 'MENU_DEFAULT_OPTION_3');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_BUSINESS');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_BUSINESS_ONE');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_BUSINESS_SVIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_BUSINESS_THREE');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_BUSINESS_TWO');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_DEFAULT');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_DEFAULT_OPEN_SVIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_DEFAULT_OPEN_VIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_DEFAULT_OPTION_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_DEFAULT_OPTION_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('SVIP', 'MENU_DEFAULT_OPTION_3');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_BUSINESS');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_BUSINESS_ONE');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_BUSINESS_THREE');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_BUSINESS_TWO');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_DEFAULT');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_DEFAULT_OPEN_SVIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_DEFAULT_OPEN_VIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_DEFAULT_OPTION_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_DEFAULT_OPTION_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('VIP', 'MENU_DEFAULT_OPTION_3');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('XyEjIGGCuSEyzlNSrx8QauELLxzaGI', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('XyEjIGGCuSEyzlNSrx8QauELLxzaGI', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('XyEjIGGCuSEyzlNSrx8QauELLxzaGI', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('sGrFljdZcXIgnWW9xadGC8shBwXf4D', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('sGrFljdZcXIgnWW9xadGC8shBwXf4D', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('sGrFljdZcXIgnWW9xadGC8shBwXf4D', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'COMMON_URL_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'MENU_BUSINESS');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'MENU_BUSINESS_SVIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'MENU_DEFAULT');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'MENU_DEFAULT_OPEN_SVIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'MENU_DEFAULT_OPEN_VIP');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'MENU_DEFAULT_OPTION_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'MENU_DEFAULT_OPTION_2');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('test', 'MENU_DEFAULT_OPTION_3');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('v1X2c4DgSkRL4zQbJ8Vty5kBSpKOii', 'COMMON_URL');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('v1X2c4DgSkRL4zQbJ8Vty5kBSpKOii', 'COMMON_URL_1');
insert into SYS_ROLE_RESOURCES (role_id, resource_id)
values ('v1X2c4DgSkRL4zQbJ8Vty5kBSpKOii', 'COMMON_URL_2');
commit;
prompt 82 records loaded
prompt Loading SYS_ROLE_USER...
insert into SYS_ROLE_USER (user_id, role_id)
values ('1', '1');
insert into SYS_ROLE_USER (user_id, role_id)
values ('1GPSTWitx4jmGaeBJr2WUpjNLChfm1', 'PTYH');
insert into SYS_ROLE_USER (user_id, role_id)
values ('1GPSTWitx4jmGaeBJr2WUpjNLChfm1', 'SVIP');
insert into SYS_ROLE_USER (user_id, role_id)
values ('3ATPUAQdMqNhzT5VyU9eIjp5k2tOsA', 'PTYH');
insert into SYS_ROLE_USER (user_id, role_id)
values ('81zKrV4SLVwNnEr2K5WXFyFQzxAPGW', 'PTYH');
insert into SYS_ROLE_USER (user_id, role_id)
values ('VG3qLAI6gOmdSZMcTbnaimrvyYZUjq', 'PTYH');
insert into SYS_ROLE_USER (user_id, role_id)
values ('VG3qLAI6gOmdSZMcTbnaimrvyYZUjq', 'test');
insert into SYS_ROLE_USER (user_id, role_id)
values ('jDqnOpReQItKVEHvhrxzqtEjrDGhZk', 'PTYH');
insert into SYS_ROLE_USER (user_id, role_id)
values ('jDqnOpReQItKVEHvhrxzqtEjrDGhZk', 'VIP');
insert into SYS_ROLE_USER (user_id, role_id)
values ('m0xzIjJdfT7ReI66sdD7lxbdLZpTWk', 'PTYH');
insert into SYS_ROLE_USER (user_id, role_id)
values ('ow1LsAGPcwMbAM2GfqizOzXLDpDwoB', 'PTYH');
commit;
prompt 11 records loaded
prompt Loading SYS_USER...
insert into SYS_USER (u_id, user_name, u_nickname, u_password, u_phone, u_sex, u_birthday, u_name, u_email, u_intro, u_headportrait, u_age, u_userstateid, u_rank, u_score, u_registertime, u_logintime, u_loginip, u_activatecode, u_salt, u_rate, updator, updator_name, update_time, creator, creator_name, create_time, base64_password)
values ('VG3qLAI6gOmdSZMcTbnaimrvyYZUjq', 'zhaols', 'niceCode', 'c7c7f720550fba1577fb74ce7742a5ef', 13615621859, 0, to_date('05-09-2000', 'dd-mm-yyyy'), '赵龙胜', '1219466321@qq.com', 'I''m The Best', 'avatar_0RNbiaXp7q.jpg', 23, '11', 1, 0, to_date('20-09-2018 13:53:21', 'dd-mm-yyyy hh24:mi:ss'), to_date('23-10-2018 10:18:44', 'dd-mm-yyyy hh24:mi:ss'), '127.0.0.1', null, null, 0, 'VG3qLAI6gOmdSZMcTbnaimrvyYZUjq', '赵龙胜', to_date('20-09-2018 15:49:16', 'dd-mm-yyyy hh24:mi:ss'), null, null, to_date('20-09-2018 13:53:21', 'dd-mm-yyyy hh24:mi:ss'), 'MTIzNDU2');
insert into SYS_USER (u_id, user_name, u_nickname, u_password, u_phone, u_sex, u_birthday, u_name, u_email, u_intro, u_headportrait, u_age, u_userstateid, u_rank, u_score, u_registertime, u_logintime, u_loginip, u_activatecode, u_salt, u_rate, updator, updator_name, update_time, creator, creator_name, create_time, base64_password)
values ('1', 'admin', '系统管理员', '8634f17272179782c41ec9aebc374731', null, 0, to_date('27-08-2018 17:13:49', 'dd-mm-yyyy hh24:mi:ss'), '管理员', '350943249@qq.com', 'I am a system administrator ', 'admin.jpg', 100, '11', 9, 10000, to_date('02-08-2018', 'dd-mm-yyyy'), to_date('23-10-2018 10:37:03', 'dd-mm-yyyy hh24:mi:ss'), '127.0.0.1', null, null, 4.5, null, null, null, null, null, to_date('30-08-2018 15:43:32', 'dd-mm-yyyy hh24:mi:ss'), null);
insert into SYS_USER (u_id, user_name, u_nickname, u_password, u_phone, u_sex, u_birthday, u_name, u_email, u_intro, u_headportrait, u_age, u_userstateid, u_rank, u_score, u_registertime, u_logintime, u_loginip, u_activatecode, u_salt, u_rate, updator, updator_name, update_time, creator, creator_name, create_time, base64_password)
values ('81zKrV4SLVwNnEr2K5WXFyFQzxAPGW', 'zhaols', 'codeKey', '4262b042295af26a35c8c49702c15f7f', 13615621859, 0, to_date('02-09-1997', 'dd-mm-yyyy'), '赵龙胜', '1219466321@qq.com', 'I''m the best', 'avatar_eeBWsct8Zq.jpg', null, '33', 1, 0, to_date('18-09-2018 16:56:01', 'dd-mm-yyyy hh24:mi:ss'), to_date('23-10-2018 10:18:44', 'dd-mm-yyyy hh24:mi:ss'), '127.0.0.1', null, null, 0, '81zKrV4SLVwNnEr2K5WXFyFQzxAPGW', null, to_date('18-09-2018 16:57:33', 'dd-mm-yyyy hh24:mi:ss'), null, null, to_date('18-09-2018 16:56:01', 'dd-mm-yyyy hh24:mi:ss'), 'YWRtaW4xMjM=');
insert into SYS_USER (u_id, user_name, u_nickname, u_password, u_phone, u_sex, u_birthday, u_name, u_email, u_intro, u_headportrait, u_age, u_userstateid, u_rank, u_score, u_registertime, u_logintime, u_loginip, u_activatecode, u_salt, u_rate, updator, updator_name, update_time, creator, creator_name, create_time, base64_password)
values ('1GPSTWitx4jmGaeBJr2WUpjNLChfm1', 'zhangsan', 'zhangsan', 'c18d7f520475154d4b2f167802ca1368', null, null, null, null, null, null, 'defalut.jpg', null, '11', 1, 0, to_date('21-09-2018 16:41:30', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, 0, null, null, null, null, null, to_date('21-09-2018 16:41:30', 'dd-mm-yyyy hh24:mi:ss'), 'MTIzNDU2');
insert into SYS_USER (u_id, user_name, u_nickname, u_password, u_phone, u_sex, u_birthday, u_name, u_email, u_intro, u_headportrait, u_age, u_userstateid, u_rank, u_score, u_registertime, u_logintime, u_loginip, u_activatecode, u_salt, u_rate, updator, updator_name, update_time, creator, creator_name, create_time, base64_password)
values ('jDqnOpReQItKVEHvhrxzqtEjrDGhZk', 'wangwu', 'wangwu', 'cf2dd7ca4412740a5adb44124bc33841', null, null, null, null, null, null, 'defalut.jpg', null, '11', 1, 0, to_date('21-09-2018 16:41:47', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, 0, null, null, null, null, null, to_date('21-09-2018 16:41:47', 'dd-mm-yyyy hh24:mi:ss'), 'MTIzNDU2');
commit;
prompt 5 records loaded
prompt Enabling triggers for SYS_RESOURCES...
alter table SYS_RESOURCES enable all triggers;
prompt Enabling triggers for SYS_ROLE...
alter table SYS_ROLE enable all triggers;
prompt Enabling triggers for SYS_ROLE_RESOURCES...
alter table SYS_ROLE_RESOURCES enable all triggers;
prompt Enabling triggers for SYS_ROLE_USER...
alter table SYS_ROLE_USER enable all triggers;
prompt Enabling triggers for SYS_USER...
alter table SYS_USER enable all triggers;

set feedback on
set define on
prompt Done

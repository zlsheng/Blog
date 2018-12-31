prompt PL/SQL Developer Export Tables for user MYBLOG@ORCL
prompt Created by zhaols on 2018年12月31日 星期一
set feedback off
set define off

prompt Disabling triggers for BLOG...
alter table BLOG disable all triggers;
prompt Disabling triggers for BLOGGER...
alter table BLOGGER disable all triggers;
prompt Disabling triggers for BLOG_CATEGORY...
alter table BLOG_CATEGORY disable all triggers;
prompt Disabling triggers for BLOG_CONTENT...
alter table BLOG_CONTENT disable all triggers;
prompt Deleting BLOG_CONTENT...
delete from BLOG_CONTENT;
commit;
prompt Deleting BLOG_CATEGORY...
delete from BLOG_CATEGORY;
commit;
prompt Deleting BLOGGER...
delete from BLOGGER;
commit;
prompt Deleting BLOG...
delete from BLOG;
commit;
prompt Loading BLOG...
insert into BLOG (id, title, introduction, read_times, status, blogger_id, category_id, updator, updator_name, update_time, creator, creator_name, create_time, head_portrait)
values ('123', 'test', 'test博客', 13, '0', '1', '123', '1', 'admin', to_date('15-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('15-06-2018 10:44:33', 'dd-mm-yyyy hh24:mi:ss'), null);
insert into BLOG (id, title, introduction, read_times, status, blogger_id, category_id, updator, updator_name, update_time, creator, creator_name, create_time, head_portrait)
values ('456', 'java多线程的高级使用', 'java多线程', 5, '0', '1', '456', '1', 'admin', to_date('18-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('20-06-2018 15:31:54', 'dd-mm-yyyy hh24:mi:ss'), null);
insert into BLOG (id, title, introduction, read_times, status, blogger_id, category_id, updator, updator_name, update_time, creator, creator_name, create_time, head_portrait)
values ('789', 'Spring MVC 教程', 'Spring MVC 详细讲解', 2, '0', '1', '789', '1', 'admin', to_date('20-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('20-06-2018 16:08:29', 'dd-mm-yyyy hh24:mi:ss'), null);
commit;
prompt 3 records loaded
prompt Loading BLOGGER...
insert into BLOGGER (id, nick_name, login_account, password, salt, real_name, address, birthday, career, sex, signature, head_portrait, status, updator, updator_name, update_time, creator, creator_name, create_time)
values ('1', '管理员', 'admin', '123456', '123456', 'zlsheng', '合肥', to_date('06-11-1994', 'dd-mm-yyyy'), 'Java工程师', '0', null, 'banner03.jpg', '00', '1', 'admin', to_date('15-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('15-06-2018', 'dd-mm-yyyy'));
insert into BLOGGER (id, nick_name, login_account, password, salt, real_name, address, birthday, career, sex, signature, head_portrait, status, updator, updator_name, update_time, creator, creator_name, create_time)
values ('123', '测试专用', 'TEST', '123456', '123456', 'test', '合肥', to_date('19-06-2018', 'dd-mm-yyyy'), null, null, null, 'banner03.jpg', '00', '1', 'admin', to_date('19-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('19-06-2018', 'dd-mm-yyyy'));
commit;
prompt 2 records loaded
prompt Loading BLOG_CATEGORY...
insert into BLOG_CATEGORY (id, category_name, blogger_id, blog_id, status, updator, updator_name, update_time, creator, creator_name, create_time)
values ('123', 'java资讯', '1', '123', '0', '1', 'admin', to_date('15-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('15-06-2018 10:45:47', 'dd-mm-yyyy hh24:mi:ss'));
commit;
prompt 1 records loaded
prompt Loading BLOG_CONTENT...
insert into BLOG_CONTENT (id, content_text, content_photo, updator, updator_name, update_time, creator, creator_name, create_time)
values ('123', '测试文本信息哈哈哈哈哈哈哈哈哈哈', null, '1', 'admin', to_date('15-06-2018', 'dd-mm-yyyy'), '1', 'admin', to_date('15-06-2018 10:46:55', 'dd-mm-yyyy hh24:mi:ss'));
commit;
prompt 1 records loaded
prompt Enabling triggers for BLOG...
alter table BLOG enable all triggers;
prompt Enabling triggers for BLOGGER...
alter table BLOGGER enable all triggers;
prompt Enabling triggers for BLOG_CATEGORY...
alter table BLOG_CATEGORY enable all triggers;
prompt Enabling triggers for BLOG_CONTENT...
alter table BLOG_CONTENT enable all triggers;

set feedback on
set define on
prompt Done

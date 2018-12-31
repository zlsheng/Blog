-- Create table
create table BLOG
(
  id            VARCHAR2(50) not null,
  title         VARCHAR2(512),
  introduction  VARCHAR2(1024),
  read_times    NUMBER,
  status        CHAR(1) default '0' not null,
  blogger_id    VARCHAR2(50) not null,
  category_id   VARCHAR2(50) not null,
  updator       VARCHAR2(50),
  updator_name  VARCHAR2(100),
  update_time   DATE,
  creator       VARCHAR2(50),
  creator_name  VARCHAR2(100),
  create_time   DATE default sysdate,
  head_portrait VARCHAR2(100)
);
-- Add comments to the table 
comment on table BLOG
  is '博客信息表';
-- Add comments to the columns 
comment on column BLOG.id
  is 'id';
comment on column BLOG.title
  is '标题';
comment on column BLOG.introduction
  is '简介';
comment on column BLOG.read_times
  is '阅读次数';
comment on column BLOG.status
  is '博客状态 0-正常1-删除';
comment on column BLOG.blogger_id
  is '博主id';
comment on column BLOG.category_id
  is '博客类别id';
comment on column BLOG.updator
  is '更新人';
comment on column BLOG.updator_name
  is '更新人name';
comment on column BLOG.update_time
  is '更新时间';
comment on column BLOG.creator
  is '创建人';
comment on column BLOG.creator_name
  is '创建人name';
comment on column BLOG.create_time
  is '创建时间';
comment on column BLOG.head_portrait
  is '头像(存储头像文件名称)';
  
  
  
  -- Create table
create table BLOGGER
(
  id            VARCHAR2(50) not null,
  nick_name     VARCHAR2(100) not null,
  login_account VARCHAR2(100) not null,
  password      VARCHAR2(100) not null,
  salt          VARCHAR2(50) not null,
  real_name     VARCHAR2(100),
  address       VARCHAR2(200),
  birthday      DATE,
  career        VARCHAR2(200),
  sex           CHAR(1),
  signature     VARCHAR2(512),
  head_portrait VARCHAR2(100),
  status        VARCHAR2(10) default '00',
  updator       VARCHAR2(50),
  updator_name  VARCHAR2(100),
  update_time   DATE,
  creator       VARCHAR2(50),
  creator_name  VARCHAR2(100),
  create_time   DATE default sysdate
);
-- Add comments to the table 
comment on table BLOGGER
  is '博主信息表';
-- Add comments to the columns 
comment on column BLOGGER.nick_name
  is '博主昵称';
comment on column BLOGGER.login_account
  is '登录帐号';
comment on column BLOGGER.password
  is '登录密码';
comment on column BLOGGER.salt
  is '密码加密盐';
comment on column BLOGGER.real_name
  is '博主真实姓名';
comment on column BLOGGER.address
  is '所在地址';
comment on column BLOGGER.birthday
  is '生日';
comment on column BLOGGER.career
  is '职业';
comment on column BLOGGER.sex
  is '性别 0-男 1-女';
comment on column BLOGGER.signature
  is '个性签名';
comment on column BLOGGER.head_portrait
  is '头像(存储头像文件名称)';
comment on column BLOGGER.status
  is '博主帐号状态 00-正常 11-禁用';
comment on column BLOGGER.updator
  is '更新人';
comment on column BLOGGER.updator_name
  is '更新人name';
comment on column BLOGGER.update_time
  is '更新时间';
comment on column BLOGGER.creator
  is '创建人';
comment on column BLOGGER.creator_name
  is '创建人name';
comment on column BLOGGER.create_time
  is '创建时间';
  
  
  
  -- Create table
create table BLOG_CATEGORY
(
  id            VARCHAR2(50) not null,
  category_name VARCHAR2(200),
  blogger_id    VARCHAR2(50),
  blog_id       VARCHAR2(50),
  status        CHAR(1) default '0',
  updator       VARCHAR2(50),
  updator_name  VARCHAR2(100),
  update_time   DATE,
  creator       VARCHAR2(50),
  creator_name  VARCHAR2(100),
  create_time   DATE default sysdate
);
-- Add comments to the table 
comment on table BLOG_CATEGORY
  is '博客类别表';
-- Add comments to the columns 
comment on column BLOG_CATEGORY.category_name
  is '类别名称';
comment on column BLOG_CATEGORY.blogger_id
  is '博主id';
comment on column BLOG_CATEGORY.blog_id
  is '博客id';
comment on column BLOG_CATEGORY.status
  is '类型状态 0-正常 1 -禁用';
comment on column BLOG_CATEGORY.updator
  is '更新人';
comment on column BLOG_CATEGORY.updator_name
  is '更新人name';
comment on column BLOG_CATEGORY.update_time
  is '更新时间';
comment on column BLOG_CATEGORY.creator
  is '创建人';
comment on column BLOG_CATEGORY.creator_name
  is '创建人name';
comment on column BLOG_CATEGORY.create_time
  is '创建时间';
  
  
  
  -- Create table
create table BLOG_CONTENT
(
  id            VARCHAR2(50) not null,
  content_text  VARCHAR2(100),
  content_photo VARCHAR2(100),
  updator       VARCHAR2(50),
  updator_name  VARCHAR2(100),
  update_time   DATE,
  creator       VARCHAR2(50),
  creator_name  VARCHAR2(100),
  create_time   DATE default sysdate
);
-- Add comments to the table 
comment on table BLOG_CONTENT
  is '博客内容表';
-- Add comments to the columns 
comment on column BLOG_CONTENT.id
  is 'id';
comment on column BLOG_CONTENT.content_text
  is '内容(文字存储文件名)';
comment on column BLOG_CONTENT.content_photo
  is '内容()图片存储图片名';
comment on column BLOG_CONTENT.updator
  is '更新人';
comment on column BLOG_CONTENT.updator_name
  is '更新人name';
comment on column BLOG_CONTENT.update_time
  is '更新时间';
comment on column BLOG_CONTENT.creator
  is '创建人';
comment on column BLOG_CONTENT.creator_name
  is '创建人name';
comment on column BLOG_CONTENT.create_time
  is '创建时间';






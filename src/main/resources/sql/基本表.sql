-- Create table
create table SYS_RESOURCES
(
  id           VARCHAR2(50) not null,
  code         VARCHAR2(256),
  display      VARCHAR2(128),
  description  VARCHAR2(512),
  parent_code  VARCHAR2(256),
  type         CHAR(1),
  url          VARCHAR2(500),
  status       CHAR(1) default '0',
  updator      VARCHAR2(50),
  updator_name VARCHAR2(100),
  update_time  DATE,
  creator      VARCHAR2(50),
  creator_name VARCHAR2(100),
  create_time  DATE default sysdate,
  sort         NUMBER default 1 not null,
  icon         VARCHAR2(50) default 'layui-icon layui-icon-template-1'
)
tablespace BASIC_DATABASE
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table SYS_RESOURCES
  is '系统资源表';
-- Add comments to the columns 
comment on column SYS_RESOURCES.id
  is '主键';
comment on column SYS_RESOURCES.code
  is '资源编码';
comment on column SYS_RESOURCES.display
  is '资源名称';
comment on column SYS_RESOURCES.description
  is '资源描述';
comment on column SYS_RESOURCES.parent_code
  is '父资源id';
comment on column SYS_RESOURCES.type
  is '资源类型 1-菜单 2-按钮 0-Url';
comment on column SYS_RESOURCES.url
  is '访问地址';
comment on column SYS_RESOURCES.status
  is '是否启用^0启用1不启用';
comment on column SYS_RESOURCES.updator
  is '更新人';
comment on column SYS_RESOURCES.updator_name
  is '更新人name';
comment on column SYS_RESOURCES.update_time
  is '更新时间';
comment on column SYS_RESOURCES.creator
  is '创建人';
comment on column SYS_RESOURCES.creator_name
  is '创建人name';
comment on column SYS_RESOURCES.create_time
  is '创建时间';
comment on column SYS_RESOURCES.sort
  is '排序';
comment on column SYS_RESOURCES.icon
  is '图标';
-- Create/Recreate primary, unique and foreign key constraints 
alter table SYS_RESOURCES
  add constraint PK_SYS_RESOURCES primary key (ID)
  using index 
  tablespace ORDER_SYS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

  
  -- Create table
create table SYS_ROLE
(
  id           VARCHAR2(50) not null,
  code         VARCHAR2(256),
  name         VARCHAR2(500),
  remark       VARCHAR2(500),
  description  VARCHAR2(512),
  updator      VARCHAR2(50),
  updator_name VARCHAR2(100),
  update_time  DATE,
  creator      VARCHAR2(50),
  creator_name VARCHAR2(100),
  create_time  DATE default sysdate,
  status       CHAR(2) default '11' not null,
  is_del       CHAR(2) default '11' not null
)
tablespace BASIC_DATABASE
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table SYS_ROLE
  is '系统角色表';
-- Add comments to the columns 
comment on column SYS_ROLE.code
  is '角色编码';
comment on column SYS_ROLE.name
  is '角色名称';
comment on column SYS_ROLE.remark
  is '备注';
comment on column SYS_ROLE.description
  is '角色描述';
comment on column SYS_ROLE.updator
  is '更新人';
comment on column SYS_ROLE.updator_name
  is '更新人name';
comment on column SYS_ROLE.update_time
  is '更新时间';
comment on column SYS_ROLE.creator
  is '创建人';
comment on column SYS_ROLE.creator_name
  is '创建人name';
comment on column SYS_ROLE.create_time
  is '创建时间';
comment on column SYS_ROLE.status
  is '角色状态 11-正常 00-禁用';
comment on column SYS_ROLE.is_del
  is '是否删除 11-正常 00-删除';
-- Create/Recreate primary, unique and foreign key constraints 
alter table SYS_ROLE
  add constraint PK_SYS_ROLE primary key (ID)
  using index 
  tablespace ORDER_SYS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

  
  -- Create table
create table SYS_ROLE_RESOURCES
(
  role_id     VARCHAR2(50) not null,
  resource_id VARCHAR2(50) not null
)
tablespace BASIC_DATABASE
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table SYS_ROLE_RESOURCES
  is '角色资源关联表';
-- Add comments to the columns 
comment on column SYS_ROLE_RESOURCES.role_id
  is '角色ID';
comment on column SYS_ROLE_RESOURCES.resource_id
  is '资源id';
-- Create/Recreate primary, unique and foreign key constraints 
alter table SYS_ROLE_RESOURCES
  add constraint PK_SYS_ROLE_RESOURCES primary key (ROLE_ID, RESOURCE_ID)
  using index 
  tablespace ORDER_SYS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

  
  -- Create table
create table SYS_ROLE_USER
(
  user_id VARCHAR2(50) not null,
  role_id VARCHAR2(50) not null
)
tablespace BASIC_DATABASE
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table SYS_ROLE_USER
  is '用户角色关联表';
-- Add comments to the columns 
comment on column SYS_ROLE_USER.user_id
  is '博主id';
comment on column SYS_ROLE_USER.role_id
  is '角色id';
-- Create/Recreate primary, unique and foreign key constraints 
alter table SYS_ROLE_USER
  add constraint PK_SYS_ROLE_USER primary key (USER_ID, ROLE_ID)
  using index 
  tablespace ORDER_SYS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

  
  -- Create table
create table SYS_USER
(
  u_id            VARCHAR2(50) not null,
  user_name       VARCHAR2(50) not null,
  u_nickname      VARCHAR2(50),
  u_password      VARCHAR2(200) not null,
  u_phone         NUMBER,
  u_sex           NUMBER,
  u_birthday      DATE,
  u_name          VARCHAR2(50),
  u_email         VARCHAR2(50),
  u_intro         VARCHAR2(200),
  u_headportrait  VARCHAR2(50),
  u_age           NUMBER,
  u_userstateid   VARCHAR2(50) default 11 not null,
  u_rank          NUMBER default 1,
  u_score         NUMBER default 0,
  u_registertime  DATE,
  u_logintime     DATE,
  u_loginip       VARCHAR2(20),
  u_activatecode  VARCHAR2(20),
  u_salt          VARCHAR2(50),
  u_rate          NUMBER default 1,
  updator         VARCHAR2(50),
  updator_name    VARCHAR2(100),
  update_time     DATE,
  creator         VARCHAR2(50),
  creator_name    VARCHAR2(100),
  create_time     DATE default sysdate,
  base64_password VARCHAR2(500)
)
tablespace BASIC_DATABASE
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table SYS_USER
  is '用户表';
-- Add comments to the columns 
comment on column SYS_USER.user_name
  is '登录帐号(后期实现 邮箱/手机号登陆)';
comment on column SYS_USER.u_nickname
  is '昵称';
comment on column SYS_USER.u_password
  is '密码';
comment on column SYS_USER.u_phone
  is '手机号码';
comment on column SYS_USER.u_sex
  is '0 男  1 女  2 保密';
comment on column SYS_USER.u_birthday
  is '生日';
comment on column SYS_USER.u_name
  is '真实姓名';
comment on column SYS_USER.u_email
  is '邮箱';
comment on column SYS_USER.u_intro
  is '简介';
comment on column SYS_USER.u_headportrait
  is '头像';
comment on column SYS_USER.u_age
  is '年龄';
comment on column SYS_USER.u_userstateid
  is '用户状态      11-正常 22-被锁定  33-已废除';
comment on column SYS_USER.u_rank
  is '用户等级';
comment on column SYS_USER.u_score
  is '积分';
comment on column SYS_USER.u_registertime
  is '注册时间';
comment on column SYS_USER.u_logintime
  is '最后登录时间';
comment on column SYS_USER.u_loginip
  is '最后登录ip';
comment on column SYS_USER.u_activatecode
  is '激活码';
comment on column SYS_USER.u_salt
  is '加密盐 -字段废弃';
comment on column SYS_USER.u_rate
  is '评分等级';
comment on column SYS_USER.updator
  is '更新人';
comment on column SYS_USER.updator_name
  is '更新人name';
comment on column SYS_USER.update_time
  is '更新时间';
comment on column SYS_USER.creator
  is '创建人';
comment on column SYS_USER.creator_name
  is '创建人name';
comment on column SYS_USER.create_time
  is '创建时间';
comment on column SYS_USER.base64_password
  is 'Base64加密后密码';
-- Create/Recreate primary, unique and foreign key constraints 
alter table SYS_USER
  add constraint U_ID primary key (U_ID, USER_NAME)
  using index 
  tablespace ORDER_SYS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

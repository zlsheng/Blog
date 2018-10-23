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
  is 'ϵͳ��Դ��';
-- Add comments to the columns 
comment on column SYS_RESOURCES.id
  is '����';
comment on column SYS_RESOURCES.code
  is '��Դ����';
comment on column SYS_RESOURCES.display
  is '��Դ����';
comment on column SYS_RESOURCES.description
  is '��Դ����';
comment on column SYS_RESOURCES.parent_code
  is '����Դid';
comment on column SYS_RESOURCES.type
  is '��Դ���� 1-�˵� 2-��ť 0-Url';
comment on column SYS_RESOURCES.url
  is '���ʵ�ַ';
comment on column SYS_RESOURCES.status
  is '�Ƿ�����^0����1������';
comment on column SYS_RESOURCES.updator
  is '������';
comment on column SYS_RESOURCES.updator_name
  is '������name';
comment on column SYS_RESOURCES.update_time
  is '����ʱ��';
comment on column SYS_RESOURCES.creator
  is '������';
comment on column SYS_RESOURCES.creator_name
  is '������name';
comment on column SYS_RESOURCES.create_time
  is '����ʱ��';
comment on column SYS_RESOURCES.sort
  is '����';
comment on column SYS_RESOURCES.icon
  is 'ͼ��';
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
  is 'ϵͳ��ɫ��';
-- Add comments to the columns 
comment on column SYS_ROLE.code
  is '��ɫ����';
comment on column SYS_ROLE.name
  is '��ɫ����';
comment on column SYS_ROLE.remark
  is '��ע';
comment on column SYS_ROLE.description
  is '��ɫ����';
comment on column SYS_ROLE.updator
  is '������';
comment on column SYS_ROLE.updator_name
  is '������name';
comment on column SYS_ROLE.update_time
  is '����ʱ��';
comment on column SYS_ROLE.creator
  is '������';
comment on column SYS_ROLE.creator_name
  is '������name';
comment on column SYS_ROLE.create_time
  is '����ʱ��';
comment on column SYS_ROLE.status
  is '��ɫ״̬ 11-���� 00-����';
comment on column SYS_ROLE.is_del
  is '�Ƿ�ɾ�� 11-���� 00-ɾ��';
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
  is '��ɫ��Դ������';
-- Add comments to the columns 
comment on column SYS_ROLE_RESOURCES.role_id
  is '��ɫID';
comment on column SYS_ROLE_RESOURCES.resource_id
  is '��Դid';
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
  is '�û���ɫ������';
-- Add comments to the columns 
comment on column SYS_ROLE_USER.user_id
  is '����id';
comment on column SYS_ROLE_USER.role_id
  is '��ɫid';
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
  is '�û���';
-- Add comments to the columns 
comment on column SYS_USER.user_name
  is '��¼�ʺ�(����ʵ�� ����/�ֻ��ŵ�½)';
comment on column SYS_USER.u_nickname
  is '�ǳ�';
comment on column SYS_USER.u_password
  is '����';
comment on column SYS_USER.u_phone
  is '�ֻ�����';
comment on column SYS_USER.u_sex
  is '0 ��  1 Ů  2 ����';
comment on column SYS_USER.u_birthday
  is '����';
comment on column SYS_USER.u_name
  is '��ʵ����';
comment on column SYS_USER.u_email
  is '����';
comment on column SYS_USER.u_intro
  is '���';
comment on column SYS_USER.u_headportrait
  is 'ͷ��';
comment on column SYS_USER.u_age
  is '����';
comment on column SYS_USER.u_userstateid
  is '�û�״̬      11-���� 22-������  33-�ѷϳ�';
comment on column SYS_USER.u_rank
  is '�û��ȼ�';
comment on column SYS_USER.u_score
  is '����';
comment on column SYS_USER.u_registertime
  is 'ע��ʱ��';
comment on column SYS_USER.u_logintime
  is '����¼ʱ��';
comment on column SYS_USER.u_loginip
  is '����¼ip';
comment on column SYS_USER.u_activatecode
  is '������';
comment on column SYS_USER.u_salt
  is '������ -�ֶη���';
comment on column SYS_USER.u_rate
  is '���ֵȼ�';
comment on column SYS_USER.updator
  is '������';
comment on column SYS_USER.updator_name
  is '������name';
comment on column SYS_USER.update_time
  is '����ʱ��';
comment on column SYS_USER.creator
  is '������';
comment on column SYS_USER.creator_name
  is '������name';
comment on column SYS_USER.create_time
  is '����ʱ��';
comment on column SYS_USER.base64_password
  is 'Base64���ܺ�����';
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

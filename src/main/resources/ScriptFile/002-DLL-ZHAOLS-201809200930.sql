-- Create table
create table MERCH_BRAND
(
  id           VARCHAR2(50) not null,
  brand_name   VARCHAR2(50) not null,
  updator      VARCHAR2(50),
  updator_name VARCHAR2(100),
  update_time  DATE,
  creator      VARCHAR2(50),
  creator_name VARCHAR2(100),
  create_time  DATE default sysdate
)
tablespace BASIC_DATABASE
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table MERCH_BRAND
  is '商家品牌表';
-- Add comments to the columns 
comment on column MERCH_BRAND.id
  is 'id';
comment on column MERCH_BRAND.brand_name
  is '品牌名称';
comment on column MERCH_BRAND.updator
  is '更新人';
comment on column MERCH_BRAND.updator_name
  is '更新人name';
comment on column MERCH_BRAND.update_time
  is '更新时间';
comment on column MERCH_BRAND.creator
  is '创建人';
comment on column MERCH_BRAND.creator_name
  is '创建人name';
comment on column MERCH_BRAND.create_time
  is '创建时间';
-- Create/Recreate primary, unique and foreign key constraints 
alter table MERCH_BRAND
  add constraint BRAND_ID primary key (ID)
  using index 
  tablespace BASIC_DATABASE
  pctfree 10
  initrans 2
  maxtrans 255;

  -- Create table
create table GPU_PRICE
(
  id           VARCHAR2(50) not null,
  gpu_series   VARCHAR2(50) not null,
  gpu_price    NUMBER not null,
  gpu_model    VARCHAR2(50) not null,
  brand_id     VARCHAR2(50) not null,
  updator      VARCHAR2(50),
  updator_name VARCHAR2(100),
  update_time  DATE,
  creator      VARCHAR2(50),
  creator_name VARCHAR2(100),
  create_time  DATE default sysdate
)
tablespace BASIC_DATABASE
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table GPU_PRICE
  is '显卡价格表';
-- Add comments to the columns 
comment on column GPU_PRICE.id
  is 'id';
comment on column GPU_PRICE.gpu_series
  is 'GPU系列';
comment on column GPU_PRICE.gpu_price
  is '价格';
comment on column GPU_PRICE.gpu_model
  is '型号';
comment on column GPU_PRICE.brand_id
  is '品牌id';
comment on column GPU_PRICE.updator
  is '更新人';
comment on column GPU_PRICE.updator_name
  is '更新人name';
comment on column GPU_PRICE.update_time
  is '更新时间';
comment on column GPU_PRICE.creator
  is '创建人';
comment on column GPU_PRICE.creator_name
  is '创建人name';
comment on column GPU_PRICE.create_time
  is '创建时间';
-- Create/Recreate primary, unique and foreign key constraints 
alter table GPU_PRICE
  add constraint GPU_ID primary key (ID)
  using index 
  tablespace BASIC_DATABASE
  pctfree 10
  initrans 2
  maxtrans 255;

-- Create table
create table MERCH_BRAND
(
  id            VARCHAR2(50) not null,
  brand_name    VARCHAR2(50) not null,
  updator       VARCHAR2(50),
  updator_name  VARCHAR2(100),
  update_time   DATE default sysdate,
  creator       VARCHAR2(50),
  creator_name  VARCHAR2(100),
  create_time   DATE default sysdate,
  founder       VARCHAR2(50),
  company_name  VARCHAR2(50),
  founding_time VARCHAR2(50),
  market_time   VARCHAR2(50)
);
-- Add comments to the table 
comment on table MERCH_BRAND
  is '科技公司表';
-- Add comments to the columns 
comment on column MERCH_BRAND.id
  is 'id';
comment on column MERCH_BRAND.brand_name
  is '品牌系列名称';
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
comment on column MERCH_BRAND.founder
  is '公司创始人';
comment on column MERCH_BRAND.company_name
  is '公司名称';
comment on column MERCH_BRAND.founding_time
  is '公司创立时间';
comment on column MERCH_BRAND.market_time
  is '上市时间';

  -- Create table
create table GPU_INFO
(
  id                      VARCHAR2(50) not null,
  gpu_series              VARCHAR2(50) not null,
  gpu_price               NUMBER not null,
  gpu_model               VARCHAR2(50) not null,
  brand_id                VARCHAR2(50) not null,
  updator                 VARCHAR2(50),
  updator_name            VARCHAR2(100),
  update_time             DATE default sysdate,
  creator                 VARCHAR2(50),
  creator_name            VARCHAR2(100),
  create_time             DATE default sysdate,
  gpu_market_time         VARCHAR2(50),
  gpu_core_frequency      VARCHAR2(50),
  gpu_memory_frequency    VARCHAR2(50),
  gpu_memory_capacity     NUMBER,
  gpu_memory_bandwidth    NUMBER,
  power_interface         VARCHAR2(50),
  graphics_chip           VARCHAR2(50) not null,
  display_chip_series     VARCHAR2(100),
  maximum_resolution      VARCHAR2(100),
  interface_type          VARCHAR2(50),
  "I/O_INTERFACE"         VARCHAR2(500),
  heat_dissipation_method VARCHAR2(50),
  product_size            VARCHAR2(50),
  is_status               VARCHAR2(10),
  is_del                  VARCHAR2(10)
);
-- Add comments to the table 
comment on table GPU_INFO
  is '显卡详细参数表';
-- Add comments to the columns 
comment on column GPU_INFO.id
  is 'id';
comment on column GPU_INFO.gpu_series
  is 'GPU系列';
comment on column GPU_INFO.gpu_price
  is '价格';
comment on column GPU_INFO.gpu_model
  is '型号';
comment on column GPU_INFO.brand_id
  is '品牌id';
comment on column GPU_INFO.updator
  is '更新人';
comment on column GPU_INFO.updator_name
  is '更新人name';
comment on column GPU_INFO.update_time
  is '更新时间';
comment on column GPU_INFO.creator
  is '创建人';
comment on column GPU_INFO.creator_name
  is '创建人name';
comment on column GPU_INFO.create_time
  is '创建时间';
comment on column GPU_INFO.gpu_market_time
  is '上市时间';
comment on column GPU_INFO.gpu_core_frequency
  is '核心频率   xxx/xxxx MHZ';
comment on column GPU_INFO.gpu_memory_frequency
  is '显存频率 MHZ';
comment on column GPU_INFO.gpu_memory_capacity
  is '显存大小 G/MB';
comment on column GPU_INFO.gpu_memory_bandwidth
  is '显存位宽  bit';
comment on column GPU_INFO.power_interface
  is '电源接口';
comment on column GPU_INFO.graphics_chip
  is '显示芯片';
comment on column GPU_INFO.display_chip_series
  is '显示芯片系列';
comment on column GPU_INFO.maximum_resolution
  is '最大分辨率';
comment on column GPU_INFO.interface_type
  is '显卡接口';
comment on column GPU_INFO."I/O_INTERFACE"
  is 'I/O接口';
comment on column GPU_INFO.heat_dissipation_method
  is '散热方式';
comment on column GPU_INFO.product_size
  is '产品尺寸';
comment on column GPU_INFO.is_status
  is '显卡当前状态    11正常  22 已停产  33货源不足 44限量';
comment on column GPU_INFO.is_del
  is '是否删除  11-正常  00-删除(做逻辑删除)';
  
  
  -- Create table
create table CPU_INFO
(
  id                             VARCHAR2(50) not null,
  product_name                   VARCHAR2(100) not null,
  appropriate_types              VARCHAR2(10),
  cpu_series                     VARCHAR2(50),
  slot_type                      VARCHAR2(50),
  number_of_cores                VARCHAR2(20),
  cpu_threads                    VARCHAR2(20),
  cpu_craftsmanship              VARCHAR2(20),
  cpu_core_code                  VARCHAR2(20),
  package_style                  VARCHAR2(20),
  cpu_frequency                  VARCHAR2(20),
  dynamic_acceleration_frequency VARCHAR2(20),
  third_level_cache              VARCHAR2(20),
  bus_specification              VARCHAR2(20),
  thermal_design_power           VARCHAR2(20),
  "SUPPORT_ MAX_MEMORY"          VARCHAR2(20),
  memory_type                    VARCHAR2(20),
  is_processor_64                VARCHAR2(2),
  instruction_set                VARCHAR2(50),
  updator                        VARCHAR2(50),
  updator_name                   VARCHAR2(100),
  update_time                    DATE default sysdate,
  creator                        VARCHAR2(50),
  creator_name                   VARCHAR2(100),
  create_time                    DATE default sysdate
);
-- Add comments to the table 
comment on table CPU_INFO
  is 'CPU详细表格';
-- Add comments to the columns 
comment on column CPU_INFO.id
  is 'ID';
comment on column CPU_INFO.product_name
  is '产品名称';
comment on column CPU_INFO.appropriate_types
  is '使用类型  11-台式机  22-笔记本  33 -平板  44-移动端';
comment on column CPU_INFO.cpu_series
  is 'CPU系列';
comment on column CPU_INFO.slot_type
  is '插槽类型';
comment on column CPU_INFO.number_of_cores
  is '核心数量';
comment on column CPU_INFO.cpu_threads
  is 'CPU线程数';
comment on column CPU_INFO.cpu_craftsmanship
  is '制作工艺  xx纳米';
comment on column CPU_INFO.cpu_core_code
  is '核心代号';
comment on column CPU_INFO.package_style
  is '装形式';
comment on column CPU_INFO.cpu_frequency
  is 'CPU主频';
comment on column CPU_INFO.dynamic_acceleration_frequency
  is '动态加速频率';
comment on column CPU_INFO.third_level_cache
  is '三级缓存大小';
comment on column CPU_INFO.bus_specification
  is '总线规格';
comment on column CPU_INFO.thermal_design_power
  is '热设计功耗(TDP)';
comment on column CPU_INFO."SUPPORT_ MAX_MEMORY"
  is '支持最大内存';
comment on column CPU_INFO.memory_type
  is '内存类型';
comment on column CPU_INFO.is_processor_64
  is '是否为64位处理器 11-是  00-不是';
comment on column CPU_INFO.instruction_set
  is '指令集';
comment on column CPU_INFO.updator
  is '更新人';
comment on column CPU_INFO.updator_name
  is '更新人name';
comment on column CPU_INFO.update_time
  is '更新时间';
comment on column CPU_INFO.creator
  is '创建人';
comment on column CPU_INFO.creator_name
  is '创建人name';
comment on column CPU_INFO.create_time
  is '创建时间';

  
  
   
-- Create/Recreate primary, unique and foreign key constraints 
alter table MERCH_BRAND
  add constraint BRAND_ID primary key (ID)
  using index 
  tablespace BASIC_DATABASE
  pctfree 10
  initrans 2
  maxtrans 255;
-- Create/Recreate primary, unique and foreign key constraints 
alter table GPU_INFO
  add constraint GPU_ID primary key (ID)
  using index 
  tablespace BASIC_DATABASE
  pctfree 10
  initrans 2
  maxtrans 255;

  
 alter table CPU_INFO
  add constraint CPU_ID primary key (ID)
  using index 
  tablespace BASIC_DATABASE
  pctfree 10
  initrans 2
  maxtrans 255;


/*==============================================================*/
/* Table: Target_implementation_plan                            */
/*==============================================================*/
create table Target_implementation_plan 
(
   ID                   VARCHAR(100)         not null,
   Plan_accuracy        VARCHAR(10),
   Planning_stage       VARCHAR(10),
   target_id            VARCHAR(100),
   Planning_stage_name  VARCHAR(200),
   Planning_stage_target VARCHAR(500),
   Planning_stage_aim   VARCHAR(500),
   start_time           DATE,
   end_time             DATE,
   stage_doing          VARCHAR(500),
   remake_1             VARCHAR(100),
   remake_2             VARCHAR(100),
   remake_3             VARCHAR(100),
   updater              VARCHAR(100),
   updater_name         VARCHAR(100),
   update_time          Date,
   creater              VARCHAR(100),
   creater_name         VARCHAR(100),
   create_time          DATE,
   is_enable            VARCHAR(10),
   constraint PK_TARGET_IMPLEMENTATION_PLAN primary key (ID)
);

comment on table Target_implementation_plan is
'目标实现计划表';

comment on column Target_implementation_plan.ID is
'目标记录详情ID';

comment on column Target_implementation_plan.Plan_accuracy is
'计划精度  Y 年  M月   D日 H时  ';

comment on column Target_implementation_plan.Planning_stage is
'计划阶段';

comment on column Target_implementation_plan.target_id is
'目标ID';

comment on column Target_implementation_plan.Planning_stage_name is
'阶段名称';

comment on column Target_implementation_plan.Planning_stage_target is
'阶段目标';

comment on column Target_implementation_plan.Planning_stage_aim is
'阶段目的';

comment on column Target_implementation_plan.start_time is
'阶段开始时间';

comment on column Target_implementation_plan.end_time is
'阶段结束时间';

comment on column Target_implementation_plan.stage_doing is
'阶段需要做的事情';

comment on column Target_implementation_plan.remake_1 is
'备用字段';

comment on column Target_implementation_plan.remake_2 is
'备用字段';

comment on column Target_implementation_plan.remake_3 is
'备用字段';

comment on column Target_implementation_plan.updater is
'记录更新人ID';

comment on column Target_implementation_plan.updater_name is
'记录更新人姓名';

comment on column Target_implementation_plan.update_time is
'记录更新时间';

comment on column Target_implementation_plan.creater is
'记录创建人ID';

comment on column Target_implementation_plan.creater_name is
'记录创建人姓名';

comment on column Target_implementation_plan.create_time is
'记录创建时间';

comment on column Target_implementation_plan.is_enable is
'记录是否有效 00 有效  11 无效';

/*==============================================================*/
/* Table: Target_implementation_record                          */
/*==============================================================*/
create table Target_implementation_record 
(
   id                   VARCHAR(100)         not null,
   stage_id             VARCHAR(100),
   stage_name           VARCHAR(100),
   Stage_target         VARCHAR(500),
   isenable             VARCHAR(10),
   State_progress       VARCHAR(10),
   Storage_amount       NUMBER,
   Number_phases_phase  NUMBER,
   updater              VARCHAR(100),
   updater_name         VARCHAR(100),
   update_time          Date,
   creater              VARCHAR(100),
   creater_name         VARCHAR(100),
   create_time          DATE,
   constraint PK_TARGET_IMPLEMENTATION_RECOR primary key (id)
);

comment on table Target_implementation_record is
'目标实现记录表';

comment on column Target_implementation_record.id is
'id';

comment on column Target_implementation_record.stage_id is
'阶段ID';

comment on column Target_implementation_record.stage_name is
'阶段名称';

comment on column Target_implementation_record.Stage_target is
'阶段目的';

comment on column Target_implementation_record.isenable is
'记录是否有效 00有效  11无效';

comment on column Target_implementation_record.State_progress is
' 阶段计划进行状态 00未开始  11正在进行  22已完成';

comment on column Target_implementation_record.Storage_amount is
'已经存储金额数';

comment on column Target_implementation_record.Number_phases_phase is
'阶段预计存储金额总数';

comment on column Target_implementation_record.updater is
'记录更新人ID';

comment on column Target_implementation_record.updater_name is
'记录更新人姓名';

comment on column Target_implementation_record.update_time is
'记录更新时间';

comment on column Target_implementation_record.creater is
'记录创建人ID';

comment on column Target_implementation_record.creater_name is
'记录创建人姓名';

comment on column Target_implementation_record.create_time is
'记录创建时间';

/*==============================================================*/
/* Table: targen_info                                           */
/*==============================================================*/
create table targen_info 
(
   ID                   VARCHAR(100)         not null,
   create_target_person_sex VARCHAR(10),
   begin_target_description VARCHAR(500),
   begin_target_funds   NUMBER,
   begin_target_type    VARCHAR(10),
   target_name          VARCHAR(100),
   target_Introduction  VARCHAR(500),
   purpose              VARCHAR(500),
   create_target_person_name VARCHAR(100),
   create_target_time   DATE,
   begin_target_time    DATE,
   end_target_time      DATE,
   end_target_description VARCHAR(500),
   end_target_funds     NUMBER,
   end_target_type      VARCHAR(10),
   updater              VARCHAR(100),
   updater_name         VARCHAR(100),
   update_time          Date,
   creater              VARCHAR(100),
   creater_name         VARCHAR(100),
   create_time          DATE,
   is_enable            VARCHAR(10),
   constraint PK_TARGEN_INFO primary key (ID)
);

comment on table targen_info is
'目标详情表';

comment on column targen_info.ID is
'目标记录详情ID';

comment on column targen_info.create_target_person_sex is
'目标创建人性别';

comment on column targen_info.begin_target_description is
'目标初始状态描述';

comment on column targen_info.begin_target_funds is
'目标实现初始资金';

comment on column targen_info.begin_target_type is
'实现方式';

comment on column targen_info.target_name is
'目标名称';

comment on column targen_info.target_Introduction is
'目标简介';

comment on column targen_info.purpose is
'定目标的目的';

comment on column targen_info.create_target_person_name is
'目标创建人姓名';

comment on column targen_info.create_target_time is
'目标创建时间';

comment on column targen_info.begin_target_time is
'实现目标开始时间';

comment on column targen_info.end_target_time is
'实现目标结束时间';

comment on column targen_info.end_target_description is
'目标结束状态描述';

comment on column targen_info.end_target_funds is
'目标结束资金';

comment on column targen_info.end_target_type is
'目标结束方式';

comment on column targen_info.updater is
'记录更新人ID';

comment on column targen_info.updater_name is
'记录更新人姓名';

comment on column targen_info.update_time is
'记录更新时间';

comment on column targen_info.creater is
'记录创建人ID';

comment on column targen_info.creater_name is
'记录创建人姓名';

comment on column targen_info.create_time is
'记录创建时间';

comment on column targen_info.is_enable is
'记录是否有效 00 有效  11 无效';

/*==============================================================*/
/* Table: target_Form                                           */
/*==============================================================*/
create table target_Form 
(
   ID                   VARCHAR(100)         not null,
   target_name          VARCHAR(100),
   target_Introduction  VARCHAR(500),
   purpose              VARCHAR(500),
   targnt_info_id       VARCHAR(100),
   create_target_person_name VARCHAR(100),
   create_target_time   DATE,
   begin_target_time    DATE,
   end_target_time      DATE,
   updater              VARCHAR(100),
   updater_name         VARCHAR(100),
   update_time          Date,
   creater              VARCHAR(100),
   creater_name         VARCHAR(100),
   create_time          DATE,
   is_enable            VARCHAR(10),
   is_complete          VARCHAR(10),
   constraint PK_TARGET_FORM primary key (ID)
);

comment on table target_Form is
'目标记录表';

comment on column target_Form.ID is
'目标记录表ID';

comment on column target_Form.target_name is
'目标名称';

comment on column target_Form.target_Introduction is
'目标简介';

comment on column target_Form.purpose is
'定目标的目的';

comment on column target_Form.targnt_info_id is
'目标详情ID';

comment on column target_Form.create_target_person_name is
'目标创建人姓名';

comment on column target_Form.create_target_time is
'目标创建时间';

comment on column target_Form.begin_target_time is
'实现目标开始时间';

comment on column target_Form.end_target_time is
'实现目标结束时间';

comment on column target_Form.updater is
'记录更新人ID';

comment on column target_Form.updater_name is
'记录更新人姓名';

comment on column target_Form.update_time is
'记录更新时间';

comment on column target_Form.creater is
'记录创建人ID';

comment on column target_Form.creater_name is
'记录创建人姓名';

comment on column target_Form.create_time is
'记录创建时间';

comment on column target_Form.is_enable is
'记录是否有效 00 有效  11 无效';

comment on column target_Form.is_complete is
'记录完成状态  00 未完成  11 已完成  22 进行中';


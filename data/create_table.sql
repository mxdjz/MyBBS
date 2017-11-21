drop table if exists T_BBS_USER;
drop table if exists T_BBS_MEMBER;
drop table if exists T_BBS_ADMINISTRATOR;
drop table if exists T_BBS_PLATE;
drop table if exists T_BBS_POST;
drop table if exists T_BBS_REPLY;
drop table if exists T_BBS_NOTICE;


create table T_BBS_USER
(
   USER_ID              char(36) not null,
   LOGIN_NAME           varchar(50) not null comment '登录名',
   PASSWORD             varchar(32) not null comment '登录密码',
   CREATE_BY            char(36) not null,
   CREATE_DATE          datetime not null,
   UPDATE_BY            char(36) not null,
   UPDATE_DATE          datetime not null,
   DELETE_FLAG          int not null,
   primary key (USER_ID)
);
alter table T_BBS_USER comment '论坛用户表';


create table T_BBS_MEMBER
(
   MEMBER_ID            char(36) not null,
   USER_ID              char(36) not null comment '会员关联用户ID',
   NICK_NAME            varchar(255) comment '会员昵称',
   MOBILE               varchar(20) comment '会员联系电话',
   QQ                   varchar(20) comment '会员QQ号',
   EMAIL                varchar(255) comment '会员电子邮箱',
   ADDRESS              varchar(255) comment '会员住址',
   NATIONALITY          varchar(255) comment '会员国籍',
   FOLK                 varchar(255) comment '会员民族',
   CREATE_BY            char(36) not null,
   CREATE_DATE          datetime not null,
   UPDATE_BY            char(36) not null,
   UPDATE_DATE          datetime not null,
   DELETE_FLAG          int not null,
   primary key (MEMBER_ID)
);
alter table T_BBS_MEMBER comment '论坛会员表';


create table T_BBS_ADMINISTRATOR
(
   ADMINISTRATOR_ID     char(36) not null,
   MEMBER_ID            char(36) not null comment '管理员关联会员ID',
   CREATE_BY            char(36) not null,
   CREATE_DATE          datetime not null,
   UPDATE_BY            char(36) not null,
   UPDATE_DATE          datetime not null,
   DELETE_FLAG          int not null,
   primary key (ADMINISTRATOR_ID)
);
alter table T_BBS_ADMINISTRATOR comment '论坛管理员表';


create table T_BBS_PLATE
(
   PLATE_ID             char(36) not null,
   PLATE_TITLE          varchar(255) comment '板块标题',
   PLATE_SUB_TITLE      varchar(255) comment '板块副标题',
   PLATE_PARENT_ID      char(36) comment '父板块ID',
   IMAGE_URL            varchar(500) comment '板块缩略图URL',
   DESCRI               varchar(600) comment '板块描述(200字以内)',
   CREATE_BY            char(36) not null,
   CREATE_DATE          datetime not null,
   UPDATE_BY            char(36) not null,
   UPDATE_DATE          datetime not null,
   DELETE_FLAG          int not null,
   primary key (PLATE_ID)
);
alter table T_BBS_PLATE comment '论坛版块表';


create table T_BBS_POST
(
   POST_ID              char(36) not null,
   POST_TITLE           varchar(255) comment '主题贴标题',
   PLATE_ID             char(36) not null comment '主题贴所属板块ID',
   SIMPLE_CONTENT       varchar(255) comment '主题贴简略内容',
   ALL_CONTENT          varchar(600) comment '主题贴完整内容',
   CREATE_BY            char(36) not null,
   CREATE_DATE          datetime not null,
   UPDATE_BY            char(36) not null,
   UPDATE_DATE          datetime not null,
   DELETE_FLAG          int not null,
   primary key (POST_ID)
);
alter table T_BBS_POST comment '论坛主题帖表';



create table T_BBS_REPLY
(
   REPLY_ID             char(36) not null,
   POST_ID              char(36) not null comment '回复主题ID',
   PARENT_REPLY_ID      char(36) comment '回复父回复ID',
   REPLY_CONTENT        varchar(600) comment '回复内容',
   DELETE_FLAG          int not null,
   CREATE_BY            char(36) not null,
   CREATE_DATE          datetime not null,
   UPDATE_BY            char(36) not null,
   UPDATE_DATE          datetime not null,
   primary key (REPLY_ID)
);
alter table T_BBS_REPLY comment '论坛主题回复表';


create table T_BBS_NOTICE
(
   NOTICE_ID            char(36) not null,
   MESSAGE              varchar(600) comment '公告内容',
   NOTICE_TYPE          int not null comment '公告类型',
   CREATE_BY            char(36) not null,
   CREATE_DATE          datetime not null,
   UPDATE_BY            char(36) not null,
   UPDATE_DATE          datetime not null,
   DELETE_FLAG          int not null,
   primary key (NOTICE_ID)
);
alter table T_BBS_NOTICE comment '论坛公告表';

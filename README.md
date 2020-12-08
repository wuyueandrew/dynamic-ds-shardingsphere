# dynamic-ds-shardingsphere

create schema test collate utf8mb4_0900_ai_ci;
create schema slave1 collate utf8mb4_0900_ai_ci;
create schema slave2 collate utf8mb4_0900_ai_ci;

create table test.xx_account
(
	id bigint auto_increment comment '主键'
		primary key,
	user_name varchar(50) not null comment '用户名',
	type tinyint not null comment '1普通用户 2商家',
	login_name varchar(50) not null comment '登陆名',
	password varchar(50) not null comment '密码',
	address varchar(100) not null comment '地址',
	telephone varchar(11) not null comment '电话',
	create_time bigint not null comment '创建时间',
	update_time bigint not null comment '更新时间',
	deleted tinyint(1) not null comment '是否删除'
)
comment '账户表' charset=utf8;

create table slave1.xx_account
(
	id bigint auto_increment comment '主键'
		primary key,
	user_name varchar(50) not null comment '用户名',
	type tinyint not null comment '1普通用户 2商家',
	login_name varchar(50) not null comment '登陆名',
	password varchar(50) not null comment '密码',
	address varchar(100) not null comment '地址',
	telephone varchar(11) not null comment '电话',
	create_time bigint not null comment '创建时间',
	update_time bigint not null comment '更新时间',
	deleted tinyint(1) not null comment '是否删除'
)
comment '账户表' charset=utf8;

create table slave2.xx_account
(
	id bigint auto_increment comment '主键'
		primary key,
	user_name varchar(50) not null comment '用户名',
	type tinyint not null comment '1普通用户 2商家',
	login_name varchar(50) not null comment '登陆名',
	password varchar(50) not null comment '密码',
	address varchar(100) not null comment '地址',
	telephone varchar(11) not null comment '电话',
	create_time bigint not null comment '创建时间',
	update_time bigint not null comment '更新时间',
	deleted tinyint(1) not null comment '是否删除'
)
comment '账户表' charset=utf8;

-- 初始化数据
INSERT INTO xx_account (id, user_name, type, login_name, password, address, telephone, create_time, update_time, deleted) VALUES (1, 'username0', 0, 'username0', '123456', 'address0', '12345678900', 1546272000000, 1546272000000, 0);
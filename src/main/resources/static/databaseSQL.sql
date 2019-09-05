
# 员工注册表
create table employeesTable
(
	employeesID int(6) auto_increment,
	employeesName varchar(30) null,
	employeesPhoneNumber varchar(15) null,
	employeesPasswordValue varchar(30) null,
	employeesRegisteredDate varchar(20) null,
	employeesRegisteredTime varchar(20) null,
	isCancellation int(2) null,
	employeesCancellationDate varchar(20) null,
	employeesCancellationTime varchar(20) null,
	constraint employeesTable_pk
		primary key (employeesID)
);

# 员工登录表
create table employeesLoginTable
(
    employeesLoginID int(10) auto_increment comment '员工登录ID',
    employeesID varchar(30) null comment '员工ID',
    loginDateTime varchar(40) null comment '登录时间',
    IPAddress varchar(20) null comment '登录IP地址',
    longitude double null comment '经度',
    latitude double null comment '纬度',
    loginResults int null comment '登录结果',
    constraint employeesLoginTable_pk
        primary key (employeesLoginID)
)
comment '员工登录表';

# 员工表职位表
create table employeesPositionTable
(
	`positionID ` int(3) auto_increment comment '职位ID',
	`positionName ` varchar(30) null comment '职位名称',
	`positionDescription ` varchar(100) null comment '职位说明',
	`salary ` double null comment '薪水',
	constraint employeesPositionTable_pk
		primary key (`positionID `)
)
comment '员工表职位表';


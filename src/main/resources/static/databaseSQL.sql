
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

# 员工图片表
create table employeesImageTable
(
    imageID int(6) auto_increment comment '图片ID',
    employeesID varchar(30) null comment '员工ID',
    imageURL varchar(200) null comment '图片URL',
    uploadDateTime varchar(40) null comment '图片上传时间',
    isUsed int(2) null comment '图片是否在使用',
    deprecationDateTime varchar(40) null comment '图片弃用日期时间',
    constraint employeesImageTable_pk
        primary key (imageID)
)
    comment '员工图片表';

# 员工修改密码表
CREATE TABLE `employeesSettingPasswordTable` (
    `settingPasswordID` int(10) DEFAULT NULL COMMENT '修改密码ID',
    `employeesID` varchar(30) DEFAULT NULL COMMENT '员工ID',
    `settingDateTime` varchar(40) DEFAULT NULL COMMENT '修改日期时间',
    `IPAdress` varchar(20) DEFAULT NULL COMMENT 'IP地址',
    `longitude` double DEFAULT NULL COMMENT '经度',
    `latitude` double DEFAULT NULL COMMENT '纬度',
    `settingResults` int(2) DEFAULT NULL COMMENT '修改结果'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工修改密码表';


# 用户表

create table userTable
(
    userID int(6) auto_increment comment '用户注册ID',
    userName varchar(30) null comment '用户昵称',
    userPhoneNumber varchar(15) null comment '用户手机号码',
    userPasswordValue varchar(30) null comment '用户密码值',
    userRegisteredDate varchar(20) null comment '用户注册日期',
    userRegisteredTime varchar(20) null comment '用户注册时间',
    isCancellation int(2) null comment '是否注销',
    userCancellationDate varchar(20) null comment '用户注销日期',
    userCancellationTime varchar(20) null comment '用户注销时间',
    constraint userTable_pk
        primary key (userID)
);


















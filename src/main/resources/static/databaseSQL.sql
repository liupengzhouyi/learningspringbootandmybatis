
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
)comment '员工登录表';

# 员工修改密码表
create table employeesSettingPasswordTable
(
    settingPasswordID int(10) null comment '修改密码ID',
    employeesID varchar(30) null comment '员工ID',
    settingDateTime varchar(40) null comment '修改日期时间',
    IPAdress varchar(20) null comment 'IP地址',
    longitude double null comment '经度',
    latitude double null comment '纬度',
    settingResults int(2) null comment '修改结果'
)
    comment '员工修改密码表';


# 用户图片表
create table userImageTable
(
    imageID int(6) auto_increment comment '图片ID',
    userID varchar(30) null comment '用户ID',
    imageURL varchar(200) null comment '图片URL',
    uploadDateTime varchar(40) null comment '图片上传时间',
    isUsed int(2) null comment '图片是否在使用',
    deprecationDateTime varchar(40) null comment '图片弃用日期时间',
    constraint userImageTable_pk
        primary key (imageID)
)
    comment '用户图片表';

create table userSettingPasswordTable
(
    settingPasswordID int(10) auto_increment comment '修改密码ID',
    userID varchar(30) null comment '员工ID',
    settingDateTime varchar(40) null comment '修改日期时间',
    IPAdress varchar(20) null comment 'IP地址',
    longitude double null comment '经度',
    latitude double null comment '纬度',
    settingResults int(2) null comment '修改结果',
    constraint userSettingPasswordTable_pk
        primary key (settingPasswordID)
)
    comment '用户修改密码表';

# 菜品表
create table dishesTable
(
    dishesID varchar(30) comment '菜品ID',
    dishesPrice double null comment '菜品价格',
    dishesRegisteredDateTime varchar(40) null comment '菜品注册日期',
    whoRegisteredDishes varchar(30) null comment '菜品注册操作人',
    dishesIsCancellation int(2) null comment '菜品是否注销',
    disheslsCancellationDateTime varchar(40) null comment '菜品注销日期',
    whoCancellationDishes varchar(30) null comment '菜品注销操作人',
    constraint dishesTable_pk
        primary key (dishesID)
)
    comment '菜品表';

# 菜品图片表
create table dishesImageTable
(
    dishesID varchar(30) null comment '菜品ID',
    dishesImageURL varchar(200) null comment '菜品图片URL',
    isUsed int(2) null comment '图片是否在使用',
    uploadDateTime varchar(40) null comment '图片上传日期'
)
    comment '菜品图片表';

# 菜品特征值表
create table dishesCharacteristicsTable
(
    dishesID varchar(30) null comment '菜品ID',
    characteristicsValueID int null comment '菜品特征值ID'
)
    comment '菜品特征值表';












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

# 特征值表
create table characteristicTable
(
    characteristicsValueID int auto_increment comment '特征值ID',
    characteristics varchar(20) null comment '特征描述',
    constraint characteristicTable_pk
        primary key (characteristicsValueID)
)
    comment '特征值表';

create table signTable
(
    signID int(10) auto_increment comment '签到ID',
    signName varchar(50) null comment '签到名称',
    signBeginDateTime varchar(40) null comment '签到开始时间',
    signEndDateTime varchar(40) null comment '签到结束时间',
    longitude double null comment '定位地址-经度',
    latitude double null comment '定位地址-纬度',
    addSignDateTime varchar(40) null comment '添加签到时间',
    whoAdd varchar(40) null comment '添加人',
    isUsed int(2) null comment '签到是否在用',
    signAbandonedDateTime varchar(40) null comment '签到废弃时间',
    signIsEdited int(2) null comment '签到是否被编辑',
    constraint signTable_pk
        primary key (signID)
)
    comment '签到表';

# 签到表
create table signTable
(
    signID int(10) auto_increment comment '签到ID',
    signName varchar(50) null comment '签到名称',
    signBeginDateTime varchar(40) null comment '签到开始时间',
    signEndDateTime varchar(40) null comment '签到结束时间',
    longitude double null comment '定位地址-经度',
    latitude double null comment '定位地址-纬度',
    addSignDateTime varchar(40) null comment '添加签到时间',
    whoAdd varchar(40) null comment '添加人',
    isUsed int(2) null comment '签到是否在用',
    signAbandonedDateTime varchar(40) null comment '签到废弃时间',
    signIsEdited int(2) null comment '签到是否被编辑',
    constraint signTable_pk
        primary key (signID)
)
    comment '签到表';



# 员工签到表

create table employeesSignTable
(
    employeesSginID int(15) auto_increment comment '员工签到ID',
    employeesID varchar(30) null comment '员工ID',
    signDateTime varchar(40) null comment '签到时间',
    signDistance int(2) null comment '签到评价（早/适/晚）',
    timaGap int(3) null comment '签到时间差(min)',
    longitude double null comment '定位地址-经度',
    latitude double null comment '定位地址-纬度',
    distance double null comment '签到距离差距',
    constraint employeesSignTable_pk
        primary key (employeesSginID)
)
    comment '员工签到表';

# 员工签到编辑表

create table signEditingTable
(
    editingID int(10) auto_increment comment '编辑表ID',
    employeesEditingID varchar(40) null comment '员工签到ID',
    masterID varchar(40) null comment '操作者ID',
    ordDateTime varchar(40) null comment '原签到时间',
    orderLongitude double null comment '原定位地址-经度',
    orderLatitude double null comment '原定位地址-纬度',
    constraint signEditingTable_pk
        primary key (editingID)
)
    comment '员工签到编辑表';

# 订单表

create table orderTable
(
    orderID int(10) auto_increment comment '订单ID',
    userID varchar(30) null comment '用户ID',
    orderDateTime varchar(40) null comment '订单日期',
    employeesID varchar(40) null comment '订单负责人',
    priceToPay double null comment '订单结算',
    price double null comment '实付价格',
    userOrderNumber varchar(50) null comment '单号',
    constraint orderTable_pk
        primary key (orderID)
)
    comment '订单表';












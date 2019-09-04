
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


#

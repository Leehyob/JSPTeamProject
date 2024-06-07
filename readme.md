 create table userInfo(
 userNum number(5) primary key not null ,
 userId varchar2(20) not null,
 name varchar2(10) not null,
 nickName varchar2(20),
 pwd varchar2(20) not null,
 email varchar2(50),
 phone varchar2(15) not null,
 address varchar2(100),
 key number(1) not null
 );CREATE TABLE bulletin (
	bulletinNum	number(5) NOT NULL primary key,
	userNum number(5)	NOT NULL,
	userId	varchar2(20) NOT NULL,
	bulletinTitle	varchar2(50) NOT NULL,
	bulletinContent	varchar2(2000)	NOT NULL,
    nickName    varchar2(20) NOT NULL,
	bulletinDate date default sysdate NOT NULL,
    CONSTRAINT fk_userNum FOREIGN key(userNum) references userInfo(userNum)
);
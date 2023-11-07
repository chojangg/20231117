create database jayun;
use jayun;

show tables;
select * from test_user;

create table test_user
(
    login_Id varchar(10) not null
        primary key,
    user_nm  varchar(20) null,
    email    varchar(20) null,
    address  varchar(20) null
);

INSERT INTO jayun.test_user (login_Id, user_nm, email, address) VALUES ('user1', '홍길동1', 'test1@solupia.co.kr', '서울');
INSERT INTO jayun.test_user (login_Id, user_nm, email, address) VALUES ('user2', '홍길동2', 'test2@solupia.co.kr', '인천');
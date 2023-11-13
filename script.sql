create database jayun;
use jayun;

show tables;
select * from test_user;

drop table test_user;
create table test_user
(
    login_Id varchar(10) not null
        primary key,
    user_nm  varchar(20) null,
    email    varchar(25) null,
    address  varchar(25) null
);

INSERT INTO jayun.test_user (login_Id, user_nm, email, address) VALUES ('user1', '홍길동1', 'test1@solupia.co.kr', '서울');
INSERT INTO jayun.test_user (login_Id, user_nm, email, address) VALUES ('user2', '홍길동2', 'test2@solupia.co.kr', '인천');
insert into test_user values ('lab', 'jayun', 'choija@solupia.co.kr', 'gangseogu');
insert into test_user values ('security', 'taeyeon', 'xodus@solupia.co.kr', 'gangseogu');
insert into test_user values ('network', 'gahyun', 'jgahyun@solupia.co.kr', 'gunsan');
insert into test_user values ('aaa', 'user1', 'aaa@solupia.co.kr', '서울');
insert into test_user values ('bbb', 'user2', 'bbb@solupia.co.kr', '인천');
insert into test_user values ('ccc', 'user3', 'ccc@solupia.co.kr', '부산');
insert into test_user values ('ddd', 'user4', 'ddd@solupia.co.kr', '대구');
insert into test_user values ('eee', 'user5', 'eee@solupia.co.kr', '전주');
insert into test_user values ('fff', 'user6', 'fff@solupia.co.kr', '수원');
delete from test_user where login_Id = 'fffdfd';
UPDATE test_user SET login_Id = 'aaaaa' WHERE login_Id = 'aaa';
select * from test_user;

commit;

# select login_Id, user_nm, email, address from test_user
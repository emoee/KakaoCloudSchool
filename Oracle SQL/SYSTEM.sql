-- 관리자 계정에서 할 수 있기 때문에 관리자 계정으로 로그인해야한다.
show user;

DROP USER madang CASCADE; -- 계정있는지 확인을 위해 삭제 명령을 하는 것이 좋다. 
create user madang Identified by madaong default tablespace users temporary tablespace temp profile default;

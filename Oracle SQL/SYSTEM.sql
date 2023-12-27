-- 관리자 계정에서 할 수 있기 때문에 관리자 계정으로 로그인해야한다.
show user;

DROP USER madang CASCADE; -- 계정있는지 확인을 위해 삭제 명령을 하는 것이 좋다. 
create user madang Identified by madang default tablespace users temporary tablespace temp profile default;

-- 계정 생성만하고 권한이 없기때문에 권한 부여를 해야한다.
-- connect 명령을 해야 외부에서 접속할 수 있다. 
GRANT CONNECT, resource to madang; 
 -- synonym 이름 줄이기 권한 부여, import pandas as pd; 경우과 같이 이름 줄이기를 사용할 수 있다. 
grant create view, create synonym to madang;

alter user madang account unlock; -- 방화벽 해제 명령, 해제하지않으면 계정 접속을 하지 못한다.

-- 여기까지가 madang 계정 생성해 권한 부여하는 것이다. 

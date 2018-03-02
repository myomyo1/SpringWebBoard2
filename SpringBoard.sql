create sequence board_seq start with 1 increment BY 1;

CREATE TABLE tb_user(
    userid varchar2(30) primary key,
    userpw varchar2(30) not null,
    username varchar2(30) not null,
    email varchar2(30)
);

CREATE TABLE tb_board_demo(
    bidx NUMBER(10) PRIMARY KEY,
    title VARCHAR2(255),
    contents VARCHAR2(4000),
    userid VARCHAR2(30),
    writedate DATE DEFAULT SYSDATE,
    modifydate DATE DEFAULT SYSDATE,
    hitcnt NUMBER DEFAULT 0,
    FOREIGN KEY (userid) REFERENCES tb_user (userid)
);

insert into tb_user values('smh1','smh1','소민호', 'mhso@naver.com');
insert into tb_user values('smh2','smh2','소민호', 'mhso@naver.com');
insert into tb_board_demo(bidx, title, contents, userid, writedate, modifydate)
			values (board_seq.nextval, '게시글 제목1', '게시글 내용1', 'smh1', sysdate, sysdate);
insert into tb_board_demo(bidx, title, contents, userid, writedate, modifydate)
			values (board_seq.nextval, '게시글 제목2', '게시글 내용2', 'smh1', sysdate, sysdate);
insert into tb_board_demo(bidx, title, contents, userid, writedate, modifydate)
			values (board_seq.nextval, '게시글 제목3', '게시글 내용3', 'smh2', sysdate, sysdate);
insert into tb_board_demo(bidx, title, contents, userid, writedate, modifydate)
			values (board_seq.nextval, '게시글 제목4', '게시글 내용4', 'smh2', sysdate, sysdate);
insert into tb_board_demo(bidx, title, contents, userid, writedate, modifydate)
			values (board_seq.nextval, '게시글 제목5', '게시글 내용5', 'smh1', sysdate, sysdate);
insert into tb_board_demo(bidx, title, contents, userid, writedate, modifydate)
			values (board_seq.nextval, '게시글 제목6', '게시글 내용6', 'smh2', sysdate, sysdate);
insert into tb_board_demo(bidx, title, contents, userid, writedate, modifydate)
			values (board_seq.nextval, '게시글 제목7', '게시글 내용7', 'smh1', sysdate, sysdate);
commit;

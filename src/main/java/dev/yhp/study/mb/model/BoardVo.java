package dev.yhp.study.mb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Deque;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVo {

    /*bno     number         not null,
    title   varchar2(30)   not null,
    content varchar2(2000) not null,
    writer  varchar2(30) not null,
    regdate date default sysdate,
    viewCnt number default 0,
    primary key(bno)    */

    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private int viewCnt;

}

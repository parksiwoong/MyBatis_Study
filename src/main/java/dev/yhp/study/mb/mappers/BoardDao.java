package dev.yhp.study.mb.mappers;


import dev.yhp.study.mb.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Mapper
public interface BoardDao {

    public List<BoardVo> listPage(int displayPost, int postNum) throws Exception;
    public int write(BoardVo boardVo) throws Exception; //작성
    public BoardVo read(int bno) throws Exception; //조회
    public void update(BoardVo boardVo) throws Exception; //수정
    public void delete(int bno) throws Exception; //삭제


    public List<BoardVo> list()throws Exception; //리스트
    int count() throws Exception; //페이지
}

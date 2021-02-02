package dev.yhp.study.mb.services;


import dev.yhp.study.mb.model.BoardVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    public int write(BoardVo boardVo) throws Exception;
    List<BoardVo> list()  throws Exception;
    public List listPage(int displayPost,int postNum)throws Exception;
}

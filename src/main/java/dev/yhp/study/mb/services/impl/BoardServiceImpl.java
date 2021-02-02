package dev.yhp.study.mb.services.impl;

import ch.qos.logback.core.db.dialect.HSQLDBDialect;
import dev.yhp.study.mb.mappers.BoardDao;
import dev.yhp.study.mb.model.BoardVo;
import dev.yhp.study.mb.services.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardDao boardDao;

    @Autowired
    BoardServiceImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }


    @Override
    public int write(BoardVo boardVo) throws Exception {
        return boardDao.write(boardVo);
    }

    @Override
    public List<BoardVo> list() throws Exception {
        return boardDao.list();
    }
    @Override
    public List listPage(int displayPost, int postNum) throws Exception {
        HashMap data = new HashMap();
        data.put("displayPost",displayPost);
        data.put("postNum",postNum);

        return boardDao.listPage(displayPost, postNum);
    }


}

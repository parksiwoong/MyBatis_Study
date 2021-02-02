package dev.yhp.study.mb.controllers;

import dev.yhp.study.mb.model.BoardVo;
import dev.yhp.study.mb.model.PageVo;
import dev.yhp.study.mb.services.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class BoardController {
    private BoardService boardService;
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    public BoardController(BoardService boardService){this.boardService = boardService;}

    @RequestMapping(value = "board" ,method = RequestMethod.GET)
    public ModelAndView Boardlist(@RequestParam("num") int num) throws Exception{
        logger.info("boardmain in");

        PageVo pageVo = new PageVo();

//        int count = boardService.count();
//        int postNum = 10;
//        int pageNum = (int)Math.ceil((double) count/postNum); //하단페이징정보
//        int displayPost = (num - 1)* postNum; //출력할게시물
//        List<BoardVo> list = boardService.list();
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("/board/boardlist");
//        mav.addObject("list", list);
//        mav.addObject("pageNum", pageNum);
//        logger.info("boardmain out");
//        return mav;
    }

    @RequestMapping(value = "postwrite", method = RequestMethod.POST)
    @ResponseBody
    public Object postWrite(@RequestBody BoardVo boardVo) throws Exception{
        logger.info("post write in");
        return boardService.write(boardVo);
    }
}

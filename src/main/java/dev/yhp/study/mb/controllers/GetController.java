package dev.yhp.study.mb.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class GetController {

    private static Logger logger = LoggerFactory.getLogger(BoardController.class);

    @RequestMapping(value = "main" , method = RequestMethod.GET)
    public String MainController(){    return "";  }



    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String getWrite() throws Exception{
        logger.info("get write");
        return "board/write";
    }


}

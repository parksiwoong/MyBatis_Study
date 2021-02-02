package dev.yhp.study.mb.controllers;

import dev.yhp.study.mb.services.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/")
public class RootController {
    private final ValueService valueService;

    @Autowired
    public RootController(ValueService valueService) {
        this.valueService = valueService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public void indexGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print(this.valueService.getValue());
    }
}
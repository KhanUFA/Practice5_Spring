package ru.blogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller("actions")
public class MainController {
    @RequestMapping("/list")
    ModelAndView showList(){
        var mav = new ModelAndView();
        String strings[] = new String[]{"1", "2", "3", "4", "5", "6", "<script>alert(100500)</script>"};
        mav.addObject("currentList", Arrays.asList(strings));
        mav.setViewName("list");
        return mav;
    }
}

package com.formbinding.controller;

import com.formbinding.model.Box;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/box")
public class BoxController {
    @GetMapping("/email")
    public ModelAndView formEmail() {
        Box box = new Box();
        box.setLanguages("Vietnamese");
        box.setPageSize("5");
        box.setSpamsFilter(false);
        box.setSignature("viet ling ting");
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("box", new Box());
        return modelAndView;
    }
    @PostMapping("update")
    public ModelAndView formBox(@ModelAttribute("box") Box box){
        ModelAndView modelAndView = new ModelAndView("views");
        modelAndView.addObject("box",box);
        return modelAndView;
    }
}

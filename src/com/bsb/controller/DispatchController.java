package com.bsb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dispatch")
public class DispatchController {
	
	@RequestMapping("/apply")
	public ModelAndView getApply(){
        ModelAndView mv = new ModelAndView("DispatchApply");
        return mv;
    }
	
}

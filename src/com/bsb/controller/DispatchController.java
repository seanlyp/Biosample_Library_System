package com.bsb.controller;

<<<<<<< Updated upstream
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
>>>>>>> Stashed changes

@Controller
@RequestMapping("/dispatch")
public class DispatchController {
	
	@RequestMapping("/apply")
<<<<<<< Updated upstream
	public ModelAndView getApply(){
        ModelAndView mv = new ModelAndView("DispatchApply");
        return mv;
    }
=======
	public ModelAndView getApply()
	{
		ModelAndView mView = new ModelAndView("DispatchApply");
		return mView;
	}
	
>>>>>>> Stashed changes
}

package com.bsb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bsb.service.DispatchService;

@Controller
@RequestMapping("/dispatch")
public class DispatchController {
	
	@Autowired
    private DispatchService dispatchService;
	
	@RequestMapping("/apply")
	public ModelAndView getApply(){
        ModelAndView mv = new ModelAndView("DispatchApply");
        return mv;
    }
	
	@RequestMapping("/apply_deliversum")
	public ModelAndView getApplySum(String applicant, String type, String snum, String condition){
		ModelAndView mv = new ModelAndView("DispatchApply");
		mv.addObject("applicant", applicant);
		mv.addObject("type", type);
		mv.addObject("snum", snum);
		mv.addObject("condition", condition);
		
		String[] types = type.split(",");
		String[] snums = snum.split(",");
		String[] conditions = condition.split(",");

        int anum = dispatchService.getApplyNum();
		anum = anum + 1;
		String order = "DA" + String.valueOf(anum);
		
		String result = "待审核";
		
		for(int i = 0; i < types.length; i++) {
			int num = Integer.valueOf(snums[i]);
			type = types[i];
			condition = conditions[i];
			dispatchService.insertApplyDetail(order, type, num, condition, result); 
		}
		
		
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sFormat.format(new Date());
		
		dispatchService.insertApplySummary(order, applicant, time, result);
        
        // 返回界面
        return(new ModelAndView("redirect:app_checksum"));
    }
}

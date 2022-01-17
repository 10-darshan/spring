package com.darshan.demo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("index")
	public ModelAndView home(Employee e) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		mv.addObject("obj",e);
		return mv;
	}

}

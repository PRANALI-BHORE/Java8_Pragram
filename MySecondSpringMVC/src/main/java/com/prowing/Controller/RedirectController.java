package com.prowing.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	//we method 1-can redirect page by using--> "redirect:/two"
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("inside one....");
//		return "redirect:/two";
//	}
	
	//method 2- we can redirect page by using 
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("inside one....");
		RedirectView rv=new RedirectView();
		rv.setUrl("two");
		return rv;
	}
	@RequestMapping("/two")
	
	public String two() {
		System.out.println("inside two....");
		return "contact";
	}
}

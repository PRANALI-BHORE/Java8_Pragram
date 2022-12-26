package com.prowing.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prowing.Model.User;
import com.prowing.Service.UserService;

@Controller
public class HomeControllerr {

	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String home() {
		String s=null;
		System.out.println(s.charAt(0));
		System.out.println("inside home");
		return "home";
	}

	@RequestMapping("/contact")
	public String contactdetails() {

		return "contact";
	}

	// old method to get object from view using HttpServletRequest request
//	@RequestMapping(path = "/submitform", method = RequestMethod.POST)
//	public String submitform(HttpServletRequest request) {
//		String name=request.getParameter("username");
//		String password=request.getParameter("userpassword");
//		String email=request.getParameter("useremail");
//		System.out.println("user name: "+name);
//		System.out.println("user password: "+password);
//		System.out.println("user email: "+email);
//		return "";
//	}

//	@RequestMapping(path = "/submitform", method = RequestMethod.POST)
//	public String submitform(@RequestParam("username") String name, @RequestParam("userpassword") String password, 
//			@RequestParam("useremail") String email, Model m) {
//		
//		User user=new User();
//		user.setName(name);
//		user.setPassword(password);
//		user.setEmail(email);
//		
//		m.addAttribute("user",user);
////		System.out.println("Name: "+name);
////		System.out.println("Password: "+password);
////		System.out.println("Email id: "+email);
////		m.addAttribute("n", name);
////		m.addAttribute("p", password);
////		m.addAttribute("e", email);
//		
//		return "submitform";
//	}

	// we can use @ModelAttribute instead of @RequestParam
	@RequestMapping(path = "/submitform", method = RequestMethod.POST)
	public String submitform(@ModelAttribute User user, Model m) {
		System.out.println(user);
		this.userService.createUser(user);
		return "submitform";
	}

}

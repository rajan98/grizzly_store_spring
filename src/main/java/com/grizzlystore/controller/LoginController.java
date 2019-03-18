package com.grizzlystore.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.grizzlystore.bean.Login;
import com.grizzlystore.service.CategoryService;
import com.grizzlystore.service.LoginService;
import com.grizzlystore.service.ProductService;
//@SessionAttributes({"userName", "abc"})
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	/*
	@RequestMapping(value="Admin-Login.html", method=RequestMethod.GET)
	
	public String getLoginPage()
	{
		return "Admin-Login";
	}*/
	
	@RequestMapping(value="Admin-Login", method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login,HttpSession httpSession) 
	{
		
		ModelAndView modelAndView = new ModelAndView();

		if(loginService.authenticateUserId(login)==1)
     	{
			if(loginService.getUserStatus(login.getUserName())<=2)
		{
				if(loginService.authenticateUser(login)!=null)
				{
					if(loginService.getUserType(login).equals("A"))
					{
					modelAndView.addObject("user", loginService.authenticateUser(login));
					httpSession.setAttribute("user", loginService.authenticateUser(login));
					
					modelAndView.addObject("category",categoryService.getAllCategory());
					httpSession.setAttribute("category",categoryService.getAllCategory());
					
					modelAndView.addObject("products",productService.getAllProducts());
					httpSession.setAttribute("products",productService.getAllProducts());
			
					modelAndView.setViewName("Admin-ListProducts");
					loginService.resetUserStatus(login);
					}
					else
					{
						modelAndView.addObject("user", loginService.authenticateUser(login));
						httpSession.setAttribute("user", loginService.authenticateUser(login));
						
						modelAndView.addObject("category",categoryService.getAllCategory());
						httpSession.setAttribute("category",categoryService.getAllCategory());
						
						modelAndView.addObject("products",productService.getAllProducts());
						httpSession.setAttribute("products",productService.getAllProducts());
						
						modelAndView.addObject("inventory",productService.getInventory());
						httpSession.setAttribute("inventory",productService.getInventory());
						
						modelAndView.setViewName("Vendor-AddProduct");
						loginService.resetUserStatus(login);
					}
		}
				
				else
				{
					loginService.setUserStatus(login);
					//System.out.println("invalid Password");
					modelAndView.setViewName("Admin-Login");
					modelAndView.addObject("invalidPassword", "Invalid Password");
				}		
		}
			
		else
		{
			modelAndView.setViewName("UserDeactivated");
		}
	}
	else
	{
		System.out.println("invalid UserName");
		modelAndView.addObject("invalidUser", "Invalid Username");
		modelAndView.setViewName("Admin-Login");
	}
	return modelAndView;
	}
	
	//LogoutController
	@RequestMapping(value="LogoutController", method=RequestMethod.GET)
	public ModelAndView sortProductPage(HttpSession httpSession)
	{
		ModelAndView modelAndView = new ModelAndView();
		
		httpSession.removeAttribute("user");
		modelAndView.addObject("logoutMessage", "Logout Successful");
		httpSession.invalidate();
		modelAndView.setViewName("Admin-Login");
	
		
		return modelAndView;
	}
	
	
}

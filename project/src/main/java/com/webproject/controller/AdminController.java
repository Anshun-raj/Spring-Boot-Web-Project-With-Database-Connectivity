package com.webproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.webproject.entity.ViewerData;
import com.webproject.repository.ViewerRepository;

@Controller
public class AdminController 
{
	@Autowired
	private ViewerRepository repo;
	
    @GetMapping("/")
	public String home()
	{
	  return "home";
	}
    
    @GetMapping("/home")
	public String homeMain()
	{
	  return "home";
	}
    
    @GetMapping("/about")
	public String about()
	{
	  return "about";
	}
    
    @GetMapping("/service")
	public String service()
	{
	  return "service";
	}
    
    @GetMapping("/team")
	public String team()
	{
	  return "team";
	}
    
    @GetMapping("/contact")
	public String contact()
	{
	  return "contact";
	}
    
    @PostMapping("/contact")
    public String register(@ModelAttribute ViewerData u)
    {
 	   System.out.println(u);
 	   
 	   repo.save(u);
 	   
 	   return "redirect:/";
    }
}

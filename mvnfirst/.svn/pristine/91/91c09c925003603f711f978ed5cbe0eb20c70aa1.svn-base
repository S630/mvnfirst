package com.cn.mystudy.controller;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.cn.mystudy.model.User;  
import com.cn.mystudy.service.IUserService;  

@RequestMapping("/user") 
@Controller 
public class UserController {  
	@Autowired  
    private IUserService iuserService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.iuserService.getUserById(userId);  
        model.addAttribute("user", user);
        System.out.println(user);
        return "showUser";
    }  
}  
package com.cn.mystudy.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cn.mystudy.model.User;
import com.cn.mystudy.model.LoginInfo;
import com.cn.mystudy.service.IUserService;
import com.cn.mystudy.util.MSUtil;

@RequestMapping("/login")
@Controller
public class loginController {
    @Autowired
    private IUserService iuserService;
    private MSUtil msUtil;

    @RequestMapping("/logincheck")
    public String logincheck(HttpServletRequest request, Model model) {
        boolean loginflag = false;
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.iuserService.getUserById(userId);
        if (user != null) {
        	System.out.println("now user:"+user.getName());
            model.addAttribute("user", user);
            //登录成功记录登陆者的信息
            LoginInfo loginInfo = new LoginInfo();
            loginInfo.setUserid(user.getUserId());
            loginInfo.setIp("192.168.1.103");
            SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:ms:ss");
            Date date = new Date() ;
            loginInfo.setTime(date);
            this.iuserService.insert_loginInfo(loginInfo);
            return "showUser";
        }
        return "error/Error";
    }
}

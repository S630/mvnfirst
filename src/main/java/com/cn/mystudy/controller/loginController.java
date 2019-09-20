package com.cn.mystudy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.mystudy.model.User;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cn.mystudy.model.LoginInfo;
import com.cn.mystudy.service.IUserService;
import com.cn.mystudy.util.MSUtil;

@RequestMapping("/login")
@Controller
public class loginController {
    @Autowired
    private IUserService iuserService;
    private MSUtil msUtil;
    Logger logger = Logger.getLogger(loginController.class);

    @RequestMapping(value="/logincheck",method=RequestMethod.POST)
    public void logincheck(HttpServletRequest request,HttpServletResponse response, Model model) {
    	boolean loginflag = false;
    	String statuscode = "0";
    	String message = "";
        String passwd = request.getParameter("passwd");
        String uid = request.getParameter("id");
        int userId = Integer.parseInt((String) (uid == null ? "0" : uid));
        User user = this.iuserService.getUserById(userId);
        if (user != null) {
        	System.out.println("now user:"+user.getName());
            model.addAttribute("user", user);
            //登录成功记录登陆者的信息
            LoginInfo loginInfo = new LoginInfo();
            loginInfo.setUserid(user.getUserId());
            loginInfo.setIp(msUtil.getIp2(request));
            SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:ms:ss");
            Date date = new Date() ;
            loginInfo.setTime(date);
            this.iuserService.insert_loginInfo(loginInfo);
            statuscode = "200";
//            return "showUser";
        }else{
        	statuscode ="100";
        	message = "用户["+ user +"]不存在!";
        }
        //return "error/Error";
//        return "readme";
        PrintWriter out;
		try {
			out = response.getWriter();
			User user1 = new User();
			user1.setName("aa");
			User user2 = new User();
			user2.setName("bb");
			
			JSONArray array = new JSONArray();
			array.add(user1);
			array.add(user2);
			JSONObject object = new JSONObject();
			object.put("statuscode", statuscode);
			object.put("msg", message);
			object.put("referer", "index.html");
			logger.info(object.toJSONString());
			out.println(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}

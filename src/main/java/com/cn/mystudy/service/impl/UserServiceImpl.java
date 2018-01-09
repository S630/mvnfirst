package com.cn.mystudy.service.impl;


import javax.annotation.Resource;  
import org.springframework.stereotype.Service;
import com.cn.mystudy.dao.IUserDao;
import com.cn.mystudy.dao.IUmsUtilDao;
import com.cn.mystudy.model.User;
import com.cn.mystudy.model.LoginInfo;
import com.cn.mystudy.service.IUserService; 

@Service("UserService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUmsUtilDao msUtilDao ;
    @Resource
    private IUserDao userDao; 
    //@Override  
    public User getUserById(int userId) {  
    	User user = new User();
        // TODO Auto-generated method stub  
        try {
        	user = this.userDao.selectByPrimaryKey(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
    } 
    //@Override  
    public void insert_loginInfo(LoginInfo info) {  
    	User user = new User();
    	// TODO Auto-generated method stub
        try {
        	this.msUtilDao.insert_loginInfo(info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
  
}
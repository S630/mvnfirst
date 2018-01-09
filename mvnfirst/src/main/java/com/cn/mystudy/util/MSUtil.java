package com.cn.mystudy.util;

import com.cn.mystudy.dao.IUmsUtilDao;
import com.cn.mystudy.model.LoginInfo;
public class MSUtil {
	private IUmsUtilDao uimsUtilDao;  
	public void write_to_logininfo(LoginInfo loginInfo){
		try {
			uimsUtilDao.insert_loginInfo(loginInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

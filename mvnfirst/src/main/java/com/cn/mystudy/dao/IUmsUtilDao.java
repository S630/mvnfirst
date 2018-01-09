package com.cn.mystudy.dao;

import com.cn.mystudy.model.LoginInfo;
public interface IUmsUtilDao {


	/**
     * 用户信息
     * @param loginInfo
     * @return
     * @throws Exception
     */
    public void insert_loginInfo(LoginInfo info) throws Exception ;
	
}

package com.cn.mystudy.dao;

import com.cn.mystudy.model.User;
public interface IUserDao {

	/**
     * 用户信息
     * @param id
     * @return
     * @throws Exception
     */
    public User selectByPrimaryKey(int id) throws Exception;


}

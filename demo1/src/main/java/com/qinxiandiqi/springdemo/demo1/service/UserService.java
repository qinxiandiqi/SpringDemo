package com.qinxiandiqi.springdemo.demo1.service;

import com.qinxiandiqi.springdemo.demo1.dao.LoginLogDao;
import com.qinxiandiqi.springdemo.demo1.dao.UserDao;
import com.qinxiandiqi.springdemo.demo1.domain.LoginLog;
import com.qinxiandiqi.springdemo.demo1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jianan on 9/23/15.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginLogDao loginLogDao;

    public boolean hasMatchUser(String userName, String password){
        int matchCount = userDao.getMatchCount(userName, password);
        return matchCount > 0;
    }

    public User findUserByUserName(String userName){
        return userDao.findUserByUserName(userName);
    }

    public void loginSuccess(User user){
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());
        loginLogDao.insertLoginLog(loginLog);
    }
}

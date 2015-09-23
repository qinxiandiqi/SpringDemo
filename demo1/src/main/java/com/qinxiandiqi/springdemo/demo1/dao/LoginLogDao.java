package com.qinxiandiqi.springdemo.demo1.dao;

import com.qinxiandiqi.springdemo.demo1.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Jianan on 9/23/15.
 */
@Repository
public class LoginLogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){
        String sqlStr = "INSERT INTO t_login_log(user_id, ip, login_datetime) VALUES(?,?,?)";
        jdbcTemplate.update(sqlStr, loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate());
    }
}

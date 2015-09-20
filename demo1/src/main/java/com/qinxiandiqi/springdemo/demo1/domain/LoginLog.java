package com.qinxiandiqi.springdemo.demo1.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jianan on 9/20/15.
 */
public class LoginLog implements Serializable {

    private int loginLogId;
    private String ip;
    private int userId;
    private Date loginDate;

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}

package com.kgc.springssm.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String usernamnamee;

    private String password;

    private Integer type;

    private Date lastmodifytime;

    private Integer typeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsernamnamee() {
        return usernamnamee;
    }

    public void setUsernamnamee(String usernamnamee) {
        this.usernamnamee = usernamnamee == null ? null : usernamnamee.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}
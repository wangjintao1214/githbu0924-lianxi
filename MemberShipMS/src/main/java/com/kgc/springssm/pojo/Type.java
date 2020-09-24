package com.kgc.springssm.pojo;

public class Type {
    private Integer id;

    private String usernamnamee;

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
}
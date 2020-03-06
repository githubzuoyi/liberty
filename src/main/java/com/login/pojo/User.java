package com.login.pojo;

import java.util.Date;
import java.util.Objects;

public class User {

    private String userid;
    private String username;
    private String Password;
    private Date createTime;
    private Date updateTime;
    private String email;

    public User() {

    }

    public User(String userid, String username, String password, Date createTime, Date updateTime, String email) {
        this.userid = userid;
        this.username = username;
        Password = password;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.email = email;
    }


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userid, user.userid) &&
                Objects.equals(username, user.username) &&
                Objects.equals(Password, user.Password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, username, Password, createTime, updateTime, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", Password='" + Password + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", email='" + email + '\'' +
                '}';
    }

}

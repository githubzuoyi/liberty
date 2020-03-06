package com.login.dao;

import com.login.pojo.User;

import java.util.List;
import java.util.Map;


public interface RegisterRespository {

    public void addUser(User user);

    public void deleteUser(String username);

    public List<Map> selectUser(List userlist);

    public void updateUser(User user);

}

package com.login.dao.impl;

import com.login.dao.RegisterRespository;
import com.login.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class JdbcRegisterRespository implements RegisterRespository {

    private JdbcOperations jdbcOperations;

    private final String SQL_REGISTER_USERS = "INSERT INTO USERS(username,password,enabled) VALUES(?,?,?)";
    private final String SQL_REGISTER_AUTHORITY = "INSERT INTO AUTHORITIES(username,authority) VALUES(?,?)";

    @Autowired
    public JdbcRegisterRespository(JdbcOperations jdbcOperations){
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public void addUser(User user) {
        jdbcOperations.update(SQL_REGISTER_USERS,user.getUsername(),user.getPassword(),1);
        jdbcOperations.update(SQL_REGISTER_AUTHORITY,user.getUsername(),"user");
    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public List<Map> selectUser(List userlist) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }
}

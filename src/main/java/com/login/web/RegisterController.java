package com.login.web;

import com.login.dao.RegisterRespository;
import com.login.dao.impl.JdbcRegisterRespository;
import com.login.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

import javax.servlet.http.Part;
import java.io.IOException;

@Controller
public class RegisterController {

    @Autowired
    private JdbcRegisterRespository jdbcRegisterRespository;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String enterRegister(){

        return "login/register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@Validated User user, Errors errors) throws IOException {

        if(errors.hasErrors()){
            return "login/register";
        }


        //TODO save register info
        jdbcRegisterRespository.addUser(user);

        return "redicted:/login/success/"+user.getUsername();
    }



}

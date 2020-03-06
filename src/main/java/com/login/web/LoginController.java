package com.login.web;

import com.login.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping({"/"})
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){

        return "login/home";
    }

    @RequestMapping("/login")
    public String enterlog(){
        return "login/logindb";
    }

    @RequestMapping(value = "/login/success/{username}",method = RequestMethod.GET)
    public String loginSuccess(@PathVariable String username, Model model){

        User user = new User();//TODO:get info from LoginDao
        model.addAttribute("user",user);

        return "login/yhjbxx";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user){

        String username = user.getUsername();
        String password = user.getPassword();

        //varify the correct of username && password
        if(false){
            return "login/logindb";
        }

        return "login/yhjbxx";
        //return "redirect:/login/success/"+username;

    }


}

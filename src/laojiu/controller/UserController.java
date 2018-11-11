package laojiu.controller;

import laojiu.entity.User;
import laojiu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "use/")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("index11")
    public String homePage(){        //初始登陆页面
        return "login";
    }
    @RequestMapping("loginIn")
    public String loginIn(User user,String name,String password,HttpSession session){        //登陆
        ArrayList<Object> objects = new ArrayList<>();
        System.out.println(name);
        System.out.println(password);
        System.out.println("命运");
        System.out.println(user);
        User user1 = userService.loginIn(user);

        System.out.println(user1);
        if(user1 != null){
            session.setAttribute("user",user1);
            return "userList";
        }
        return "login";
    }
}

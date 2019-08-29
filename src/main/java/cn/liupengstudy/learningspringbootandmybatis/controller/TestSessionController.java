package cn.liupengstudy.learningspringbootandmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/addSession")
public class TestSessionController {

    @RequestMapping("say")
    public String sayHelloWorld() {
        return "Hello World!";
    }

    @RequestMapping("dome")
    public String demo(HttpServletRequest request){
        //这就是session的创建
        HttpSession session =request.getSession();
        //以秒为单位，即在没有活动30分钟后，session将失效
        session.setMaxInactiveInterval(30*60);
        //给session添加属性属性name： username,属性 value：TOM
        session.setAttribute("username","TOM");
        //添加属性 name: password; value: tommmm
        session.setAttribute("password","tommmm");
        System.out.println(session.getId());
        return "Session Setting Success";
    }

    @RequestMapping("paly")
    public String getSession(HttpServletRequest request) {
        //这就是session的创建
        HttpSession session =request.getSession();
        String userName = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        System.out.println(userName);
        System.out.println(password);
        System.out.println(session.getId());
        return userName + password;
    }

}

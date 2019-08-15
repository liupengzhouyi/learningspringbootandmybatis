package cn.liupengstudy.learningspringbootandmybatis.controller;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
import cn.liupengstudy.learningspringbootandmybatis.service.impl.UserLandingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class PalyController {

    // @Autowired(required=true)
    @Autowired
    private UserLandingServiceImpl userLandingService;

    @RequestMapping("say")
    public String sayHelloWorld() {
        return "Hello World!";
    }

    @RequestMapping("saveLanding")
    public String saveLanding() {
        System.out.println("hhhhhhhhhhhhhyyikjbj");
        UserLanding userLanding = new UserLanding();
        userLanding.setUserid("liupeng123456");
        userLanding.setLandingdate("2019-08-14");
        userLanding.setLandingtime("23:40");
        userLanding.setLandingipadress("127.0.0.1");
        userLanding.setLandinglatitude("");
        userLanding.setLandinglongitude("");
        userLanding.setLandingphonenumber("14747219744");
        userLanding.setLandingemail("liupeng.0@outlook.com");
        userLanding.setLandingverificationcode("213478");
        userLanding.setLandingresults(1);
        System.out.println(userLanding.toString());
        int number = 0;
        number = userLandingService.insert(userLanding);
        return number + "";
    }


}

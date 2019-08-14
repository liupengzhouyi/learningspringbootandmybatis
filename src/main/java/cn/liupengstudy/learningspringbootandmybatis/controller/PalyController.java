package cn.liupengstudy.learningspringbootandmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class PalyController {


    @Autowired(required=true)
    private UserLandingServiceImpl userLandingService;

    @RequestMapping("say")
    public String sayHelloWorld() {
        return "Hello World!";
    }

    @RequestMapping("saveLanding")
    public String saveLanding() {
        UserLanding userLanding = new UserLanding();
        userLanding.setUserid("liupeng123456");
        userLanding.setLandingdate("2019-08-14");
        userLanding.setLandingtime("23:40");
        userLanding.setLandingipadress("127.0.0.1");
        userLanding.setLandingphonenumber("14747219744");
        userLanding.setLandingverificationcode("213478");
        userLanding.getLandingresults(new Integer(1));
        int number = userLandingService.insert(userLanding);
        return number + "";
    }


}

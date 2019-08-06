package cn.liupengstudy.learningspringbootandmybatis;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class PalyController {

    @RequestMapping("say")
    public String sayHelloWorld() {
        return "Hello World!";
    }
}

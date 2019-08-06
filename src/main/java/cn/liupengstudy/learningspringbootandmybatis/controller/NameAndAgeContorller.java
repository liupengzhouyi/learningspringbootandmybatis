package cn.liupengstudy.learningspringbootandmybatis.controller;

import cn.liupengstudy.learningspringbootandmybatis.pojo.NameAndAge;
import cn.liupengstudy.learningspringbootandmybatis.service.impl.NameAndAgeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nameAndAge")
public class NameAndAgeContorller {

    @Autowired(required=true)
    private NameAndAgeServiceImpl nameAndAgeService;

    @RequestMapping("save")
    public String save() {
        NameAndAge nameAndAge = new NameAndAge();
        nameAndAge.setName("test");
        nameAndAge.setAge(23);
        int number = this.nameAndAgeService.insert(nameAndAge);
        return "" + number;
    }

}

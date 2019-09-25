package cn.liupengstudy.learningspringbootandmybatis.controller;

import cn.liupengstudy.learningspringbootandmybatis.pojo.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "Json相关接口")
@RestController
@RequestMapping(value = "/person")
public class JsonController {

    @ApiOperation(value = "获取Json数据")
    @RequestMapping(value = "/getPerson", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Map<String, Object> getPerson(@RequestBody Person person) {
        System.out.println(person);
        Person person1 = person;
        System.out.println(person1.toString());
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("person", person);
        return param;
    }

}

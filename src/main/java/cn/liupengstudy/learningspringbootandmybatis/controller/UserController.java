package cn.liupengstudy.learningspringbootandmybatis.controller;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
@RestController
@RequestMapping("/UserLanding")
public class UserController {

    @ApiOperation("新增用户接口")
    @PostMapping("/add")
    public boolean addUserLanding(@RequestBody UserLanding UserLanding) {
        return false;
    }

    @GetMapping("/find/{id}")
    public UserLanding findById(@PathVariable("id") int id) {
        return new UserLanding();
    }

    @PutMapping("/update")
    public boolean update(@RequestBody UserLanding UserLanding) {
        return true;
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
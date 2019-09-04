package cn.liupengstudy.learningspringbootandmybatis.controller;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserLanding")
public class UserController {
=======
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
@RestController
@RequestMapping("/UserLanding")
public class UserController {

    @ApiOperation("新增用户接口")
>>>>>>> origin/master
    @PostMapping("/add")
    public boolean addUserLanding(@RequestBody UserLanding UserLanding) {
        return false;
    }
<<<<<<< HEAD
=======

>>>>>>> origin/master
    @GetMapping("/find/{id}")
    public UserLanding findById(@PathVariable("id") int id) {
        return new UserLanding();
    }
<<<<<<< HEAD
=======

>>>>>>> origin/master
    @PutMapping("/update")
    public boolean update(@RequestBody UserLanding UserLanding) {
        return true;
    }
<<<<<<< HEAD
=======

>>>>>>> origin/master
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
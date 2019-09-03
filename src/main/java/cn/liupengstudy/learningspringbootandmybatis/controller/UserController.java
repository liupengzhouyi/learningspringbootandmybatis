package cn.liupengstudy.learningspringbootandmybatis.controller;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserLanding")
public class UserController {
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
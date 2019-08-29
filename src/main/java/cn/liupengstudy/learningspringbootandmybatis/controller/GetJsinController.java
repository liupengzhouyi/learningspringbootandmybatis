package cn.liupengstudy.learningspringbootandmybatis.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getJsonB")
public class GetJsinController {

    // 直接通过@RequestBody 的方式，直接将json的数据注入到了JSONObject里面了。
    // param jsonobject 这个是阿里的 fastjson对象
    @RequestMapping(value = "/active", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String active(@RequestBody ActiveRequest request) {
        System.out.println(request.toString());
        return "active";
    }

}

class ActiveRequest {

    private String sid;

    private String biz;

    private String text;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getBiz() {
        return biz;
    }

    public void setBiz(String biz) {
        this.biz = biz;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ActiveRequest{" +
                "sid='" + sid + '\'' +
                ", biz='" + biz + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
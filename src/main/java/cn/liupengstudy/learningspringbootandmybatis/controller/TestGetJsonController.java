package cn.liupengstudy.learningspringbootandmybatis.controller;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

/**
 * author: liupeng
 * date: 2019年8月27日 21点40分
 */
@RestController
@RequestMapping("/getJson")
public class TestGetJsonController {

    @RequestMapping("printJson")
    public String saveLanding(HttpServletRequest httpServletRequest) {

        //获取到JSONObject
        JSONObject jsonParam = this.getJSONParam(request);

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "request");
        result.put("data", jsonParam);

        return result.toJSONString();

        return "null";
    }
}

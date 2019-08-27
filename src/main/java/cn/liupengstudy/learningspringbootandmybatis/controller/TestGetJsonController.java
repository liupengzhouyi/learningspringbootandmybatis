package cn.liupengstudy.learningspringbootandmybatis.controller;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * author: liupeng
 * date: 2019年8月27日 21点40分
 */
@RestController
@RequestMapping("/getJson")
public class TestGetJsonController {

    @RequestMapping("printJson")
    public String saveLanding(HttpServletRequest httpServletRequest) throws JSONException {
        //获取到JSONObject
        JSONObject jsonParam = this.getJSONParam(httpServletRequest);
        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "request");
        result.put("data", jsonParam);
        return result.toJSONString();
    }

    public JSONObject getJSONParam(HttpServletRequest request){
        JSONObject jsonParam = null;
        try {
            // 获取输入流
            BufferedReader streamReader = new BufferedReader(
                    new InputStreamReader(
                            request.getInputStream(),
                            "UTF-8")
            );
            // 写入数据到Stringbuilder
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = streamReader.readLine()) != null) {
                sb.append(line);
            }
            jsonParam = JSONObject.parseObject(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonParam;
    }
}

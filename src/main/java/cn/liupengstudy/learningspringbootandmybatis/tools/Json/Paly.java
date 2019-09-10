package cn.liupengstudy.learningspringbootandmybatis.tools.Json;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class Paly {
    public static void main(String[] args) throws IOException, JSONException {
        ObjectMapper mapper = new ObjectMapper();

        JavaBean javaBean = new JavaBean("liupeng", 12);

        // 序列化
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(javaBean);

        System.out.println(jsonString);

        String string = "{\"name\":\"liupeng\",\"age\":12}";

        JSONObject json1 = new JSONObject();
        json1.put("name", "anne");
        json1.put("age", 15);

        String d1 = json1.toString();
        System.out.println(d1);

        Student s1 = mapper.readValue("{\"name\":\"anne\",\"age\":15}", Student.class);
        System.out.println(s1.toString());

        // 反序列化
        Student javaBean1 = mapper.readValue("{\"name\":\"anne\",\"age\":15}", Student.class);
        System.out.println(javaBean1.toString());
    }
}

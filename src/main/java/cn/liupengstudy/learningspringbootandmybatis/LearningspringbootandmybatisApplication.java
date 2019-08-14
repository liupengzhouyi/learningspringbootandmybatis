package cn.liupengstudy.learningspringbootandmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("cn.liupengstudy.learningspringbootandmybatis")
public class LearningspringbootandmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningspringbootandmybatisApplication.class, args);
    }



}

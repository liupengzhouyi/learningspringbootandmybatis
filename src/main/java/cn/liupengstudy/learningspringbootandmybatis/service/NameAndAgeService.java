package cn.liupengstudy.learningspringbootandmybatis.service;

import cn.liupengstudy.learningspringbootandmybatis.pojo.NameAndAge;

public interface NameAndAgeService {

    int insert(NameAndAge record);

    int insertSelective(NameAndAge record);

}

package cn.liupengstudy.learningspringbootandmybatis.mapper;

import cn.liupengstudy.learningspringbootandmybatis.pojo.NameAndAge;

public interface NameAndAgeMapper {
    int insert(NameAndAge record);

    int insertSelective(NameAndAge record);
}
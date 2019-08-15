package cn.liupengstudy.learningspringbootandmybatis.mapper;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;

public interface UserLandingMapper {
    int deleteByPrimaryKey(Integer mainkey);

    int insert(UserLanding record);

    int insertSelective(UserLanding record);

    UserLanding selectByPrimaryKey(Integer mainkey);

    int updateByPrimaryKeySelective(UserLanding record);

    int updateByPrimaryKey(UserLanding record);
}
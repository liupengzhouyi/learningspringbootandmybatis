package cn.liupengstudy.learningspringbootandmybatis.mapper;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;

public interface UserLandingMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UserLanding record);

    int insertSelective(UserLanding record);

    UserLanding selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserLanding record);

    int updateByPrimaryKey(UserLanding record);
}
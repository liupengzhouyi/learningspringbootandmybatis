package cn.liupengstudy.learningspringbootandmybatis.service;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;

public interface UserLandingService {

    int deleteByPrimaryKey(String userid);

    int insert(UserLanding record);

    int insertSelective(UserLanding record);

    UserLanding selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserLanding record);

    int updateByPrimaryKey(UserLanding record);
}

package cn.liupengstudy.learningspringbootandmybatis.service;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLandingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLandingService {

    int countByExample(UserLandingExample example);

    int deleteByExample(UserLandingExample example);

    int deleteByPrimaryKey(String userid);

    int insert(UserLanding record);

    int insertSelective(UserLanding record);

    List<UserLanding> selectByExample(UserLandingExample example);

    UserLanding selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") UserLanding record, @Param("example") UserLandingExample example);

    int updateByExample(@Param("record") UserLanding record, @Param("example") UserLandingExample example);

    int updateByPrimaryKeySelective(UserLanding record);

    int updateByPrimaryKey(UserLanding record);

}

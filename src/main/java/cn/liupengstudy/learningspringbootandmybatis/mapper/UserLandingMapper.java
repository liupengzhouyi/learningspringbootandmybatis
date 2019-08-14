package cn.liupengstudy.learningspringbootandmybatis.mapper;

import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLandingExample;
import org.apache.ibatis.annotations.Param;

public interface UserLandingMapper {
    int deleteByExample(UserLandingExample example);

    int deleteByPrimaryKey(String userid);

    int insert(UserLanding record);

    int insertSelective(UserLanding record);

    UserLanding selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") UserLanding record, @Param("example") UserLandingExample example);

    int updateByExample(@Param("record") UserLanding record, @Param("example") UserLandingExample example);

    int updateByPrimaryKeySelective(UserLanding record);

    int updateByPrimaryKey(UserLanding record);
}
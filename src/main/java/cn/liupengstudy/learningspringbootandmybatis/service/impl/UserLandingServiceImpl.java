package cn.liupengstudy.learningspringbootandmybatis.service.impl;

import cn.liupengstudy.learningspringbootandmybatis.mapper.UserLandingMapper;
import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
import cn.liupengstudy.learningspringbootandmybatis.service.UserLandingService;
import jdk.jfr.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserLandingServiceImpl implements UserLandingService {

    @Autowired
    private UserLandingMapper userLandingMapper;

    @Override
    public int deleteByPrimaryKey(String userid) {
        return 0;
    }

    @Override
    public int insert(UserLanding record) {
        return this.userLandingMapper.insert(record);
    }

    @Override
    public int insertSelective(UserLanding record) {
        return 0;
    }

    @Override
    public UserLanding selectByPrimaryKey(String userid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserLanding record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserLanding record) {
        return 0;
    }
}

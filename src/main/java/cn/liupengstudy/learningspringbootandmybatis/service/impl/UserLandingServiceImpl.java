package cn.liupengstudy.learningspringbootandmybatis.service.impl;

import cn.liupengstudy.learningspringbootandmybatis.mapper.UserLandingMapper;
import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLanding;
import cn.liupengstudy.learningspringbootandmybatis.pojo.UserLandingExample;
import cn.liupengstudy.learningspringbootandmybatis.service.UserLandingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserLandingServiceImpl implements UserLandingService {

    @Autowired
    private UserLandingMapper userLandingMapper;

    @Override
    public int countByExample(UserLandingExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserLandingExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String userid) {
        return 0;
    }

    @Override
    public int insert(UserLanding record) {
        return 0;
    }

    @Override
    public int insertSelective(UserLanding record) {
        return 0;
    }

    @Override
    public List<UserLanding> selectByExample(UserLandingExample example) {
        return null;
    }

    @Override
    public UserLanding selectByPrimaryKey(String userid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UserLanding record, UserLandingExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserLanding record, UserLandingExample example) {
        return 0;
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

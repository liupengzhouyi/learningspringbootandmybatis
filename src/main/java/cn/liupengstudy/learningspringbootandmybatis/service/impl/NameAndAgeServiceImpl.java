package cn.liupengstudy.learningspringbootandmybatis.service.impl;

import cn.liupengstudy.learningspringbootandmybatis.mapper.NameAndAgeMapper;
import cn.liupengstudy.learningspringbootandmybatis.pojo.NameAndAge;
import cn.liupengstudy.learningspringbootandmybatis.service.NameAndAgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class NameAndAgeServiceImpl implements NameAndAgeService {

    @Autowired
    private NameAndAgeMapper nameAndAgeMapper;

    @Override
    public int insert(NameAndAge record) {
        return nameAndAgeMapper.insert(record);
    }

    @Override
    public int insertSelective(NameAndAge record) {
        return 0;
    }
}

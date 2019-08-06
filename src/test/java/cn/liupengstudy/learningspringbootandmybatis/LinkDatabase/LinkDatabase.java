package cn.liupengstudy.learningspringbootandmybatis.LinkDatabase;

import java.sql.Connection;

public interface LinkDatabase {

    Connection getConnection();

}

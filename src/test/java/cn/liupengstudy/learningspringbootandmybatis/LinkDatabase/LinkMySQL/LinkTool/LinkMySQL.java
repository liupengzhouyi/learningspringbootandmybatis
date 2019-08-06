package cn.liupengstudy.learningspringbootandmybatis.LinkDatabase.LinkMySQL.LinkTool;



import cn.liupengstudy.learningspringbootandmybatis.LinkDatabase.LinkDatabase;

import java.sql.Connection;
import java.sql.SQLException;

public interface LinkMySQL extends LinkDatabase {

    Connection getConnection();

    void createConnection() throws ClassNotFoundException, SQLException;

    void createConnection(String url, String userName, String password) throws SQLException, ClassNotFoundException;

}



/*
package cn.liupengstudy.learningspringbootandmybatis.test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class likeDaoImpl implements likeDao {

    @Override
    public int addNumber(like like) {
        String sql = "insert into like(replyId, likeUser, likeType) value (?, ?, ?)";
        Object[] params = new Object[3];
        params[0] = like.getReplyId();
        params[1] = like.getLikeUser();
        params[2] = like.getLikeType();

        int i = executeIUD(sql,params);
        return i;
    }

    @Override
    public int getLikeByUser(String likeUser) throws SQLException {
        String sql = "select COUNT(*) from `like` where likeType = 1 and likeUser =?";
        Object[] params = new Object[1];
        params[0] = likeUser;
        ResultSet rs = executeSelect(sql,params);
        int number = 0;
        while(rs.next()){
            number = rs.getInt(1);
        }
        return number;
    }

    @Override
    public int getUnLikeByUser(String likeUser) throws SQLException {
        String sql = "select COUNT(*) from `like` where likeType = 0 and likeUser =?";
        Object[] params = new Object[1];
        params[0] = likeUser;
        ResultSet rs = executeSelect(sql,params);
        int number = 0;
        while(rs.next()){
            number = rs.getInt(1);
        }
        return number;
    }

    @Override
    public int getLikeByReplyId(String ReplyID) throws SQLException {
        String sql = "select COUNT(*) from `like` where likeType = 1 and replyId =?";
        Object[] params = new Object[1];
        params[0] = ReplyID;
        ResultSet rs = executeSelect(sql,params);
        int number = 0;
        while(rs.next()){
            number = rs.getInt(1);
        }
        return number;
    }

    @Override
    public int getUnLikeByReplyId(String ReplyID) throws SQLException {
        String sql = "select COUNT(*) from `like` where likeType = 0 and replyId =?";
        Object[] params = new Object[1];
        params[0] = ReplyID;
        ResultSet rs = executeSelect(sql,params);
        int number = 0;
        while(rs.next()){
            number = rs.getInt(1);
        }
        return number;
    }
}
*/

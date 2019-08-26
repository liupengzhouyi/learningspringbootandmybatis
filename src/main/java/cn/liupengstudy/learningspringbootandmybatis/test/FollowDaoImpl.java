/*
package cn.liupengstudy.learningspringbootandmybatis.test;


import java.sql.SQLException;

*/
/**
 * function: interface for follow other!
 * author: liupeng
 * date time: 2019年8月26日 20点37分
 * contact:
 *//*

public class FollowDaoImpl implements FollowDao {

    */
/**
     * function:关注别人
     * 步骤：
     * 1. 添加关注关系
     * 2. 更新关注人数
     * @param myUserID
     * @param otherUserID
     * @return
     *//*

    @Override
    public int follow(String myUserID, String otherUserID) throws SQLException {
        String sql = "insert into follow(username, followUser) value (?, ?);";
        Object[] params = new Object[2];
        params[0] = myUserID;
        params[1] = otherUserID;
        int i = executeIUD(sql,params);
        UserDao userDao = new UserDaoImpl();
        // 我的关注数量 +1
        userDao.addFunsNumber(myUserID);
        // 他的被关注数量 +1
        userDao.addFollowNumber(otherUserID);
        return i;

    }

    @Override
    public int unFollow(String myUserID, String otherUserID) throws SQLException {
        String sql = "delete follow where username =? and followUser =?";
        Object[] params = new Object[2];
        params[0] = myUserID;
        params[1] = otherUserID;
        int i = executeIUD(sql,params);
        UserDao userDao = new UserDaoImpl();
        // 我的关注数量 -1
        userDao.delFunsNumber(myUserID);
        // 他的被关注数量 -1
        userDao.delFollowNumber(otherUserID);
        return i;
    }
}
*/

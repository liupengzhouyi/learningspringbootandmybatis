package cn.liupengstudy.learningspringbootandmybatis.test;

import java.sql.SQLException;

/**
 * like DAO
 * author: LiMingXiu
 * date-time: 2019-08-28 10:45
 */
public interface likeDao {

    /**
     * function: 添加某一个用户对某一个回答的表态
     * @param like
     * @return
     */
    public int addNumber(like like);

    /**
     * function: 返回某一个用户喜欢了多少回答
     * @param likeUser 用户ID
     * @return
     */
    int getLikeByUser(String likeUser) throws SQLException;

    /**
     * function: 返回某一个用户不喜欢多少回答
     * @param likeUser
     * @return
     */
    int getUnLikeByUser(String likeUser) throws SQLException;

    /**
     * function： 返回一个问题被多少用户喜欢
     * @param ReplyID 回答的ID
     * @return
     */
    int getLikeByReplyId(String ReplyID) throws SQLException;

    /**
     * 返回一个回答被多少人不喜欢
     * @param ReplyID 回答的ID
     * @return
     */
    int getUnLikeByReplyId(String ReplyID) throws SQLException;

}

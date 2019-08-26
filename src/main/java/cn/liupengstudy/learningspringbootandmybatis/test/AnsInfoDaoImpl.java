/*
package cn.liupengstudy.learningspringbootandmybatis.test;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

*/
/**
 * author：李明秀
 * date: 2019年8月26日 11点06分
 * contact:
 *//*

public class AnsInfoDaoImpl implements AnsInfoDao {
    @Override
    public int addAns(Reply ans) {
        String sql = "insert into reply(replyId, replyQuesID, replyText, replyUser, replyLikes, replyUnlikes, replyComments, replyDate) VALUE (?, ?, ?, ?, ?, ?, ?, ?)";

        Object[] params = new Object[8];
        params[0] = ans.getReplyId();
        params[1] = ans.getReplyQuesId();
        params[2] = ans.getReplyText();
        params[3] = ans.getReplyUser();
        params[4] = ans.getReplyLikes();
        params[5] = ans.getReplyUnlikes();
        params[6] = ans.getReplyComments();
        params[7] = ans.getReplyDate();

        int i = executeIUD(sql,params);
        return i;
    }

    @Override
    public int deleteAns(int ans_id) {
        String sql = "DELETE FROM reply where replyId =?";

        Object[] params = new Object[1];
        params[0] = ans_id;

        int i = executeIUD(sql,params);
        return i;
    }

    @Override
    public List<Reply> showAns(int ques_id) {
        List<Reply> list = new ArrayList<Reply>();
        try{
            String sql = "select * from reply where replyQuesID =?";

            Object[] params = new Object[1];
            params[0] = ques_id;

            ResultSet rs = executeSelect(sql,params);

            while(rs.next()){
                Reply reply = new Reply();
                reply.setReplyId(rs.getInt(1));
                reply.setReplyQuesId(rs.getInt(2));
                reply.setReplyText(rs.getString(3));
                reply.setReplyUser(rs.getString(4));
                reply.setReplyLikes(rs.getInt(5));
                reply.setReplyUnlikes(rs.getInt(6));
                reply.setReplyComments(rs.getInt(7));
                reply.setReplyDate(rs.getDate(8));
                list.add(reply);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Reply> showAnswerByUser(String user) {
        List<Reply> list = new ArrayList<Reply>();
        try{
            String sql = "select * from reply where replyUser =?";
            Object[] params = new Object[2];
            params[0] = user;

            ResultSet rs = executeSelect(sql,params);

            while(rs.next()){
                Reply reply = new Reply();
                reply.setReplyId(rs.getInt(1));
                reply.setReplyQuesId(rs.getInt(2));
                reply.setReplyText(rs.getString(3));
                reply.setReplyUser(rs.getString(4));
                reply.setReplyLikes(rs.getInt(5));
                reply.setReplyUnlikes(rs.getInt(6));
                reply.setReplyComments(rs.getInt(7));
                reply.setReplyDate(rs.getDate(8));
                list.add(reply);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    */
/**
     * 删除所有评论
     * @param ans_id
     * @return
     *//*

    @Override
    public int deleteAllCom(int ans_id) {
        String sql = "DELETE FROM comment where replyId =?";
        String sql1 = "UPDATE reply SET replyComments = 0";
        Object[] params = new Object[1];
        params[0] = ans_id;
        // 归0
        executeIUD(sql1);
        // 删除
        int i = executeIUD(sql,params);
        return i;
    }
}
*/

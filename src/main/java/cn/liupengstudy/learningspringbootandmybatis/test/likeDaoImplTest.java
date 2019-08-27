/*
package cn.liupengstudy.learningspringbootandmybatis.test;

import java.sql.SQLException;

public class likeDaoImplTest {

    private likeDao likeDao = new likeDaoImpl();

    public cn.liupengstudy.learningspringbootandmybatis.test.likeDao getLikeDao() {
        return likeDao;
    }

    public void testAdd() {
        System.out.println("----------add test start ! -----------");
        like like = new like();
        like.setLikeUser("liupeng");
        like.setReplyId(999);
        like.setLikeType("1");
        this.getLikeDao().addNumber(like);
        System.out.println("----------add test over ! -----------");
    }

    public void testLikeByID() throws SQLException {
        System.out.println("----------get like test start ! -----------");
        System.out.println("喜欢的数量：" + this.getLikeDao().getLikeByReplyId("999"));
        System.out.println("----------get like test over ! -----------");
    }

    public void testUnLikeByID() throws SQLException {
        System.out.println("----------get like test start ! -----------");
        System.out.println("不喜欢的数量：" + this.getLikeDao().getUnLikeByReplyId("999"));
        System.out.println("----------get like test over ! -----------");
    }

    public void setLikeDao(cn.liupengstudy.learningspringbootandmybatis.test.likeDao likeDao) {
        this.likeDao = likeDao;
    }

    public static void main(String[] args) throws SQLException {

        likeDaoImplTest test = new likeDaoImplTest();

        test.testAdd();

        test.testLikeByID();

        test.testUnLikeByID();

    }
}
*/

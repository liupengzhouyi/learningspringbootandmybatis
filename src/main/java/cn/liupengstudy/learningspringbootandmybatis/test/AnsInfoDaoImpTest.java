/*
package cn.liupengstudy.learningspringbootandmybatis.test;

import java.util.Date;

public class AnsInfoDaoImpTest {

    private AnsInfoDaoImpl ansInfoDao = new AnsInfoDaoImpl();

    public AnsInfoDaoImpl getAnsInfoDao() {
        return ansInfoDao;
    }

    public void setAnsInfoDao(AnsInfoDaoImpl ansInfoDao) {
        this.ansInfoDao = ansInfoDao;
    }

    public void testAdd() {
        System.out.println("---------------------------");
        System.out.println("|          test add ans   |");
        System.out.println("---------------------------");

        Reply ans = new Reply();
        ans.setReplyUser("liMingXiu");
        ans.setReplyId(999);
        ans.setReplyQuesId(999);
        ans.setReplyText("666");
        ans.setReplyLikes(20);
        ans.setReplyLikes(10);
        ans.setReplyComments(10);
        ans.setReplyDate(new Date());

        this.getAnsInfoDao().addAns(ans);

        System.out.println("-------------end-----------");
    }

    public static void main(String[] args) {
        AnsInfoDaoImpTest ansInfoDaoImpTest = new AnsInfoDaoImpTest();
        ansInfoDaoImpTest.testAdd();
    }
}
*/

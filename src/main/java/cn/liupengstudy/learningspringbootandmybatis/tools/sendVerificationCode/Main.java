package cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode;

public class Main {
    public static void main(String[] args) {
        Verify verify = new Verify("14747219744");
        verify.setVerficationCode("125864");
        System.out.println(verify.isKey());
    }
}

package cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode.base;

import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.CreateRandomNumber;
import cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode.util.SendCode;

public class SendVerficationCode {

    /**
     * 成员变量：手机号码
     */
    private String phoneNumber;

    /**
     * 成员变量： 验证码
     */
    private String VerficationCode;

    /**
     * 成员变量： 返回代码
     */
    private int returnCode;

    /**
     * 构造函数
     * @param phoneNumber
     */
    public SendVerficationCode(String phoneNumber) {
        this.setPhoneNumber(phoneNumber);
        //生成验证码
        this.createRandomNumber();
        // 发送验证码
        this.send();
    }

    /**
     *  成员函数：生成随机码
     */
    public void createRandomNumber() {
        CreateRandomNumber createRandomNumber;
        createRandomNumber = new CreateRandomNumber(3, 6);
        this.setVerficationCode(createRandomNumber.getRandomNumbers());
    }

    /**
     * 发送验证码
     * 查看时候发送
     * 返回错误原因
     * @return
     */
    public boolean send() {
        SendCode sendCode = new SendCode(this.getPhoneNumber(), this.getVerficationCode());
        // KEY : 表示发送
        boolean key = false;
        if (1==2) {
            key = true;
            this.setReturnCode(404);
        } else {
            this.setReturnCode(500);
        }
        return key;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVerficationCode() {
        return VerficationCode;
    }

    public void setVerficationCode(String verficationCode) {
        VerficationCode = verficationCode;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }
}

package cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode.util;

/**
 * 发送验证码类
 * 参数：手机号码+验证码
 */
public class SendCode {

    /**
     * 成员变量：手机号码
     */
    private String phoneNumber;

    /**
     * 成员变量： 验证码
     */
    private String VerficationCode;

    public SendCode(String phoneNumber, String verficationCode) {
        this.phoneNumber = phoneNumber;
        VerficationCode = verficationCode;
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
}

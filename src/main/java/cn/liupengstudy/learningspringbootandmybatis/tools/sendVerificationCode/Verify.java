package cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode;

import cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode.base.ContrastVerificationCode;
import cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode.base.SendVerficationCode;

public class Verify {

    private boolean key;

    private String phoneNumber;

    private SendVerficationCode sendVerficationCode;

    private ContrastVerificationCode contrastVerificationCode;

    private String VerficationCode;

    public Verify(String phoneNumber) {
        this.setPhoneNumber(phoneNumber);
        // 发送信息
        this.createSendVerficationCode();
    }

    public void createSendVerficationCode() {
        this.sendVerficationCode = new SendVerficationCode(this.getPhoneNumber());
    }

    /**
     * 验证验证码
     * @return
     */
    public boolean createContrastVerificationCode() {
        this.contrastVerificationCode = new ContrastVerificationCode(
                this.getSendVerficationCode().getVerficationCode(),
                this.getVerficationCode());
        return this.getContrastVerificationCode().isKey();
    }

    public void doVerify() {

    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SendVerficationCode getSendVerficationCode() {
        return sendVerficationCode;
    }

    public void setSendVerficationCode(SendVerficationCode sendVerficationCode) {
        this.sendVerficationCode = sendVerficationCode;
    }

    public ContrastVerificationCode getContrastVerificationCode() {
        return contrastVerificationCode;
    }

    public void setContrastVerificationCode(ContrastVerificationCode contrastVerificationCode) {
        this.contrastVerificationCode = contrastVerificationCode;
    }

    public String getVerficationCode() {
        return VerficationCode;
    }

    /**
     * 设置用户输入的验证码
     * @param verficationCode
     */
    public void setVerficationCode(String verficationCode) {
        VerficationCode = verficationCode;
    }
}

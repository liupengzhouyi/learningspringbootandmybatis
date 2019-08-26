package cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SendCodeTest {

    private SendCode sendCode;

    public SendCode getSendCode() {
        return sendCode;
    }

    public void setSendCode(SendCode sendCode) {
        this.sendCode = sendCode;
    }

    @BeforeEach
    void setUp() {
        this.sendCode = new SendCode("15004725734", "111111");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPhoneNumber() {
        System.out.println(this.getSendCode().getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
    }

    @Test
    void getVerficationCode() {
        System.out.println(this.getSendCode().getVerficationCode());
    }

    @Test
    void setVerficationCode() {
    }
}
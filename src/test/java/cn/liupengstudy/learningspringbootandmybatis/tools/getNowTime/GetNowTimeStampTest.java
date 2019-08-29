package cn.liupengstudy.learningspringbootandmybatis.tools.getNowTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNowTimeStampTest {

    private GetNowTimeStamp getNowTimeStamp;

    public GetNowTimeStamp getGetNowTimeStamp() {
        return getNowTimeStamp;
    }

    public void setGetNowTimeStamp(GetNowTimeStamp getNowTimeStamp) {
        this.getNowTimeStamp = getNowTimeStamp;
    }

    @BeforeEach
    void setUp() {
        this.getNowTimeStamp = new GetNowTimeStamp();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void function() {
        System.out.println(this.getNowTimeStamp.getInformation());
    }
}
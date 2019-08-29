package cn.liupengstudy.learningspringbootandmybatis.tools.GetNowTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetNowTimeTest {

    private GetNowTime getNowTime;

    public GetNowTime getGetNowTime() {
        return getNowTime;
    }

    public void setGetNowTime(GetNowTime getNowTime) {
        this.getNowTime = getNowTime;
    }

    @BeforeEach
    void setUp() {
        this.getNowTime = new GetNowTime();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void function() {
        System.out.println(this.getGetNowTime().getInformation());
    }
}
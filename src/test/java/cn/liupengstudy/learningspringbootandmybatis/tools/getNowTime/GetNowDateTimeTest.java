package cn.liupengstudy.learningspringbootandmybatis.tools.getNowTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNowDateTimeTest {

    private GetNowDateTime getNowDateTime;

    public GetNowDateTime getGetNowDateTime() {
        return getNowDateTime;
    }

    public void setGetNowDateTime(GetNowDateTime getNowDateTime) {
        this.getNowDateTime = getNowDateTime;
    }

    @BeforeEach
    void setUp() {
        this.getNowDateTime = new GetNowDateTime();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void function() {
        System.out.println(this.getGetNowDateTime().getInformation());
    }
}
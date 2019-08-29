package cn.liupengstudy.learningspringbootandmybatis.tools.getNowTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNowDateTest {

    private GetNowDate getNowDate;

    public GetNowDate getGetNowDate() {
        return getNowDate;
    }

    public void setGetNowDate(GetNowDate getNowDate) {
        this.getNowDate = getNowDate;
    }

    @BeforeEach
    void setUp() {
        this.getNowDate = new GetNowDate();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void function() {
        System.out.println(this.getGetNowDate().getInformation());
    }
}
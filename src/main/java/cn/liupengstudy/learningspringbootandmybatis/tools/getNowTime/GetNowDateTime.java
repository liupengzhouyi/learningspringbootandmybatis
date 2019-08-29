package cn.liupengstudy.learningspringbootandmybatis.tools.getNowTime;

import java.text.SimpleDateFormat;

public class GetNowDateTime extends BaseTime{

    /**
     * constructors
     */
    public GetNowDateTime() {
        super();
        this.function();
    }

    /**
     * core function : get date time
     */
    public void function() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.setInformation(dateFormat.format(this.getDate()));
    }
}

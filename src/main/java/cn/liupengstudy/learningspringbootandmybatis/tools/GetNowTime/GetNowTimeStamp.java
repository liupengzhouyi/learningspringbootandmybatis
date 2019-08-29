package cn.liupengstudy.learningspringbootandmybatis.tools.GetNowTime;

public class GetNowTimeStamp extends BaseTime {

    /**
     * 构造函数
     */
    public GetNowTimeStamp() {
        super();
        this.function();
    }

    /**
     * core function: get time stamp
     */
    public void function(){
        this.setInformation(this.getDate().getTime() + "");
    }
}

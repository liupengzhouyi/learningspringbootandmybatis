package cn.liupengstudy.learningspringbootandmybatis.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "电话")
public class Phone {

    @ApiModelProperty(value = "运营商")
    private String operator;

    @ApiModelProperty(value = "电话号码")
    private String phoneNum;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "operator='" + operator + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}

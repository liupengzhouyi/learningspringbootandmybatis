package cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.IOException;

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

    /**
     * 成员变量：URL
     */
    private static String Url = "http://106.ihuyi.com/webservice/sms.php?method=Submit";

    public SendCode(String phoneNumber, String verficationCode) {
        this.setPhoneNumber(phoneNumber);
        this.setVerficationCode(verficationCode);
        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(Url);

        client.getParams().setContentCharset("UTF-8");
        method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=GBK");

        //int mobile_code = (int)((Math.random()*9+1)*100000);

        String content = new String("您的验证码是：" + this.getVerficationCode() + "。请不要把验证码泄露给其他人。");

        NameValuePair[] data = {//????
                //APIID?C73360990
                //APIKEY? 17b32e66e729a3e2cae7596314332e8f
                new NameValuePair("account", "C73360990"),
                //????? ??????->???????>????->API????->APIID
                new NameValuePair("password", "17b32e66e729a3e2cae7596314332e8f"),
                //???? ??????->???????>????->API????->APIKEY
                //new NameValuePair("password", StringUtil.MD5Encode("password")),
                new NameValuePair("mobile", this.getPhoneNumber()),
                new NameValuePair("content", content),
        };
        method.setRequestBody(data);

        try {
            client.executeMethod(method);

            String SubmitResult =method.getResponseBodyAsString();

            //System.out.println(SubmitResult);

            Document doc = DocumentHelper.parseText(SubmitResult);
            Element root = doc.getRootElement();

            String code = root.elementText("code");
            String msg = root.elementText("msg");
            String smsid = root.elementText("smsid");

            System.out.println(code);
            System.out.println(msg);
            System.out.println(smsid);

            if("2".equals(code)){
                System.out.println("??????");
            }

        } catch (HttpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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

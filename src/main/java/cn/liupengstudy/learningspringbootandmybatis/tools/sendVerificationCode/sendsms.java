package cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode;//??????????????????????????????????
// ???????????????http://user.ihuyi.com/register.html
// ?????
//?1??????????????????????????????????????????????
//?2???? APIID ? APIKEY???????????????
//?3???????????????????????????????????

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class sendsms {

	private static String Url = "http://106.ihuyi.com/webservice/sms.php?method=Submit";

	public static void main(String [] args) {

		HttpClient client = new HttpClient();
		PostMethod method = new PostMethod(Url);

		client.getParams().setContentCharset("UTF-16");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=GBK");

		int mobile_code = (int)((Math.random()*9+1)*100000);

		String content = new String("???????" + mobile_code + "???????????????");

		NameValuePair[] data = {//????
				//APIID?C73360990
				//APIKEY? 17b32e66e729a3e2cae7596314332e8f
				new NameValuePair("account", "C73360990"),
				//????? ??????->???????>????->API????->APIID
				new NameValuePair("password", "17b32e66e729a3e2cae7596314332e8f"),
				//???? ??????->???????>????->API????->APIKEY
				// new NameValuePair("password", util.StringUtil.MD5Encode("??")),
				new NameValuePair("mobile", "14747219744"),
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

}

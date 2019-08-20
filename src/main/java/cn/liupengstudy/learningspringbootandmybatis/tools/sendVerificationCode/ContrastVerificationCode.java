package cn.liupengstudy.learningspringbootandmybatis.tools.sendVerificationCode;

public class ContrastVerificationCode {

    private String VerificationCodeI;

    private String VerificationCodeII;

    private boolean key = false;

    /**
     * 构造函数
     * @param verificationCodeI
     * @param verificationCodeII
     */
    public ContrastVerificationCode(String verificationCodeI, String verificationCodeII) {
        this.setVerificationCodeI(verificationCodeI);
        this.setVerificationCodeII(verificationCodeII);
        this.function();
    }

    public void function() {
        if (this.getVerificationCodeI().equals(this.getVerificationCodeII())) {
            this.setKey(true);
        } else {
            this.setKey(false);
        }
    }

    public String getVerificationCodeI() {
        return VerificationCodeI;
    }

    public void setVerificationCodeI(String verificationCodeI) {
        VerificationCodeI = verificationCodeI;
    }

    public String getVerificationCodeII() {
        return VerificationCodeII;
    }

    public void setVerificationCodeII(String verificationCodeII) {
        VerificationCodeII = verificationCodeII;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
}

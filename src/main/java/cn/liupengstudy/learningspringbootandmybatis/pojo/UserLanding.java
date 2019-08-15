package cn.liupengstudy.learningspringbootandmybatis.pojo;

public class UserLanding {
    private Integer mainkey;

    private String userid;

    private String landingtime;

    private String landingdate;

    private String landingipadress;

    private String landinglongitude;

    private String landinglatitude;

    private String landingphonenumber;

    private String landingemail;

    private String landingverificationcode;

    private Integer landingresults;

    public Integer getMainkey() {
        return mainkey;
    }

    public void setMainkey(Integer mainkey) {
        this.mainkey = mainkey;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getLandingtime() {
        return landingtime;
    }

    public void setLandingtime(String landingtime) {
        this.landingtime = landingtime == null ? null : landingtime.trim();
    }

    public String getLandingdate() {
        return landingdate;
    }

    public void setLandingdate(String landingdate) {
        this.landingdate = landingdate == null ? null : landingdate.trim();
    }

    public String getLandingipadress() {
        return landingipadress;
    }

    public void setLandingipadress(String landingipadress) {
        this.landingipadress = landingipadress == null ? null : landingipadress.trim();
    }

    public String getLandinglongitude() {
        return landinglongitude;
    }

    public void setLandinglongitude(String landinglongitude) {
        this.landinglongitude = landinglongitude == null ? null : landinglongitude.trim();
    }

    public String getLandinglatitude() {
        return landinglatitude;
    }

    public void setLandinglatitude(String landinglatitude) {
        this.landinglatitude = landinglatitude == null ? null : landinglatitude.trim();
    }

    public String getLandingphonenumber() {
        return landingphonenumber;
    }

    public void setLandingphonenumber(String landingphonenumber) {
        this.landingphonenumber = landingphonenumber == null ? null : landingphonenumber.trim();
    }

    public String getLandingemail() {
        return landingemail;
    }

    public void setLandingemail(String landingemail) {
        this.landingemail = landingemail == null ? null : landingemail.trim();
    }

    public String getLandingverificationcode() {
        return landingverificationcode;
    }

    public void setLandingverificationcode(String landingverificationcode) {
        this.landingverificationcode = landingverificationcode == null ? null : landingverificationcode.trim();
    }

    public Integer getLandingresults() {
        return landingresults;
    }

    public void setLandingresults(Integer landingresults) {
        this.landingresults = landingresults;
    }
}
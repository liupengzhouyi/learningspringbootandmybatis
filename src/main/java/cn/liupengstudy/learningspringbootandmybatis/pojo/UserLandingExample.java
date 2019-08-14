package cn.liupengstudy.learningspringbootandmybatis.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserLandingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLandingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLandingtimeIsNull() {
            addCriterion("landingTime is null");
            return (Criteria) this;
        }

        public Criteria andLandingtimeIsNotNull() {
            addCriterion("landingTime is not null");
            return (Criteria) this;
        }

        public Criteria andLandingtimeEqualTo(String value) {
            addCriterion("landingTime =", value, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeNotEqualTo(String value) {
            addCriterion("landingTime <>", value, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeGreaterThan(String value) {
            addCriterion("landingTime >", value, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("landingTime >=", value, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeLessThan(String value) {
            addCriterion("landingTime <", value, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeLessThanOrEqualTo(String value) {
            addCriterion("landingTime <=", value, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeLike(String value) {
            addCriterion("landingTime like", value, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeNotLike(String value) {
            addCriterion("landingTime not like", value, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeIn(List<String> values) {
            addCriterion("landingTime in", values, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeNotIn(List<String> values) {
            addCriterion("landingTime not in", values, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeBetween(String value1, String value2) {
            addCriterion("landingTime between", value1, value2, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingtimeNotBetween(String value1, String value2) {
            addCriterion("landingTime not between", value1, value2, "landingtime");
            return (Criteria) this;
        }

        public Criteria andLandingdateIsNull() {
            addCriterion("landingDate is null");
            return (Criteria) this;
        }

        public Criteria andLandingdateIsNotNull() {
            addCriterion("landingDate is not null");
            return (Criteria) this;
        }

        public Criteria andLandingdateEqualTo(String value) {
            addCriterion("landingDate =", value, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateNotEqualTo(String value) {
            addCriterion("landingDate <>", value, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateGreaterThan(String value) {
            addCriterion("landingDate >", value, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateGreaterThanOrEqualTo(String value) {
            addCriterion("landingDate >=", value, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateLessThan(String value) {
            addCriterion("landingDate <", value, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateLessThanOrEqualTo(String value) {
            addCriterion("landingDate <=", value, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateLike(String value) {
            addCriterion("landingDate like", value, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateNotLike(String value) {
            addCriterion("landingDate not like", value, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateIn(List<String> values) {
            addCriterion("landingDate in", values, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateNotIn(List<String> values) {
            addCriterion("landingDate not in", values, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateBetween(String value1, String value2) {
            addCriterion("landingDate between", value1, value2, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingdateNotBetween(String value1, String value2) {
            addCriterion("landingDate not between", value1, value2, "landingdate");
            return (Criteria) this;
        }

        public Criteria andLandingipadressIsNull() {
            addCriterion("landingIPAdress is null");
            return (Criteria) this;
        }

        public Criteria andLandingipadressIsNotNull() {
            addCriterion("landingIPAdress is not null");
            return (Criteria) this;
        }

        public Criteria andLandingipadressEqualTo(String value) {
            addCriterion("landingIPAdress =", value, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressNotEqualTo(String value) {
            addCriterion("landingIPAdress <>", value, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressGreaterThan(String value) {
            addCriterion("landingIPAdress >", value, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressGreaterThanOrEqualTo(String value) {
            addCriterion("landingIPAdress >=", value, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressLessThan(String value) {
            addCriterion("landingIPAdress <", value, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressLessThanOrEqualTo(String value) {
            addCriterion("landingIPAdress <=", value, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressLike(String value) {
            addCriterion("landingIPAdress like", value, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressNotLike(String value) {
            addCriterion("landingIPAdress not like", value, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressIn(List<String> values) {
            addCriterion("landingIPAdress in", values, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressNotIn(List<String> values) {
            addCriterion("landingIPAdress not in", values, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressBetween(String value1, String value2) {
            addCriterion("landingIPAdress between", value1, value2, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandingipadressNotBetween(String value1, String value2) {
            addCriterion("landingIPAdress not between", value1, value2, "landingipadress");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeIsNull() {
            addCriterion("landingLongitude is null");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeIsNotNull() {
            addCriterion("landingLongitude is not null");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeEqualTo(String value) {
            addCriterion("landingLongitude =", value, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeNotEqualTo(String value) {
            addCriterion("landingLongitude <>", value, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeGreaterThan(String value) {
            addCriterion("landingLongitude >", value, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("landingLongitude >=", value, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeLessThan(String value) {
            addCriterion("landingLongitude <", value, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeLessThanOrEqualTo(String value) {
            addCriterion("landingLongitude <=", value, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeLike(String value) {
            addCriterion("landingLongitude like", value, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeNotLike(String value) {
            addCriterion("landingLongitude not like", value, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeIn(List<String> values) {
            addCriterion("landingLongitude in", values, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeNotIn(List<String> values) {
            addCriterion("landingLongitude not in", values, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeBetween(String value1, String value2) {
            addCriterion("landingLongitude between", value1, value2, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglongitudeNotBetween(String value1, String value2) {
            addCriterion("landingLongitude not between", value1, value2, "landinglongitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeIsNull() {
            addCriterion("landingLatitude is null");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeIsNotNull() {
            addCriterion("landingLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeEqualTo(String value) {
            addCriterion("landingLatitude =", value, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeNotEqualTo(String value) {
            addCriterion("landingLatitude <>", value, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeGreaterThan(String value) {
            addCriterion("landingLatitude >", value, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("landingLatitude >=", value, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeLessThan(String value) {
            addCriterion("landingLatitude <", value, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeLessThanOrEqualTo(String value) {
            addCriterion("landingLatitude <=", value, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeLike(String value) {
            addCriterion("landingLatitude like", value, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeNotLike(String value) {
            addCriterion("landingLatitude not like", value, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeIn(List<String> values) {
            addCriterion("landingLatitude in", values, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeNotIn(List<String> values) {
            addCriterion("landingLatitude not in", values, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeBetween(String value1, String value2) {
            addCriterion("landingLatitude between", value1, value2, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandinglatitudeNotBetween(String value1, String value2) {
            addCriterion("landingLatitude not between", value1, value2, "landinglatitude");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberIsNull() {
            addCriterion("landingPhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberIsNotNull() {
            addCriterion("landingPhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberEqualTo(String value) {
            addCriterion("landingPhoneNumber =", value, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberNotEqualTo(String value) {
            addCriterion("landingPhoneNumber <>", value, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberGreaterThan(String value) {
            addCriterion("landingPhoneNumber >", value, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("landingPhoneNumber >=", value, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberLessThan(String value) {
            addCriterion("landingPhoneNumber <", value, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberLessThanOrEqualTo(String value) {
            addCriterion("landingPhoneNumber <=", value, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberLike(String value) {
            addCriterion("landingPhoneNumber like", value, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberNotLike(String value) {
            addCriterion("landingPhoneNumber not like", value, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberIn(List<String> values) {
            addCriterion("landingPhoneNumber in", values, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberNotIn(List<String> values) {
            addCriterion("landingPhoneNumber not in", values, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberBetween(String value1, String value2) {
            addCriterion("landingPhoneNumber between", value1, value2, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingphonenumberNotBetween(String value1, String value2) {
            addCriterion("landingPhoneNumber not between", value1, value2, "landingphonenumber");
            return (Criteria) this;
        }

        public Criteria andLandingemailIsNull() {
            addCriterion("landingEmail is null");
            return (Criteria) this;
        }

        public Criteria andLandingemailIsNotNull() {
            addCriterion("landingEmail is not null");
            return (Criteria) this;
        }

        public Criteria andLandingemailEqualTo(String value) {
            addCriterion("landingEmail =", value, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailNotEqualTo(String value) {
            addCriterion("landingEmail <>", value, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailGreaterThan(String value) {
            addCriterion("landingEmail >", value, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailGreaterThanOrEqualTo(String value) {
            addCriterion("landingEmail >=", value, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailLessThan(String value) {
            addCriterion("landingEmail <", value, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailLessThanOrEqualTo(String value) {
            addCriterion("landingEmail <=", value, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailLike(String value) {
            addCriterion("landingEmail like", value, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailNotLike(String value) {
            addCriterion("landingEmail not like", value, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailIn(List<String> values) {
            addCriterion("landingEmail in", values, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailNotIn(List<String> values) {
            addCriterion("landingEmail not in", values, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailBetween(String value1, String value2) {
            addCriterion("landingEmail between", value1, value2, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingemailNotBetween(String value1, String value2) {
            addCriterion("landingEmail not between", value1, value2, "landingemail");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeIsNull() {
            addCriterion("landingVerificationCode is null");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeIsNotNull() {
            addCriterion("landingVerificationCode is not null");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeEqualTo(String value) {
            addCriterion("landingVerificationCode =", value, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeNotEqualTo(String value) {
            addCriterion("landingVerificationCode <>", value, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeGreaterThan(String value) {
            addCriterion("landingVerificationCode >", value, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("landingVerificationCode >=", value, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeLessThan(String value) {
            addCriterion("landingVerificationCode <", value, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeLessThanOrEqualTo(String value) {
            addCriterion("landingVerificationCode <=", value, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeLike(String value) {
            addCriterion("landingVerificationCode like", value, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeNotLike(String value) {
            addCriterion("landingVerificationCode not like", value, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeIn(List<String> values) {
            addCriterion("landingVerificationCode in", values, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeNotIn(List<String> values) {
            addCriterion("landingVerificationCode not in", values, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeBetween(String value1, String value2) {
            addCriterion("landingVerificationCode between", value1, value2, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingverificationcodeNotBetween(String value1, String value2) {
            addCriterion("landingVerificationCode not between", value1, value2, "landingverificationcode");
            return (Criteria) this;
        }

        public Criteria andLandingresultsIsNull() {
            addCriterion("landingResults is null");
            return (Criteria) this;
        }

        public Criteria andLandingresultsIsNotNull() {
            addCriterion("landingResults is not null");
            return (Criteria) this;
        }

        public Criteria andLandingresultsEqualTo(Integer value) {
            addCriterion("landingResults =", value, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsNotEqualTo(Integer value) {
            addCriterion("landingResults <>", value, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsGreaterThan(Integer value) {
            addCriterion("landingResults >", value, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsGreaterThanOrEqualTo(Integer value) {
            addCriterion("landingResults >=", value, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsLessThan(Integer value) {
            addCriterion("landingResults <", value, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsLessThanOrEqualTo(Integer value) {
            addCriterion("landingResults <=", value, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsIn(List<Integer> values) {
            addCriterion("landingResults in", values, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsNotIn(List<Integer> values) {
            addCriterion("landingResults not in", values, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsBetween(Integer value1, Integer value2) {
            addCriterion("landingResults between", value1, value2, "landingresults");
            return (Criteria) this;
        }

        public Criteria andLandingresultsNotBetween(Integer value1, Integer value2) {
            addCriterion("landingResults not between", value1, value2, "landingresults");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
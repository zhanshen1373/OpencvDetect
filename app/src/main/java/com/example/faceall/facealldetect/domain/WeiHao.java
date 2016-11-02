package com.example.faceall.facealldetect.domain;

import java.util.List;

/**
 * Created by D.bj on 2016/10/8.
 */
public class WeiHao {


    /**
     * reason : 查询成功
     * result : {"date":"2016-10-08","week":"星期六","city":"beijing","cityname":"北京","des":[{"time":"私家车：限行时间段为周一至五的早7时至晚20时(法定节假日和公休日不限行)","place":"限行范围为五环路以内（不包括五环路主路）","info":""},{"time":"公务车：停驶时间为0时至24时","place":"停驶范围为本市行政区域内所有道路","info":""}],"fine":"京牌罚100块，不扣分。非京牌罚100块，扣3分。","remarks":"临时号牌按号牌尾号数字限行。机动车车尾号为英文字母的按0号管理","isxianxing":0,"xxweihao":null,"holiday":""}
     * error_code : 0
     */

    private String reason;
    /**
     * date : 2016-10-08
     * week : 星期六
     * city : beijing
     * cityname : 北京
     * des : [{"time":"私家车：限行时间段为周一至五的早7时至晚20时(法定节假日和公休日不限行)","place":"限行范围为五环路以内（不包括五环路主路）","info":""},{"time":"公务车：停驶时间为0时至24时","place":"停驶范围为本市行政区域内所有道路","info":""}]
     * fine : 京牌罚100块，不扣分。非京牌罚100块，扣3分。
     * remarks : 临时号牌按号牌尾号数字限行。机动车车尾号为英文字母的按0号管理
     * isxianxing : 0
     * xxweihao : null
     * holiday :
     */

    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private String date;
        private String week;
        private String city;
        private String cityname;
        private String fine;
        private String remarks;
        private int isxianxing;
        private Object xxweihao;
        private String holiday;
        /**
         * time : 私家车：限行时间段为周一至五的早7时至晚20时(法定节假日和公休日不限行)
         * place : 限行范围为五环路以内（不包括五环路主路）
         * info :
         */

        private List<DesBean> des;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityname() {
            return cityname;
        }

        public void setCityname(String cityname) {
            this.cityname = cityname;
        }

        public String getFine() {
            return fine;
        }

        public void setFine(String fine) {
            this.fine = fine;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public int getIsxianxing() {
            return isxianxing;
        }

        public void setIsxianxing(int isxianxing) {
            this.isxianxing = isxianxing;
        }

        public Object getXxweihao() {
            return xxweihao;
        }

        public void setXxweihao(Object xxweihao) {
            this.xxweihao = xxweihao;
        }

        public String getHoliday() {
            return holiday;
        }

        public void setHoliday(String holiday) {
            this.holiday = holiday;
        }

        public List<DesBean> getDes() {
            return des;
        }

        public void setDes(List<DesBean> des) {
            this.des = des;
        }

        public static class DesBean {
            private String time;
            private String place;
            private String info;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getPlace() {
                return place;
            }

            public void setPlace(String place) {
                this.place = place;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }
    }
}

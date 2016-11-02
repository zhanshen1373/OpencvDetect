package com.example.faceall.facealldetect.domain;

/**
 * Created by D.bj on 2016/10/18.
 */
public class FaceAllWeather {


    /**
     * pm25 : 113
     * now : {"temperature":"15","condition_code":"101","condition_text":"多云"}
     * update_at : 1476759767716
     */

    private String pm25;
    /**
     * temperature : 15
     * condition_code : 101
     * condition_text : 多云
     */

    private NowBean now;
    private long update_at;

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(long update_at) {
        this.update_at = update_at;
    }

    public static class NowBean {
        private String temperature;
        private String condition_code;
        private String condition_text;

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getCondition_code() {
            return condition_code;
        }

        public void setCondition_code(String condition_code) {
            this.condition_code = condition_code;
        }

        public String getCondition_text() {
            return condition_text;
        }

        public void setCondition_text(String condition_text) {
            this.condition_text = condition_text;
        }
    }
}

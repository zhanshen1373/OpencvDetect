package com.example.faceall.facealldetect.domain;

import java.util.List;

/**
 * Created by D.bj on 2016/10/18.
 */
public class FaceAllWeiHao {


    /**
     * date : 2016-10-17
     * week : 星期一
     * city : beijing
     * city_name : 北京
     * is_xianxing : 1
     * weihao : [5,0]
     */

    private String date;
    private String week;
    private String city;
    private String city_name;
    private int is_xianxing;
    private List<Integer> weihao;

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

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getIs_xianxing() {
        return is_xianxing;
    }

    public void setIs_xianxing(int is_xianxing) {
        this.is_xianxing = is_xianxing;
    }

    public List<Integer> getWeihao() {
        return weihao;
    }

    public void setWeihao(List<Integer> weihao) {
        this.weihao = weihao;
    }
}

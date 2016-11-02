package com.example.faceall.facealldetect;

/**
 * Created by D.bj on 2016/10/13.
 */
public class PersonTemp {

    public PersonTemp(String name, String company, int pic_id){
        this.name = name;
        this.company = company;
        this.pic_id = pic_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPic_id() {
        return pic_id;
    }

    public void setPic_id(int pic_id) {
        this.pic_id = pic_id;
    }

    private String name;
    private String company;
    private int pic_id;
}

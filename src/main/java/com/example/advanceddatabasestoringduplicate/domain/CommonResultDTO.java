package com.example.advanceddatabasestoringduplicate.domain;

import java.util.Date;

public class CommonResultDTO {
    String id;
    String name;
    String email;
    int phoneNo;
    Date createdDate;

    String eng;
    String urdu;
    String math;
    String arabic;

    public CommonResultDTO() {
    }

    public CommonResultDTO(String id, String name, String email, int phoneNo, Date createdDate, String eng, String urdu, String math, String arabic) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.createdDate = createdDate;
        this.eng = eng;
        this.urdu = urdu;
        this.math = math;
        this.arabic = arabic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getUrdu() {
        return urdu;
    }

    public void setUrdu(String urdu) {
        this.urdu = urdu;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }
}

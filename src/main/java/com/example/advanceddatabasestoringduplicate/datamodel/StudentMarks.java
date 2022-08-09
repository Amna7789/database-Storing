package com.example.advanceddatabasestoringduplicate.datamodel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentmarks")
public class StudentMarks {
    @Id
    String id;
    String eng;
    String urdu;
    String math;
    String arabic;

    public StudentMarks() {
    }

    public StudentMarks(String id, String eng, String urdu, String math, String arabic) {
        this.id = id;
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

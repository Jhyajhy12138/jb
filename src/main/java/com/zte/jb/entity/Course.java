package com.zte.jb.entity;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer cId;
    private String cName;
    private Byte[] cContent;
    private String cImage;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Byte[] getcContent() {
        return cContent;
    }

    public void setcContent(Byte[] cContent) {
        this.cContent = cContent;
    }

    public String getcImage() {
        return cImage;
    }

    public void setcImage(String cImage) {
        this.cImage = cImage;
    }
}

package com.zte.jb.entity;

import java.io.Serializable;

public class Favcontent implements Serializable {
    private Integer fcId;
    private Integer uId;
    private Integer nId;
    private String fcCreateTime;

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getFcCreateTime() {
        return fcCreateTime;
    }

    public void setFcCreateTime(String fcCreateTime) {
        this.fcCreateTime = fcCreateTime;
    }
}

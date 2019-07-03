package com.zte.jb.entity;

import java.io.Serializable;

public class Post implements Serializable{
    private Integer pId;
    private Integer uId;
    private Byte[] pContent;
    private String pImage;
    private String pCreateTime;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Byte[] getpContent() {
        return pContent;
    }

    public void setpContent(Byte[] pContent) {
        this.pContent = pContent;
    }

    public String getpImage() {
        return pImage;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage;
    }

    public String getpCreateTime() {
        return pCreateTime;
    }

    public void setpCreateTime(String pCreateTime) {
        this.pCreateTime = pCreateTime;
    }
}

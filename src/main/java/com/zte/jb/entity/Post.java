package com.zte.jb.entity;

import java.io.Serializable;
import java.util.Arrays;

public class Post implements Serializable{
    private Integer pId;
    private Integer uId;
    private byte[] pContent;
    private String pImage;
    private String pCreateTime;

    public Post(){}

    public Post(Integer uId, byte[] pContent, String pImage, String pCreateTime) {
        this.uId = uId;
        this.pContent = pContent;
        this.pImage = pImage;
        this.pCreateTime = pCreateTime;
    }

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

    public byte[] getpContent() {
        return pContent;
    }

    public void setpContent(byte[] pContent) {
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

    @Override
    public String toString() {
        return "Post{" +
                "pId=" + pId +
                ", uId=" + uId +
                ", pContent=" + Arrays.toString(pContent) +
                ", pImage='" + pImage + '\'' +
                ", pCreateTime='" + pCreateTime + '\'' +
                '}';
    }
}

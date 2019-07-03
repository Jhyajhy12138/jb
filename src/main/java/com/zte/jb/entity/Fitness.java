package com.zte.jb.entity;

import java.io.Serializable;

/**
 * Author:helloboy
 * Date:2019-07-02 16:02
 * Description:<描述>
 */
public class Fitness implements Serializable {
    private int fId;
    private User user;
    private int cId;
    private String fTime;
    private String fCreateTime;

    public Fitness(int cid, String fCreateTime, int fid, String fTime, User user) {
        this.cId= cid;
        this.fCreateTime = fCreateTime;
        this.fId= fid;
        this.fTime = fTime;
        this.user= user;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public User getuser() {
        return user;
    }

    public void setuId(User user) {
        this.user = user;
    }

    public String getfTime() {
        return fTime;
    }

    public void setfTime(String fTime) {
        this.fTime = fTime;
    }

    public String getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(String fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    @Override
    public String toString() {
        return "Fitness{" +
                "cId=" + cId +
                ", fId=" + fId +
                ", user=" + user +
                ", fTime='" + fTime + '\'' +
                ", fCreateTime='" + fCreateTime + '\'' +
                '}';
    }
}

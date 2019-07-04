package com.zte.jb.entity;

import java.io.Serializable;

/**
 * Author:helloboy
 * Date:2019-07-02 16:02
 * Description:<描述>
 */
public class Run implements Serializable{
    private int rId;
    private User user;
    private double rJourney;
    private String rTime;
    private String rCreateTime;
    public Run(){};
    public Run(String rCreateTime, int rId, double rJourney, String rTime, User user) {
        this.rCreateTime = rCreateTime;
        this.rId = rId;
        this.rJourney = rJourney;
        this.rTime = rTime;
        this.user=user;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public User getuser() {
        return user;
    }

    public void setuId(User user) {
        this.user = user;
    }

    public String getrCreateTime() {
        return rCreateTime;
    }

    public void setrCreateTime(String rCreateTime) {
        this.rCreateTime = rCreateTime;
    }

    public double getrJourney() {
        return rJourney;
    }

    public void setrJourney(double rJourney) {
        this.rJourney = rJourney;
    }

    public String getrTime() {
        return rTime;
    }

    public void setrTime(String rTime) {
        this.rTime = rTime;
    }

    @Override
    public String toString() {
        return "Run{" +
                "rCreateTime='" + rCreateTime + '\'' +
                ", rId=" + rId +
                ", user=" + user +
                ", rJourney=" + rJourney +
                ", rTime='" + rTime + '\'' +
                '}';
    }
}

package com.zte.jb.entity;

import java.io.Serializable;

/**
 * Author:helloboy
 * Date:2019-07-03 14:56
 * Description:<描述>
 */
public class User implements Serializable {
    private int uId;
    private String uName;
    private int uTel;
    private String uPwd;
    private double uHeight;
    private double uWeight;
    private String uGender;
    private String uBirth;
    private String uRemark;
    private String uCreateTime;
    public User(){};
    public User(String uBirth, String uCreateTime, String uGender, double uHeight, int uId, String uName, String uPwd, String uRemark, int uTel, double uWeight) {
        this.uBirth = uBirth;
        this.uCreateTime = uCreateTime;
        this.uGender = uGender;
        this.uHeight = uHeight;
        this.uId = uId;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uRemark = uRemark;
        this.uTel = uTel;
        this.uWeight = uWeight;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getuTel() {
        return uTel;
    }

    public void setuTel(int uTel) {
        this.uTel = uTel;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender;
    }

    public double getuHeight() {
        return uHeight;
    }

    public void setuHeight(double uHeight) {
        this.uHeight = uHeight;
    }

    public double getuWeight() {
        return uWeight;
    }

    public void setuWeight(double uWeight) {
        this.uWeight = uWeight;
    }

    public String getuBirth() {
        return uBirth;
    }

    public void setuBirth(String uBirth) {
        this.uBirth = uBirth;
    }

    public String getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(String uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public String getuRemark() {
        return uRemark;
    }

    public void setuRemark(String uRemark) {
        this.uRemark = uRemark;
    }

    @Override
    public String toString() {
        return "User{" +
                "uBirth='" + uBirth + '\'' +
                ", uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uTel=" + uTel +
                ", uPwd='" + uPwd + '\'' +
                ", uHeight=" + uHeight +
                ", uWeight=" + uWeight +
                ", uGender='" + uGender + '\'' +
                ", uRemark='" + uRemark + '\'' +
                ", uCreateTime='" + uCreateTime + '\'' +
                '}';
    }
}

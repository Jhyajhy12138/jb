package com.zte.jb.entity;

import java.io.Serializable;

public class News implements Serializable {
    private Integer nId;
    private String nTitle;
    private Byte[] nContent;
    private String nCreateTime;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public Byte[] getnContent() {
        return nContent;
    }

    public void setnContent(Byte[] nContent) {
        this.nContent = nContent;
    }

    public String getnCreateTime() {
        return nCreateTime;
    }

    public void setnCreateTime(String nCreateTime) {
        this.nCreateTime = nCreateTime;
    }
}

package com.yjsj.mypro.entity;

public class User {
    private int uid;
    private String uame;
    private String upsw;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUame() {
        return uame;
    }

    public void setUame(String uame) {
        this.uame = uame;
    }

    public String getUpsw() {
        return upsw;
    }

    public void setUpsw(String upsw) {
        this.upsw = upsw;
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname;
    }

    private String urealname;
}

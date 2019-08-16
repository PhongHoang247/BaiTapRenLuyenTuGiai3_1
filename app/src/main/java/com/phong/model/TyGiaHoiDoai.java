package com.phong.model;

import java.io.Serializable;

public class TyGiaHoiDoai implements Serializable {
    protected int hinh;
    protected String tenNuoc;
    protected int muaTM;
    protected int muaCK;
    protected int banTM;
    protected int banCK;

    public TyGiaHoiDoai() {
    }

    public TyGiaHoiDoai(int hinh, String tenNuoc, int muaTM, int muaCK, int banTM, int banCK) {
        this.hinh = hinh;
        this.tenNuoc = tenNuoc;
        this.muaTM = muaTM;
        this.muaCK = muaCK;
        this.banTM = banTM;
        this.banCK = banCK;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public int getMuaTM() {
        return muaTM;
    }

    public void setMuaTM(int muaTM) {
        this.muaTM = muaTM;
    }

    public int getMuaCK() {
        return muaCK;
    }

    public void setMuaCK(int muaCK) {
        this.muaCK = muaCK;
    }

    public int getBanTM() {
        return banTM;
    }

    public void setBanTM(int banTM) {
        this.banTM = banTM;
    }

    public int getBanCK() {
        return banCK;
    }

    public void setBanCK(int banCK) {
        this.banCK = banCK;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }
}

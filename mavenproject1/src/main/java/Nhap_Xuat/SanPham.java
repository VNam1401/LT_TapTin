/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhap_Xuat;

/**
 *
 * @author nguyenvannam
 */
public class SanPham {

    private String Maso;
    private String Ten;
    private float Gia;

    public SanPham(String Maso, String Ten, float Gia) {
        this.Maso = Maso;
        this.Ten = Ten;
        this.Gia = Gia;
    }

    public String getMaso() {
        return Maso;
    }

    public void setMaso(String Maso) {
        this.Maso = Maso;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    @Override
    public String toString() {
        return "Maso" + getMaso() + "," + "Ten" + getTen() + "," + getGia() + "," + "Gia";
    }
}

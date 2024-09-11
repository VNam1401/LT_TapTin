package Nhap_Xuat;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        
        danhSachSanPham.add(new SanPham("SP01", "Banh My", 10000));
        danhSachSanPham.add(new SanPham("SP02", "My Tom", 3500));
        danhSachSanPham.add(new SanPham("SP03", "Nuoc Khoang", 5000));

        // Ghi  danh sách sản phẩm vào file sanpham.txt
        try (FileWriter wt = new FileWriter("sanpham.txt")) {
            for (SanPham sp : danhSachSanPham) {
                wt.write(sp.toString() + "\n");
            }
            System.out.println("Ghi file thanh cong");
        } catch (IOException i) {
        }
    }
}

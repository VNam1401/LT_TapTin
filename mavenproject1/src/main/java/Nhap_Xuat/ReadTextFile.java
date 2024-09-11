package Nhap_Xuat;

import Nhap_Xuat.SanPham;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        // Đọc dữ liệu từ file sanpham.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("sanpham.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Tách thông tin sản phẩm theo dấu chấm phẩy
                String[] data = line.split(";");
                if (data.length == 3) {
                    String maso = data[0];
                    String ten = data[1];
                    float gia = Float.parseFloat(data[2]);

                    // Tạo đối tượng sản phẩm và thêm vào danh sách
                    SanPham sp = new SanPham(maso, ten, gia);
                    danhSachSanPham.add(sp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Xuất danh sách sản phẩm ra màn hình
        System.out.println("Danh sach san pham doc tu file file");
        for (SanPham sp : danhSachSanPham) {
            System.out.println("Ma So: " + sp.getMaso() + ", Ten: " + sp.getTen() + ", Gia: " + sp.getGia());
        }
    }
}

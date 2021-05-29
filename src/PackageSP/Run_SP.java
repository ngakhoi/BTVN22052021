package PakageSP;

import sun.security.x509.IssuerAlternativeNameExtension;

import java.util.ArrayList;
import java.util.Comparator;

public class Run_SP {
    public static void main(String[] args) {
        //Tạo đối tượng sp mới
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        SanPham sp3 = new SanPham();
        SanPham sp4 = new SanPham();
        SanPham sp5 = new SanPham();

        // Cho các sản phẩm vào một list
        ArrayList<SanPham> sanpham = new ArrayList<>();
        sanpham.add(sp1);
        sanpham.add(sp2);
        sanpham.add(sp3);
        sanpham.add(sp4);
        sanpham.add(sp5);

        //Nhập thông tin các sản phẩm
        System.out.println("NHẬP VÀO THÔNG TIN SẢN PHẨM");
        for (SanPham ObjA:sanpham){
            ObjA.nhapTT();
        }
        //Sắp xếp thứ tự sản phẩm theo chiều tăng dần của Thành tiền
        //sanpham.sort(Comparator.comparing(SanPham::thanhTien));

        //Sắp xếp thứ tự sản phẩm theo chiều giảm dần của Thành tiền
        sanpham.sort(Comparator.comparing(SanPham::thanhTien).reversed());

        // In ra thông tin sản phẩm sau khi đã sắp xếp
        System.out.println("THÔNG TIN SẢN PHẨM SAU KHI SẮP XẾP");
        for (SanPham ObjA:sanpham){
            ObjA.inTT();
        }
    }
}

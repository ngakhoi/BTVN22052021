package PakageSP;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class SanPham {
    public int maSanPham;
    public String tenSanPham;
    public double giaBan;
    public int soLuong;
    public double thanhTien = 0;

    // Hàm khởi tạo đối tượng SP
    public SanPham() {

    }

    //Hàm nhập 5 SP
    public void nhapTT(){
        Scanner mSP = new Scanner(System.in);
        Scanner tSP = new Scanner(System.in);
        Scanner giaB = new Scanner(System.in);
        Scanner sLg = new Scanner(System.in);
        System.out.println("Nhập mã SP: ");
        int maSP = mSP.nextInt();
        maSanPham = maSP;
        System.out.println("Nhập tên SP: ");
        String tenSP = tSP.nextLine();
        tenSanPham = tenSP;
        System.out.println("Nhập giá bán: ");
        double gB = giaB.nextDouble();
        giaBan = gB;
        System.out.println("Nhập số lượng: ");
        int sL = sLg.nextInt();
        soLuong = sL;
    }
    public void inTT(){
        System.out.println("Sản phầm "+tenSanPham);
        System.out.println("Mã: "+maSanPham);
        System.out.println("Tên: "+tenSanPham);
        System.out.println("Giá: "+giaBan);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Thành tiền: "+thanhTien());
    }
    //Hàm tính thành tiền Sản phẩm
    public double thanhTien(){
        if(soLuong >= 20){
            thanhTien = soLuong * giaBan * 0.85;
        }else {
            thanhTien = soLuong * giaBan;
        }
        return thanhTien;
    }
}

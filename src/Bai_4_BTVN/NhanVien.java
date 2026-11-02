package Bai_4_BTVN;

import java.util.Scanner;

public class NhanVien extends Nguoi 
{
    private int snct;      // số năm công tác
    private double hsl;    // hệ số lương

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);

        System.out.print("Nhập số năm công tác: ");
        snct = sc.nextInt();

        System.out.print("Nhập hệ số lương: ");
        hsl = sc.nextDouble();
    }

    public double tinhLuong() {
        double lcb = 1.5;
        double phuCap = 0.2 * snct;
        return lcb * hsl + phuCap;
    }

    public int getSnct() {
        return snct;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Số năm công tác: " + snct);
        System.out.println("Hệ số lương: " + hsl);
        System.out.println("Tiền lương: " + tinhLuong() + " triệu");
    }
}

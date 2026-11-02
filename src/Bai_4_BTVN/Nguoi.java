package Bai_4_BTVN;

import java.util.Scanner;

public class Nguoi
{
    protected String _hoTen;
    protected int _tuoi;

    public void Nhap(Scanner sc) 
    {
        sc.nextLine();

        System.out.print("Nhap ho ten: ");
        _hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        _tuoi = sc.nextInt();
    }

    public void Xuat() {
        System.out.println("Họ tên: " + _hoTen);
        System.out.println("Tuổi: " + _tuoi);
    }
}
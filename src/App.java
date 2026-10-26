import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        HinhTron hinhTron1 = new HinhTron(0.6, 0.8, 0.4);
        HinhTron hinhTron2 = new HinhTron();

        System.out.println("Dien tich hinh tron 1: " +hinhTron1.DienTich());
        System.out.println("Dien tich hinh tron 2: " +hinhTron2.DienTich());    
        
        Scanner scaner = new Scanner();
    }


}
 

import Bai_1.Phan_So;
import Bai_2.Diem2D;
import Bai_2.Diem3D;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args)
    {
        Bai_2();
    }

    private static void Bai_1() {
        Phan_So[] mang_phan_so = new Phan_So[]
        {
            new Phan_So(3, 4),
            new Phan_So(5, 2),
            new Phan_So(3, 4),
            new Phan_So(-3, 4),
        };

        Phan_So phan_so_lon_nhat = mang_phan_so[0];
        for (int i = 1; i < mang_phan_so.length; i++) {
            if (mang_phan_so[i].So_Sanh_Hai_Phan_So(phan_so_lon_nhat) > 0) {
                phan_so_lon_nhat = mang_phan_so[i];
            }
        }
        System.out.println("Phan so lon nhat: " + phan_so_lon_nhat);

        Phan_So tong_phan_so = new Phan_So(1,1);
        for (Phan_So ps : mang_phan_so) {
            tong_phan_so.Cong_Phan_So(ps);
        }
        System.out.println("Tong cac phan so: " + tong_phan_so);

        int dem_phan_so_khong_nguyen = 0;
        for (Phan_So ps : mang_phan_so) {
            if (!ps.La_So_Nguye()) {
                dem_phan_so_khong_nguyen++;
            }
        }
        System.out.println("So luong phan so khong phai so nguye: " + dem_phan_so_khong_nguyen);
    }

    static void Bai_2()
    {
        ArrayList<Diem2D> danh_sach_diem = new ArrayList<Diem2D>();
        danh_sach_diem.add(new Diem2D(3, 4));
        danh_sach_diem.add(new Diem2D(6, 8));
        danh_sach_diem.add(new Diem3D(2, 3, 6));
        danh_sach_diem.add(new Diem3D(1, 2, 2));
    
        double tong_khoang_cach_2D = 0;
        double tong_khoang_cach_3D = 0;

        for (Diem2D d : danh_sach_diem) {
            if (d instanceof Diem3D) {
                tong_khoang_cach_3D += d.Tinh_Khoang_Cach_Goc_Toa_Do();
            } else {
                tong_khoang_cach_2D += d.Tinh_Khoang_Cach_Goc_Toa_Do();
            }
        }

        System.out.println("\nTong khoang cach cac diem 2d: " + tong_khoang_cach_2D);
        System.out.println("Tong khong cach cac diem 3d: " + tong_khoang_cach_3D);

        List<Diem2D> danh_sach_doi_xung = new ArrayList<>();
        for (Diem2D d : danh_sach_diem) {
            danh_sach_doi_xung.add(d.Doi_Xung());
        }
        danh_sach_diem.addAll(danh_sach_doi_xung);

        for (Diem2D d : danh_sach_diem) {
            System.out.println(d);
        }
    }

}
 
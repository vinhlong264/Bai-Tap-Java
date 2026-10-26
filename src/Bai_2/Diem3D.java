package Bai_2;

public class Diem3D extends Diem2D
{
    private double z;

    public Diem3D() {
        super(); 
        this.z = 0;
    }

    public Diem3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() 
    { 
        return z; 
    }
    public void setZ(double z) 
    { 
        this.z = z; 
    }

    public double Tinh_Khong_Cach_3D(Diem3D d) 
    {
        return Math.sqrt(Math.pow(d.x - this.x, 2) + Math.pow(d.y - this.y, 2) + Math.pow(d.z - this.z, 2));
    }

    @Override
    public double Tinh_Khoang_Cach_Goc_Toa_Do() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    
    @Override    
    public Diem2D Doi_Xung() 
    {
        return new Diem3D(-this.x, -this.y, -this.z);
    }

    public void Tinh_Tien(double dx, double dy, double dz) {
        super.Tinh_Tien(dx, dy);
        this.z += dz;
    }

    @Override
    public String toString() {
        return "Diem3D(" + x + ", " + y + ", " + z + ")";
    }
}

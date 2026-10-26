package Bai_2;

public class Diem2D 
{
    protected double x;
    protected double y;

    public Diem2D() {
        this.x = 0;
        this.y = 0;
    }

    public Diem2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() 
    { 
        return x; 
    }
    public void setX(double x) 
    { 
        this.x = x; 
    }
    public double getY() 
    { 
        return y;
    }
    public void setY(double y) 
    { 
        this.y = y; 
    }

    public double Tinh_Khoang_Cach(Diem2D d) 
    {
        return Math.sqrt(Math.pow(d.x - this.x, 2) + Math.pow(d.y - this.y, 2));
    }


    public double Tinh_Khoang_Cach_Goc_Toa_Do() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }


    public Diem2D Doi_Xung() 
    {
        return new Diem2D(-this.x, -this.y);
    }


    public void Tinh_Tien(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Diem2D(" + x + ", " + y + ")";
    }
}

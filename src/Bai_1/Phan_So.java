package Bai_1;

public class Phan_So 
{
    private int _tuSo;
    private int _mauSo;

    public Phan_So(int _tuSo, int _mauSo) {
        this._tuSo = _tuSo;
        this._mauSo = _mauSo;
    }

    public Phan_So() {
    }

    
    public int get_tuSo() {
        return _tuSo;
    }
    public void set_tuSo(int _tuSo) {
        this._tuSo = _tuSo;
    }
    public int get_mauSo() {
        return _mauSo;
    }
    public void set_mauSo(int _mauSo) {
        this._mauSo = _mauSo;
    }

    @Override
    public String toString() {
        return "Phan_So [_tuSo=" + _tuSo + ", _mauSo=" + _mauSo + "]";
    }

    private int Uoc_Chung_Nho_Nhat(int tu_so, int mau_so) {
        tu_so = Math.abs(tu_so);
        mau_so = Math.abs(mau_so);
        while (mau_so != 0) {
            int temp = mau_so;
            mau_so = tu_so % mau_so;
            tu_so = temp;
        }
        return tu_so;
    }

    public boolean La_So_Nguye() {
        return this._mauSo == 1 || (this._tuSo % this._mauSo == 0);
    }

    public void Rut_Gon() {
        if (this._tuSo == 0) {
            this._mauSo = 1;
            return;
        }
        int u = Uoc_Chung_Nho_Nhat(this._tuSo, this._mauSo);
        this._tuSo /= u;
        this._mauSo /= u;
    }

    public Phan_So Cong_Phan_So(Phan_So phan_So){

        int t = this._tuSo * phan_So.get_mauSo() + phan_So.get_tuSo() * this._mauSo;
        int m = this._mauSo * phan_So.get_mauSo();

        return  new Phan_So(t,m);
    }

    public Phan_So Tru_Phan_So(Phan_So phan_So){

        int t = this._tuSo * phan_So.get_mauSo() - phan_So.get_tuSo() * this._mauSo;
        int m = this._mauSo * phan_So.get_mauSo();
        return  new Phan_So(t,m);
    }

    public Phan_So Nhan_Phan_So(Phan_So phan_So){
        return  new Phan_So(this._tuSo * phan_So.get_tuSo(),this._mauSo * phan_So.get_mauSo());
    }

    public Phan_So Chia_Phan_So(Phan_So phan_So) {
        if (phan_So.get_tuSo() == 0) {
            System.out.println("Không thể chia cho phân số có tử số bằng 0");
            return null;
        }
        int t = this._tuSo * phan_So.get_mauSo();
        int m = this._mauSo * phan_So.get_tuSo();
        return new Phan_So(t, m);
    }

    public int So_Sanh_Hai_Phan_So(Phan_So phan_So) {
        double v1 = (double) this._tuSo / this._mauSo;
        double v2 = (double) phan_So.get_tuSo() / phan_So.get_mauSo();
        return Double.compare(v1, v2);
    }

}

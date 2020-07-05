package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "SinhVien", schema = "DB_QLMH", catalog = "")
public class SinhVienEntity {
    private String mssv;
    private String hoTen;
    private String gioiTinh;
    private String cmnd;

    @Id
    @Column(name = "MSSV", nullable = false, length = 8)
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Basic
    @Column(name = "HoTen", nullable = true, length = 50)
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Basic
    @Column(name = "GioiTinh", nullable = true, length = 3)
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Basic
    @Column(name = "CMND", nullable = true, length = 15)
    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SinhVienEntity that = (SinhVienEntity) o;

        if (mssv != null ? !mssv.equals(that.mssv) : that.mssv != null) return false;
        if (hoTen != null ? !hoTen.equals(that.hoTen) : that.hoTen != null) return false;
        if (gioiTinh != null ? !gioiTinh.equals(that.gioiTinh) : that.gioiTinh != null) return false;
        if (cmnd != null ? !cmnd.equals(that.cmnd) : that.cmnd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mssv != null ? mssv.hashCode() : 0;
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (gioiTinh != null ? gioiTinh.hashCode() : 0);
        result = 31 * result + (cmnd != null ? cmnd.hashCode() : 0);
        return result;
    }
}

package hibernate;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BangDiem", schema = "DB_QLMH", catalog = "")
@IdClass(BangDiemEntityPK.class)
public class BangDiemEntity {
    private String maLop;
    private String maMon;
    private String mssv;
    private BigDecimal diemGk;
    private BigDecimal diemCk;
    private BigDecimal diemKhac;
    private BigDecimal diemTong;

    @Id
    @Column(name = "MaLop", nullable = false, length = 10)
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Id
    @Column(name = "MaMon", nullable = false, length = 10)
    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    @Id
    @Column(name = "MSSV", nullable = false, length = 8)
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Basic
    @Column(name = "DiemGK", nullable = true, precision = 1)
    public BigDecimal getDiemGk() {
        return diemGk;
    }

    public void setDiemGk(BigDecimal diemGk) {
        this.diemGk = diemGk;
    }

    @Basic
    @Column(name = "DiemCK", nullable = true, precision = 1)
    public BigDecimal getDiemCk() {
        return diemCk;
    }

    public void setDiemCk(BigDecimal diemCk) {
        this.diemCk = diemCk;
    }

    @Basic
    @Column(name = "DiemKhac", nullable = true, precision = 1)
    public BigDecimal getDiemKhac() {
        return diemKhac;
    }

    public void setDiemKhac(BigDecimal diemKhac) {
        this.diemKhac = diemKhac;
    }

    @Basic
    @Column(name = "DiemTong", nullable = true, precision = 1)
    public BigDecimal getDiemTong() {
        return diemTong;
    }

    public void setDiemTong(BigDecimal diemTong) {
        this.diemTong = diemTong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BangDiemEntity that = (BangDiemEntity) o;

        if (maLop != null ? !maLop.equals(that.maLop) : that.maLop != null) return false;
        if (maMon != null ? !maMon.equals(that.maMon) : that.maMon != null) return false;
        if (mssv != null ? !mssv.equals(that.mssv) : that.mssv != null) return false;
        if (diemGk != null ? !diemGk.equals(that.diemGk) : that.diemGk != null) return false;
        if (diemCk != null ? !diemCk.equals(that.diemCk) : that.diemCk != null) return false;
        if (diemKhac != null ? !diemKhac.equals(that.diemKhac) : that.diemKhac != null) return false;
        if (diemTong != null ? !diemTong.equals(that.diemTong) : that.diemTong != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maLop != null ? maLop.hashCode() : 0;
        result = 31 * result + (maMon != null ? maMon.hashCode() : 0);
        result = 31 * result + (mssv != null ? mssv.hashCode() : 0);
        result = 31 * result + (diemGk != null ? diemGk.hashCode() : 0);
        result = 31 * result + (diemCk != null ? diemCk.hashCode() : 0);
        result = 31 * result + (diemKhac != null ? diemKhac.hashCode() : 0);
        result = 31 * result + (diemTong != null ? diemTong.hashCode() : 0);
        return result;
    }
}

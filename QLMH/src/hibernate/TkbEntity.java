package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "TKB", schema = "DB_QLMH", catalog = "")
public class TkbEntity {
    private String maMon;
    private String tenMon;
    private String phongHoc;

    @Id
    @Column(name = "MaMon", nullable = false, length = 10)
    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    @Basic
    @Column(name = "TenMon", nullable = true, length = 50)
    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    @Basic
    @Column(name = "PhongHoc", nullable = true, length = 10)
    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TkbEntity tkbEntity = (TkbEntity) o;

        if (maMon != null ? !maMon.equals(tkbEntity.maMon) : tkbEntity.maMon != null) return false;
        if (tenMon != null ? !tenMon.equals(tkbEntity.tenMon) : tkbEntity.tenMon != null) return false;
        if (phongHoc != null ? !phongHoc.equals(tkbEntity.phongHoc) : tkbEntity.phongHoc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maMon != null ? maMon.hashCode() : 0;
        result = 31 * result + (tenMon != null ? tenMon.hashCode() : 0);
        result = 31 * result + (phongHoc != null ? phongHoc.hashCode() : 0);
        return result;
    }
}

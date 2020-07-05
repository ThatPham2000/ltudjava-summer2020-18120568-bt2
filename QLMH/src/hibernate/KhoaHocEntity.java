package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "KhoaHoc", schema = "DB_QLMH", catalog = "")
@IdClass(KhoaHocEntityPK.class)
public class KhoaHocEntity {
    private String maLop;
    private String maMon;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KhoaHocEntity that = (KhoaHocEntity) o;

        if (maLop != null ? !maLop.equals(that.maLop) : that.maLop != null) return false;
        if (maMon != null ? !maMon.equals(that.maMon) : that.maMon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maLop != null ? maLop.hashCode() : 0;
        result = 31 * result + (maMon != null ? maMon.hashCode() : 0);
        return result;
    }
}

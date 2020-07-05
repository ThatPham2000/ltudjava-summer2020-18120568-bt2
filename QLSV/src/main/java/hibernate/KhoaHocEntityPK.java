package hibernate;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class KhoaHocEntityPK implements Serializable {
    private String maLop;
    private String maMon;

    @Column(name = "MaLop", nullable = false, length = 10)
    @Id
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Column(name = "MaMon", nullable = false, length = 10)
    @Id
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

        KhoaHocEntityPK that = (KhoaHocEntityPK) o;

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

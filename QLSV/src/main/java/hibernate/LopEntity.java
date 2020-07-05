package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lop", schema = "DB_QLMH", catalog = "")
public class LopEntity {
    private String maLop;

    @Id
    @Column(name = "MaLop", nullable = false, length = 10)
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LopEntity lopEntity = (LopEntity) o;

        if (maLop != null ? !maLop.equals(lopEntity.maLop) : lopEntity.maLop != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return maLop != null ? maLop.hashCode() : 0;
    }
}

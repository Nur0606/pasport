import java.time.LocalDate;

public class Pasport {
    int id;
    String birinchiAty;
    String ekinchiAty;
    LocalDate tuulganjyly;
    String junys;
    String gdeRodilsa;

    @Override
    public String toString() {
        return "Pasport{" +
                "id=" + id +
                ", birinchiAty='" + birinchiAty + '\'' +
                ", ekinchiAty='" + ekinchiAty + '\'' +
                ", tuulganjyly=" + tuulganjyly +
                ", junys='" + junys + '\'' +
                ", gdeRodilsa='" + gdeRodilsa + '\'' +
                '}';
    }

    public Pasport(int id, String birinchiAty, String ekinchiAty, LocalDate tuulganjyly, String junys, String gdeRodilsa) {
        this.id = id;
        this.birinchiAty = birinchiAty;
        this.ekinchiAty = ekinchiAty;
        this.tuulganjyly = tuulganjyly;
        this.junys = junys;
        this.gdeRodilsa = gdeRodilsa;

    }
}

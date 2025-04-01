import java.time.LocalDate;

public class Employee {
    String nev;
    String anyjaNeve;
    String telepules;
    String lakcim;
    Double fizetes;
    LocalDate szuletes;
    Double jutalom;
    public Employee() {
    }
    public Employee(String nev, String anyjaNeve, String telepules, String lakcim, Double fizetes, LocalDate szuletes, Double jutalom) {
        this.nev = nev;
        this.anyjaNeve = anyjaNeve;
        this.telepules = telepules;
        this.lakcim = lakcim;
        this.fizetes = fizetes;
        this.szuletes = szuletes;
        this.jutalom = jutalom;
    }
}

public class Pacient {
    private String nume;
    private TipUrgenta urgenta;

    public Pacient(String nume, TipUrgenta urgenta) {
        this.nume = nume;
        this.urgenta = urgenta;
    }

    public String getNume() {
        return nume;
    }

    public TipUrgenta getUrgenta() {
        return urgenta;
    }
}

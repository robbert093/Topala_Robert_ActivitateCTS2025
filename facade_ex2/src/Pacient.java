public class Pacient {

    private String nume;
    private boolean stareGrava;

    public Pacient(String nume, boolean stareGrava) {
        this.nume = nume;
        this.stareGrava = stareGrava;
    }

    public boolean areStareGrava() {
        return stareGrava;
    }

    public String getNume() {
        return nume;
    }
}

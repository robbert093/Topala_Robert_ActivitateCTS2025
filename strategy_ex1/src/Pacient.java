public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void efectueazaPlata(double suma) {
        System.out.println("Pacient: " + nume);
        modPlata.plateste(suma);
    }
}

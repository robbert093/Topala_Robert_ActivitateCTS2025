public class Rezervare {
    private int numarMasa;
    private int numarPersoane;
    private String ora;
    private Client client;

    public Rezervare(int numarMasa, int numarPersoane, String ora, Client client) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.ora = ora;
        this.client = client;
    }

    public void afiseaza() {
        System.out.println("Rezervare: Masa " + numarMasa + ", " + numarPersoane + " persoane, ora " + ora);
        client.afiseazaInformatii();
        System.out.println();
    }
}

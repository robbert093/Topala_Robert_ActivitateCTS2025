public class Produs extends AItemMenu {
    int pret;

    public Produs(String denumire, int pret){
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public int getPret() {
        return this.pret;
    }

    @Override
    public void afiseaza(int nivel) {
        System.out.println("  ".repeat(nivel) + "- " + denumire);
    }
}

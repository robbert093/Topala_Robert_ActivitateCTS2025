public class MedicamentSpital {
    private String denumire;

    public MedicamentSpital(String denumire) {
        this.denumire = denumire;
    }

    public void prezintaReteta() {
        System.out.println("Se prezintă rețeta pentru medicamentul: " + denumire);
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + denumire + " a fost achiziționat din magazinul spitalului.");
    }

}

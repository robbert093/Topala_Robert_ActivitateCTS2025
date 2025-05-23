public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String denumire;

    public MedicamentFarmacie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul " + denumire + " a fost achiziționat din farmacie.");
    }
}

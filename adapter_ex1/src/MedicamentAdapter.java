public class MedicamentAdapter implements IMedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentAdapter(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
        System.out.println("Prin intermediu farmaciei.");
    }

}

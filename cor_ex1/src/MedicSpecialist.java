public class MedicSpecialist extends Medic {
    @Override
    public void trateaza(Pacient pacient) {
        if (pacient.getUrgenta() == TipUrgenta.MEDIE) {
            System.out.println("Medic specialist tratează pacientul: " + pacient.getNume());
        } else if (urmatorul != null) {
            urmatorul.trateaza(pacient);
        } else {
            System.out.println("Niciun medic disponibil pentru: " + pacient.getNume());
        }
    }
}

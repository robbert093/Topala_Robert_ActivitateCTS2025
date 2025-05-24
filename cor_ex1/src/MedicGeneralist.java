public class MedicGeneralist extends Medic {
    @Override
    public void trateaza(Pacient pacient) {
        if (pacient.getUrgenta() == TipUrgenta.USOARA) {
            System.out.println("Medic generalist tratează pacientul: " + pacient.getNume());
        } else if (urmatorul != null) {
            urmatorul.trateaza(pacient);
        } else {
            System.out.println("Niciun medic disponibil pentru: " + pacient.getNume());
        }
    }
}

public class Chirurg extends Medic {
    @Override
    public void trateaza(Pacient pacient) {
        if (pacient.getUrgenta() == TipUrgenta.GRAVA) {
            System.out.println("Chirurgul operează pacientul: " + pacient.getNume());
        } else if (urmatorul != null) {
            urmatorul.trateaza(pacient);
        } else {
            System.out.println("Niciun medic disponibil pentru: " + pacient.getNume());
        }
    }
}

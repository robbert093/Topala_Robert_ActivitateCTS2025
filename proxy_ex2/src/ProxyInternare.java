public class ProxyInternare implements IInternare {

    private Spital spital;

    public ProxyInternare(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if (pacient.areAsigurare()) {
            spital.interneaza(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " NU poate fi internat – lipsă asigurare.");
        }
    }
}

public class Spital implements IInternare {
    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat cu succes.");
    }
}

public class OperatorTriaj {
    private Medic primulMedic;

    public OperatorTriaj(Medic primulMedic) {
        this.primulMedic = primulMedic;
    }

    public void preiaPacient(Pacient pacient) {
        System.out.println("Operatorul preia pacientul: " + pacient.getNume());
        primulMedic.trateaza(pacient);
    }
}

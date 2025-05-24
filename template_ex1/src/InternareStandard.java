public class InternareStandard extends InternarePacient {

    @Override
    protected void analizeazaStare() {
        System.out.println("Evaluare medicală standard.");
    }

    @Override
    protected void verificaDisponibilitateSalon() {
        System.out.println("Se verifică programarea și disponibilitatea patului.");
    }
}

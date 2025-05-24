public class InternareUrgenta extends InternarePacient {

    @Override
    protected void analizeazaStare() {
        System.out.println("Analiza rapidă a stării critice a pacientului.");
    }

    @Override
    protected void verificaDisponibilitateSalon() {
        System.out.println("Se caută imediat un pat disponibil în zona de urgențe.");
    }
}

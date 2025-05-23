public class AdapterAparatMonitorizare extends AparatMonitorizareNou implements ISistemMonitorizare{

    public AdapterAparatMonitorizare(String presiune, int puls, double temperatura) {
        super(presiune, puls, temperatura);
    }

    @Override
    public void monitorizeazaPacient(String numePacient) {
        String date = super.citesteDateMedicale();
        System.out.println("Monitorizare pentru pacientul: " + numePacient);
        System.out.println("Date vitale: " + date);
    }
}

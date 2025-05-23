public class SistemMonitorizare implements  ISistemMonitorizare {
    private String numePacient;

    public SistemMonitorizare(String numePacient) {
        this.numePacient = numePacient;
    }

    public void monitorizeazaPacient(String numePacient) {
        System.out.println("Monitorizare pacient "+ numePacient);
    }
}

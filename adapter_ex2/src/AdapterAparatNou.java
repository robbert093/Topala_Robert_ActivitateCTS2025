public class AdapterAparatNou implements ISistemMonitorizare {
    private AparatMonitorizareNou aparatMonitorizareNou;

    public AdapterAparatNou(AparatMonitorizareNou aparatMonitorizareNou) {
        this.aparatMonitorizareNou = aparatMonitorizareNou;
    }

    @Override
    public void monitorizeazaPacient(String numePacient) {
        String date = aparatMonitorizareNou.citesteDateMedicale();
        System.out.println("Monitorizare pentru pacientul: " + numePacient);
        System.out.println("Date vitale: " + date);
    }
}

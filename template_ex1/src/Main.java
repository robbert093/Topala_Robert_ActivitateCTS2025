public class Main {
    public static void main(String[] args) {
//        Internarea unui pacient se face după următorii pași: Se analizează dificultatea stării
//        pacientului, Se verifica disponibilitatea in saloanele spitalului, Se emite fisa de internare. Sa se
//        implementeze modului care realizează in aplicație internarea pacienților după acest pattern.

        InternarePacient urgent = new InternareUrgenta();
        InternarePacient standard = new InternareStandard();

        System.out.println("=== Internare Urgentă ===");
        urgent.interneazaPacient();

        System.out.println("\n=== Internare Standard ===");
        standard.interneazaPacient();
    }
}
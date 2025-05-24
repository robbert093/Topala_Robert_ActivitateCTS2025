public class Main {
    public static void main(String[] args) {
//        Pentru internarea unui pacient în spital trebuie verificată gravitatea stării pacientului prin
//        intermediul clasei Pacient, verificarea confirmării Medicului că trebuie internat, verificarea
//        disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si
//        ocupate. Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste verificări separat ci
//        să fie dezvoltat un modul care să permită această verificarea facilă a acestor lucruri.

        Medic medic = new Medic();
        Salon salon = new Salon(1);

        Pacient pacient1 = new Pacient("Andrei", true);
        Pacient pacient2 = new Pacient("Ioana", false);
        Pacient pacient3 = new Pacient("Mihai", true);

        FacadeInternare internare = new FacadeInternare(medic, salon);

        internare.interneazaPacient(pacient1); // Se va interna
        internare.interneazaPacient(pacient2); // Nu are stare gravă
        internare.interneazaPacient(pacient3); // Se va interna dacă e loc
    }
}
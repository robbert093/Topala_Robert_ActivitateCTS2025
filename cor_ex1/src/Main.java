public class Main {
    public static void main(String[] args) {
//        Managerul spitalului dorește sa grăbească procesul de la primiri urgente si astfel operatorul
//        care primește pacienții la triaj va da comenzi de internare sau de tratare imediata pentru pacienții
//        veniți si ii va așeza astfel la alte cozi separate. Comenzile sunt trimise către medici, însă operatorul
//        poate primească alți pacienții mult mai rapid. Sa se implementeze modulul care permite trimiterea
//        de comenzi către medici de la operatorul de primire.

        Medic generalist = new MedicGeneralist();
        Medic specialist = new MedicSpecialist();
        Medic chirurg = new Chirurg();

        generalist.setUrmatorul(specialist);
        specialist.setUrmatorul(chirurg);

        OperatorTriaj triaj = new OperatorTriaj(generalist);

        Pacient p1 = new Pacient("Ion", TipUrgenta.USOARA);
        Pacient p2 = new Pacient("Maria", TipUrgenta.MEDIE);
        Pacient p3 = new Pacient("Alex", TipUrgenta.GRAVA);

        triaj.preiaPacient(p1);
        triaj.preiaPacient(p2);
        triaj.preiaPacient(p3);
    }
}
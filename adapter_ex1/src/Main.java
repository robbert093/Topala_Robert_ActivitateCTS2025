public class Main {
    public static void main(String[] args) {
//        Spitalul deține un mic magazin pentru medicamente și au o aplicație pentru cumpărarea d
//        medicamente pe baza de rețetă. Spitalul închei un contrat cu o farmacie specializată și dorește să
//        integreze sistemul informatic al farmaciei cu sistemul software existent în micul magazin de
//        medicamente. Dezvoltatorii farmaciei trebuie să integreze aceste două aplicații, astfel încât
//        aplicația farmaciei să poate folosi obiectele de tip Medicament din aplicația spitalului. Clasa
//        Medicament din aplicația spitalului are metodele achizitioneazaMedicament() și prezintaReteta().
//        Metoda prezintaReteta() este apelată din achizitioneazaMedicament() pentru verificarea rețetei.
//        Clasa Medicament din aplicația farmaciei are o singură metodă cumpărăMedicament() în care nu
//        se face verificarea rețetei, deoarece farmacia o să vândă medicamente și fără rețetă.


        // Clasa din aplicația spitalului
        MedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol");

        // Adapter folosit în aplicația farmaciei
        IMedicamentFarmacie medicamentFarmacie = new MedicamentAdapter(medicamentSpital);

        // Se cumpără medicamentul prin sistemul farmaciei, cu logică de spital
        medicamentFarmacie.cumparaMedicament();

        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Diclofenac");
        medicamentFarmacie2.cumparaMedicament();
    }
}
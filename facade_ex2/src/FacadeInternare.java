public class FacadeInternare {
    private Medic medic;
    private Salon salon;

    public FacadeInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        if (!pacient.areStareGrava()) {
            System.out.println("Pacientul " + pacient.getNume() + " nu are o stare suficient de gravă pentru internare.");
            return;
        }

        if (!medic.confirmaInternare(pacient)) {
            System.out.println("Medicul nu aprobă internarea pacientului " + pacient.getNume());
            return;
        }

        if (!salon.arePaturiLibere()) {
            System.out.println("Nu există paturi disponibile pentru internarea pacientului " + pacient.getNume());
            return;
        }

        int pat = salon.alocaPat();
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat pe patul " + pat + ".");
    }
}

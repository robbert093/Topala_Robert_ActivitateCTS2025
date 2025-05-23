public class PetrecereFacade {
    private Sala sala;
    private Personal personal;

    public PetrecereFacade() {
        this.sala = new Sala();
        this.personal = new Personal();
    }

    public void rezervaPetrecere(String data, int nrOspatari, int nrBucatari) {
        if (!sala.esteLibera(data)) {
            System.out.println("Nu există sală liberă pentru data: " + data);
            return;
        }
        if (!personal.suntDisponibili(data, nrOspatari, nrBucatari)) {
            System.out.println("Nu există personal disponibil pentru data: " + data);
            return;
        }
        System.out.println("Petrecerea a fost rezervată cu succes pentru data: " + data);
    }
}

public class ProxyRezervare implements IRezervare {
    private IRezervare rezervare;

    public ProxyRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int numarPersoane) {
        if (numarPersoane >= 4) {
            rezervare.rezerva(numeClient, numarPersoane);
        } else {
            System.out.println("Rezervările se pot face doar pentru minimum 4 persoane. Vă așteptăm direct la restaurant.");
        }
    }
}

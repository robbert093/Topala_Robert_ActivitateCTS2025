public class Rezervare implements IRezervare {
    @Override
    public void rezerva(String numeClient, int numarPersoane) {
        System.out.println("Rezervare realizată pentru " + numeClient + " - " + numarPersoane + " persoane.");
    }
}

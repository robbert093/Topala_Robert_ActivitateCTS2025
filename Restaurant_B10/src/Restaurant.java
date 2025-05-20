public class Restaurant {
    public static void main(String[] args) {
        ClientFactory factory = new ClientFactory();

        Client client1 = factory.getClient("Ion Popescu", "0722123123", "ion@email.com");
        Client client2 = factory.getClient("Ion Popescu", "0722123123", "ion@email.com"); // reutilizat

        Rezervare r1 = new Rezervare(5, 4, "18:00", client1);
        Rezervare r2 = new Rezervare(6, 2, "20:00", client2);

        r1.afiseaza();
        r2.afiseaza();
    }
}
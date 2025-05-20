public class Restaurant {
    public static void main(String[] args) {
        IRezervare rezervare = new ProxyRezervare(new Rezervare());

        rezervare.rezerva("Ion Popescu", 5); // Acceptat
        rezervare.rezerva("Maria Ionescu", 2); // Refuzat
    }
}
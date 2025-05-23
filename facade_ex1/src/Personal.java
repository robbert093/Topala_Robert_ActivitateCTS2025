public class Personal {
    public boolean suntDisponibili(String data, int nrOspatari, int nrBucatari) {
        // Simulare disponibilitate
        System.out.println("Verificare personal disponibil pentru data: " + data);
        return nrOspatari <= 3 && nrBucatari <= 2; // exemplu
    }
}

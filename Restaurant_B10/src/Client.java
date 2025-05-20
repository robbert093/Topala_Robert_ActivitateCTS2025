public class Client {
    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    public void afiseazaInformatii() {
        System.out.println("Client: " + nume + ", Tel: " + telefon + ", Email: " + email);
    }
}

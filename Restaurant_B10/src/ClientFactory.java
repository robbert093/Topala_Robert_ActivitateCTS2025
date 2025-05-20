import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    private Map<String, Client> clienti = new HashMap<>();

    public Client getClient(String nume, String telefon, String email) {
        String key = nume + telefon + email;

        if (!clienti.containsKey(key)) {
            clienti.put(key, new Client(nume, telefon, email));
        }
        return clienti.get(key);
    }
}

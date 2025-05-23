import java.util.HashMap;
import java.util.Map;

public class InventarFactory {

    private static Map<String, Inventar> listaInventar = new HashMap<>();

    public static Inventar getInventar(int prosoape, int cearsafuri, int perne, int umerase) {
        String key = prosoape + "-" + cearsafuri + "-" + perne + "-" + umerase;
        Inventar inv = listaInventar.get(key);
        if (inv == null) {
            inv = new InventarCamera(prosoape, cearsafuri, perne, umerase);
            listaInventar.put(key, inv);
        }
        return inv;
    }

}

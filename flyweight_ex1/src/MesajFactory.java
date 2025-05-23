import java.util.HashMap;
import java.util.Map;

public class MesajFactory {
    private static Map<String, IMesaj> mesaje = new HashMap<>();

    public static IMesaj getMesaj(String continut) {
        IMesaj mesaj = mesaje.get(continut);
        if (mesaj == null) {
            mesaj = new MesajMarketing(continut);
            mesaje.put(continut, mesaj);
        }
        return mesaj;
    }
}

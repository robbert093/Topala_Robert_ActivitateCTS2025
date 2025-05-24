import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturiLibere = new ArrayList<>();

    public Salon(int nrPaturi) {
        for (int i = 1; i <= nrPaturi; i++) {
            paturiLibere.add(i);
        }
    }

    public boolean arePaturiLibere() {
        return !paturiLibere.isEmpty();
    }

    public int alocaPat() {
        if (!paturiLibere.isEmpty()) {
            return paturiLibere.remove(0);
        }
        return -1;
    }
}

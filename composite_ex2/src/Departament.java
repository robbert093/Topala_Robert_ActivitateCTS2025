import java.util.ArrayList;
import java.util.List;

public class Departament extends Nod {

    private List<Nod> subitems = new ArrayList<>();

    public Departament(String name) {
        super(name);
    }

    @Override
    public void addNode(Nod nod) {
        subitems.add(nod);
    }

    @Override
    public void deleteNode(Nod nod) {
        subitems.remove(nod);
    }

    @Override
    public Nod getNod(int i) {
        return subitems.get(i);
    }

    @Override
    public void display(int level) {
        System.out.println("  ".repeat(level) + "+ " + name);
        for (Nod item : subitems) {
            item.display(level + 1);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements IMeniu {
    private String denumire;
    private List<IMeniu> copii;

    public SectiuneMeniu(String denumire) {
        this.denumire = denumire;
        this.copii = new ArrayList<>();
    }

    public void adauga(IMeniu element) {
        copii.add(element);
    }

    public void sterge(IMeniu element) {
        copii.remove(element);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "+ " + denumire);
        for (IMeniu copil : copii) {
            copil.afiseaza(indentare + "  ");
        }
    }
}

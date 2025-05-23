import java.util.ArrayList;
import java.util.List;

public class Category extends AItemMenu {
    private List<AItemMenu> subitems = new ArrayList<>();

    public Category(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo(){
        String info = "";
        info += this.denumire + "\n";
        for(AItemMenu n: subitems){
            info += " " + n.getInfo();
            info += "\n";
        }
        return info;
    }

    @Override
    public void afiseaza(int nivel) {
        System.out.println("  ".repeat(nivel) + "+ " + denumire);
        for (AItemMenu item : subitems) {
            item.afiseaza(nivel + 1);
        }
    }

    @Override
    public void addItem(AItemMenu item) {
        subitems.add(item);
    }

    @Override
    public void deleteItem(AItemMenu item) {
        subitems.remove(item);
    }

    @Override
    public AItemMenu getItem(int i) {
        return subitems.get(i);
    }
}

public class ItemMeniu implements IMeniu {
    private String denumire;

    public ItemMeniu(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "- " + denumire);
    }
}

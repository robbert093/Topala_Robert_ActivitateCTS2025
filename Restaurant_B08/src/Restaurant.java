public class Restaurant {
    public static void main(String[] args) {
        SectiuneMeniu meniuPrincipal = new SectiuneMeniu("MENIU");

        SectiuneMeniu startere = new SectiuneMeniu("Startere");
        startere.adauga(new ItemMeniu("Bruschete"));
        startere.adauga(new ItemMeniu("Salată caprese"));

        SectiuneMeniu bauturi = new SectiuneMeniu("Băuturi");
        SectiuneMeniu sucuri = new SectiuneMeniu("Sucuri");
        sucuri.adauga(new ItemMeniu("Cola"));
        sucuri.adauga(new ItemMeniu("Fanta"));

        SectiuneMeniu cafea = new SectiuneMeniu("Cafea");
        cafea.adauga(new ItemMeniu("Espresso"));
        cafea.adauga(new ItemMeniu("Cappuccino"));

        bauturi.adauga(sucuri);
        bauturi.adauga(cafea);

        meniuPrincipal.adauga(startere);
        meniuPrincipal.adauga(bauturi);
        meniuPrincipal.adauga(new ItemMeniu("Desert: Tiramisu"));

        meniuPrincipal.afiseaza("");
    }
}
public class Main {
    public static void main(String[] args) {
        Category meniuPrincipal = new Category("Meniu Principal");

        Category bauturi = new Category("Bauturi");
        Category mancare = new Category("Mancare");

        Category bauturiAlcool = new Category("Bauturi alcoolice");
        Category bauturiNonAlcool = new Category("Bauturi non-alcoolice");

        bauturiAlcool.addItem(new Produs("Vin rosu", 15));
        bauturiAlcool.addItem(new Produs("Bere", 10));

        bauturiNonAlcool.addItem(new Produs("Apa", 5));
        bauturiNonAlcool.addItem(new Produs("Cola", 8));

        bauturi.addItem(bauturiAlcool);
        bauturi.addItem(bauturiNonAlcool);

        Category pizza = new Category("Pizza");
        pizza.addItem(new Produs("Pizza Margherita", 25));
        pizza.addItem(new Produs("Pizza Quattro Stagioni", 30));

        mancare.addItem(pizza);

        meniuPrincipal.addItem(bauturi);
        meniuPrincipal.addItem(mancare);

        // Afișare meniu complet
        meniuPrincipal.afiseaza(0);
    }
}
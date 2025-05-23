public class Main {
    public static void main(String[] args) {
//        Este dorita reprezentarea departamentelor spitalului in cadrul aplicației. Fiecare departament
//        conține subdepartamente sau secții. Secțiile nu conțin subsecții. Sa se implementeze modulul care
//        permite reprezentarea arborescenta a departamentelor si secțiilor spitalului.

        Nod spital = new Departament("Spital General");

        Nod cardio = new Departament("Departament Cardiologie");
        Nod chirurgie = new Departament("Departament Chirurgie");

        Nod sectie1 = new Sectie("Sectia 1");
        Nod sectie2 = new Sectie("Sectia 2");
        Nod sectie3 = new Sectie("Sectia 3");

        cardio.addNode(sectie1);
        chirurgie.addNode(sectie2);
        chirurgie.addNode(sectie3);

        spital.addNode(cardio);
        spital.addNode(chirurgie);

        spital.display(0);
    }
}
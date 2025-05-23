public class Main {
    public static void main(String[] args) {
        PetrecereFacade facade = new PetrecereFacade();

        facade.rezervaPetrecere("2025-12-25", 2, 1); // reusita
        System.out.println("---\n");
        facade.rezervaPetrecere("2025-12-24", 2, 1); // esec sală
        System.out.println("---\n");
        facade.rezervaPetrecere("2025-12-25", 5, 3); // esec personal
    }
}
public class Main {
    public static void main(String[] args) {
        Camera c1 = new Camera(101, "Popescu Ion");
        Camera c2 = new Camera(102, "Ionescu Maria");

        InventarFactory.getInventar(2, 2, 2, 4)
                .afiseazaInventar(c1);

        InventarFactory.getInventar(2, 1, 1, 5)
                .afiseazaInventar(c2);
    }
}
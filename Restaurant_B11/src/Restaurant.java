public class Restaurant {
    public static void main(String[] args) {
        NotaDePlata nota = new NotaDePlata(120.50);

        nota.setModPlata(new PlataCard());
        nota.efectueazaPlata(); // Plata cu cardul

        nota.setModPlata(new PlataCash());
        nota.efectueazaPlata(); // Plata cash
    }
}
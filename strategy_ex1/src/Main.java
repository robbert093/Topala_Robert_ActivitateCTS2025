public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ion Popescu");
        Pacient pacient2 = new Pacient("Maria Ionescu");

        pacient1.setModPlata(new PlataCash());
        pacient2.setModPlata(new PlataCard());

        pacient1.efectueazaPlata(250.0);
        pacient2.efectueazaPlata(430.0);
    }
}
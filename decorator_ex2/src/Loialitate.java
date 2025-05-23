public class Loialitate extends DecoratorBonFiscal {
    private int puncte;

    public Loialitate(IBonFiscal bon, int puncte) {
        super(bon);
        this.puncte = puncte;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Ați acumulat " + puncte + " puncte de loialitate.");
    }
}

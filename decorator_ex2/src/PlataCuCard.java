public class PlataCuCard extends DecoratorBonFiscal {
    public PlataCuCard(IBonFiscal bon) {
        super(bon);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Plata a fost efectuată cu cardul.");
    }
}

public class Felicitare extends DecoratorBonFiscal {
    private String mesaj;

    public Felicitare(IBonFiscal bon, String mesaj) {
        super(bon);
        this.mesaj = mesaj;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Felicitare: "+mesaj);
    }
}

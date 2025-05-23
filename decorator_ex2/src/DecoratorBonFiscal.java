public abstract class DecoratorBonFiscal implements IBonFiscal {
    private IBonFiscal bon;

    public DecoratorBonFiscal(IBonFiscal bon) {
        this.bon = bon;
    }

    @Override
    public void print() {
        bon.print();
    }
}

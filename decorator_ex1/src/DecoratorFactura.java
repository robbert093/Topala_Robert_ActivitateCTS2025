public abstract class DecoratorFactura implements IFactura{
    protected IFactura factura;

    public DecoratorFactura(IFactura factura) {
        this.factura = factura;
    }

    @Override
    public void printare() {
        factura.printare();
    }
}

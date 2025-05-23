public class FelicitareFactura extends DecoratorFactura {
    private double discount;

    public FelicitareFactura(IFactura factura, double discount) {
        super(factura);
        this.discount = discount;
    }

    @Override
    public void printare() {
        super.printare();
        System.out.println("La multi Ani!");

        Factura f = (Factura) factura;
        double sumaFinala = f.getSuma() * (1 - discount / 100);
        System.out.println("S-a aplicat un discount de " + discount + "%.");
        System.out.printf("Suma finală de plată după discount: %.2f RON%n", sumaFinala);
    }
}

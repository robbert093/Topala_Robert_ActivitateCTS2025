public class Main {
    public static void main(String[] args) {
        IFactura factura = new Factura("23.05.2025", 500);
        IFactura facturaDecorata = new FelicitareFactura(factura, 10);

        facturaDecorata.printare();
    }
}
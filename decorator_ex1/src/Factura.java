public class Factura implements IFactura {

    private String data;
    private double suma;

    public Factura(String data, double suma) {
        this.data = data;
        this.suma = suma;
    }

    @Override
    public void printare() {
        System.out.println("Printare factura din data: "+data);
        System.out.println("Total de plata: "+suma);
    }

    public String getData() {
        return data;
    }

    public double getSuma() {
        return suma;
    }
}

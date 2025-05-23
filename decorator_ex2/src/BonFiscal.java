public class BonFiscal implements IBonFiscal {
    private String data;
    private double total;

    public BonFiscal(String data, double total) {
        this.data = data;
        this.total = total;
    }

    @Override
    public void print() {
        System.out.println("Bon fiscal din data: " + data);
        System.out.printf("Total de plată: %.2f RON%n", total);
    }
}

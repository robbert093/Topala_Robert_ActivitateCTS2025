public class Main {
    public static void main(String[] args) {
        IBonFiscal bon = new BonFiscal("23.05.2025", 13.50);

        IBonFiscal bonDecorat = new PlataCuCard(
                new Loialitate(
                        new Felicitare(bon,"Mesaj custom de felicitare"), 25));

        IBonFiscal bonDecorat2 = new Loialitate(bon, 100);

        System.out.println("\n--- Bon simplu ---");
        bon.print();

        System.out.println("\n--- Bon decorat 1 ---");
        bonDecorat.print();

        System.out.println("\n--- Bon decorat 2 ---");
        bonDecorat2.print();
    }
}
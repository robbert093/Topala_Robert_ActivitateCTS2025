public class InventarCamera implements Inventar {
    private int prosoape;
    private int cearsafuri;
    private int perne;
    private int umerase;

    public InventarCamera(int prosoape, int cearsafuri, int perne, int umerase) {
        this.prosoape = prosoape;
        this.cearsafuri = cearsafuri;
        this.perne = perne;
        this.umerase = umerase;
    }

    @Override
    public void afiseazaInventar(Camera camera) {
        System.out.println("Camera #" + camera.getNumarCamera() + " pentru " + camera.getNumeClient());
        System.out.println("Prosoape: " + prosoape + ", Cearșafuri: " + cearsafuri +
                ", Perne: " + perne + ", Umerașe: " + umerase);
        System.out.println("-----------------------------------");
    }
}

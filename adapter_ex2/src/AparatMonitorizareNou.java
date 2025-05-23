public class AparatMonitorizareNou {
    private String presiune;
    private int puls;
    private double temperatura;

    public AparatMonitorizareNou(String presiune, int puls, double temperatura) {
        this.presiune = presiune;
        this.puls = puls;
        this.temperatura = temperatura;
    }

    public String citesteDateMedicale() {
        return "Presiune: "+presiune+", Puls: "+puls+", Temperatura: "+temperatura+"°C";
    }
}

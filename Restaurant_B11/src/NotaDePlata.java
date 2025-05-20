public class NotaDePlata {
    private double suma;
    private ModPlata modPlata;

    public NotaDePlata(double suma) {
        this.suma = suma;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void efectueazaPlata() {
        if (modPlata != null) {
            modPlata.plateste(suma);
        } else {
            System.out.println("Metoda de plată nu a fost setată!");
        }
    }
}

public class MesajMarketing implements IMesaj {
    private String mesaj;

    public MesajMarketing(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void afiseazaMesaj(BonFiscal bon) {
        System.out.println("Mesaj simpatic pentru masa "+bon.getMasa());
        System.out.println(mesaj);
    }
}

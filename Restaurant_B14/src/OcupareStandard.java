public class OcupareStandard extends ModOcupareMasa {

    @Override
    protected void curataMasa() {
        System.out.println("Se curăță masa...");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Se așază șervețele pe masă...");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Se așază tacâmurile...");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Clientii sunt invitați să se așeze la masă.");
    }
}

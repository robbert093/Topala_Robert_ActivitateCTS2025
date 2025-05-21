public abstract class ModOcupareMasa {
    // template method
    public final void ocupaMasa() {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoane();
}

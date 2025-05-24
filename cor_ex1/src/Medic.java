public abstract class Medic {
    protected Medic urmatorul;

    public void setUrmatorul(Medic urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void trateaza(Pacient pacient);
}

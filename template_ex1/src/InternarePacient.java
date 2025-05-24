public abstract class InternarePacient {

    // Template method
    public final void interneazaPacient() {
        analizeazaStare();
        verificaDisponibilitateSalon();
        emiteFisaInternare();
    }

    protected abstract void analizeazaStare();
    protected abstract void verificaDisponibilitateSalon();

    // Pas fix, implementat deja
    private void emiteFisaInternare() {
        System.out.println("Fișa de internare a fost emisă.");
    }
}

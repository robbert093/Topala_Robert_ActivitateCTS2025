public class PlataCard implements ModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul: " + suma + " lei.");
    }
}

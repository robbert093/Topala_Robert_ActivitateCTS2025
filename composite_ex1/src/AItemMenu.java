public abstract class AItemMenu {
    String denumire;

    public abstract String getDenumire();
    public abstract int getPret();

    public String getInfo(){
        return this.getDenumire() + " " + this.getPret();
    }

    public abstract void afiseaza(int nivel);

    public void addItem(AItemMenu elemStructura){
        throw new UnsupportedOperationException();
    }

    public void deleteItem(AItemMenu elemStructura){
        throw new UnsupportedOperationException();
    }

    public AItemMenu getItem (int i){
        throw new UnsupportedOperationException();
    }
}

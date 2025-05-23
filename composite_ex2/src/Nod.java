public abstract class Nod {
    protected String name;

    public Nod(String name) {
        this.name = name;
    }

    public void addNode(Nod nod) {
        throw new UnsupportedOperationException();
    }

    public void deleteNode(Nod nod) {
        throw new UnsupportedOperationException();
    }

    public Nod getNod(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void display(int level);

}

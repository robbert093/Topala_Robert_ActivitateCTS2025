public class Sectie extends Nod {
    public Sectie(String name) {
        super(name);
    }

    @Override
    public void display(int level) {
        System.out.println("  ".repeat(level) + "- " + name);
    }
}

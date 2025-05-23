public class Main {
    public static void main(String[] args) {
        //adapter de clase
        ISistemMonitorizare sistemMonitorizare = new AdapterAparatMonitorizare(
                "120/80", 72, 36.4);
        sistemMonitorizare.monitorizeazaPacient("Ion Popescu");

        //adapter de obiecte
        AparatMonitorizareNou aparatNou = new AparatMonitorizareNou("115/85",80, 36.8);
        ISistemMonitorizare sistemMonitorizare2 = new AdapterAparatNou(aparatNou);
        sistemMonitorizare2.monitorizeazaPacient("Grigore Vasilescu");
    }
}
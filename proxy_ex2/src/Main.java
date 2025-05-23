public class Main {
    public static void main(String[] args) {
//        Deoarece Spitalul este supraaglomerat se impune ca atunci când pacienții doresc internarea să
//        fie internate doar personale care au asigurare de sănătate. Sa se realizeze un nivel intermediar care
//        sa permită internarea doar acestor persoane.

        Spital spital = new Spital();
        IInternare proxy = new ProxyInternare(spital);

        Pacient p1 = new Pacient("Andrei Pop", true);
        Pacient p2 = new Pacient("Ioana Vasilescu", false);

        // fare verificare asiguare
        spital.interneaza(p1);

        // cu verificare asigurare
        proxy.interneaza(p1); // admis
        proxy.interneaza(p2); // respins
    }
}
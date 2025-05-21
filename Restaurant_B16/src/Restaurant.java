public class Restaurant {
    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmator(notificatorEmail);
        notificatorEmail.setUrmator(notificatorManager);

        Client c1 = new Client("Andrei", "0712345678", "andrei@mail.com");
        Client c2 = new Client("Maria", null, "maria@mail.com");
        Client c3 = new Client("Ion", null, null);

        String mesaj = "Avem o nouă ofertă pentru tine!";

        notificatorSMS.trimiteNotificare(c1, mesaj);
        notificatorSMS.trimiteNotificare(c2, mesaj);
        notificatorSMS.trimiteNotificare(c3, mesaj);
    }
}
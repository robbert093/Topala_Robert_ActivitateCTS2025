public class NotificatorManager extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("ATENȚIE! Clientul " + client.getNume() + " nu are date de contact. Se notifică managerul.");
    }
}

public class NotificatorEmail extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if (client.getEmail() != null && !client.getEmail().isEmpty()) {
            System.out.println("Email trimis către " + client.getNume() + ": " + mesaj);
        } else if (urmator != null) {
            urmator.trimiteNotificare(client, mesaj);
        }
    }
}

public class Camera {
    private int numarCamera;
    private String numeClient;

    public Camera(int numarCamera, String numeClient) {
        this.numarCamera = numarCamera;
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNumarCamera() {
        return numarCamera;
    }
}

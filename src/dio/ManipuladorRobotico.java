package dio;
public class ManipuladorRobotico {
    private static ManipuladorRobotico instance = null;
    private boolean caixaDetectada;

    private ManipuladorRobotico() {
        this.caixaDetectada = false;
    }

    public static ManipuladorRobotico getInstance() {
        if (instance == null) {
            instance = new ManipuladorRobotico();
        }
        return instance;
    }

    public void setCaixaDetectada(boolean caixaDetectada) {
        this.caixaDetectada = caixaDetectada;
    }

    public boolean isCaixaDetectada() {
        return this.caixaDetectada;
    }
}

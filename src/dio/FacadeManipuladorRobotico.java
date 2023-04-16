package dio;

public class FacadeManipuladorRobotico {
    private ManipuladorRobotico manipuladorRobotico;
    private EstadoManipuladorRobotico estadoParado;
    private EstadoManipuladorRobotico estadoFuncionando;

    public FacadeManipuladorRobotico() {
        this.manipuladorRobotico = ManipuladorRobotico.getInstance();
        this.estadoParado = new EstadoParado();
        this.estadoFuncionando = new EstadoFuncionando();
    }

    public void executar() {
        if (manipuladorRobotico.isCaixaDetectada()) {
            estadoFuncionando.executar();
        } else {
            estadoParado.executar();
        }
    }
}

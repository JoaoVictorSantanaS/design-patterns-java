import dio.FacadeManipuladorRobotico;
import dio.ManipuladorRobotico;

public class Main {
    public static void main(String[] args) {
        FacadeManipuladorRobotico facade = new FacadeManipuladorRobotico();

        // Manipulador robótico está parado
        facade.executar();

        // Simula a detecção de uma caixa
        ManipuladorRobotico.getInstance().setCaixaDetectada(true);

        // Manipulador robótico está funcionando
        facade.executar();

        // Simula a detecção de uma caixa
        ManipuladorRobotico.getInstance().setCaixaDetectada(false);

        // Manipulador robótico está funcionando
        facade.executar();
    }
}
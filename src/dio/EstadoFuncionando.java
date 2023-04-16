package dio;

public class EstadoFuncionando implements EstadoManipuladorRobotico {
    @Override
    public void executar() {
        System.out.println("Manipulador robótico está funcionando.");
    }
}

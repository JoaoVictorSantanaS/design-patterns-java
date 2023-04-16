package dio;

public class EstadoParado implements EstadoManipuladorRobotico {
    @Override
    public void executar(){
        System.out.println("Manipulador robótico está parado.");
    }
}

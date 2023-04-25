public class Zapping {
    public Zapping() {
    }
    public int calcularClics (int canalOrigen, int canalDestino){
        int clics = Math.abs(canalDestino - canalOrigen);
        if (clics > 50){
            clics = 99 - clics;
        }
        return clics;
    }
}

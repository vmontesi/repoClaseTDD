public class Zapping {
    public Zapping() {
    }
    public int calcularClics (int canalOrigen, int canalDestino){
        return Math.min(Math.abs(canalDestino - canalOrigen), Math.min(canalOrigen, canalDestino) + 99 - Math.max(canalOrigen, canalDestino));
    }
}

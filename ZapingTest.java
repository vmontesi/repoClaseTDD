import static org.junit.Assert.assertEquals;

public class ZapingTest {

    @org.junit.jupiter.api.Test
    public void testCanalOrigen0CanalDestino0() {
        Zapping zapping = new Zapping();
        int clics = zapping.calcularClics(0, 0);
        assertEquals(0, clics);
    }

    @org.junit.jupiter.api.Test
    public void testCanalOrigen1CanalDestino2() {
        Zapping zapping = new Zapping();
        int clics = zapping.calcularClics(1, 2);
        assertEquals(1, clics);
    }

    @org.junit.jupiter.api.Test
    public void testCanalOrigen10CanalDestino30() {
        Zapping zapping = new Zapping();
        int clics = zapping.calcularClics(10, 30);
        assertEquals(20, clics);
    }

    @org.junit.jupiter.api.Test
    public void testCanalOrigen2CanalDestino99() {
        Zapping zapping = new Zapping();
        int clics = zapping.calcularClics(2, 99);
        assertEquals(2, clics);
    }

    @org.junit.jupiter.api.Test
    public void testCanalOrigen5CanalDestino63() {
        Zapping zapping = new Zapping();
        int clics = zapping.calcularClics(5, 63);
        assertEquals(41, clics);
    }
}

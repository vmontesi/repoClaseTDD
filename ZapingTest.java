import static org.junit.Assert.assertEquals;

public class ZapingTest {

    @org.junit.jupiter.api.Test
    public void testCanalOrigen1() {
        Zapping zapping = new Zapping();
        int clics = zapping.calcularClics(0,0);
        assertEquals(0, clics);
    }
    @org.junit.jupiter.api.Test
    public void testCanalOrigen2() {
        Zapping zapping = new Zapping();
        int clics = zapping.calcularClics(1,2);
        assertEquals(1, clics);
    }
}

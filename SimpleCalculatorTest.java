import org.junit.*;

import static junit.framework.TestCase.assertEquals;



public class SimpleCalculatorTest {
    @org.junit.Test
    public void add() throws Exception {
    }

    @org.junit.Test
    public void subtract() throws Exception {
    }

    @org.junit.Test
    public void multiply() throws Exception {
    }

    @org.junit.Test
    public void divide() throws Exception {
    }

    private SimpleCalculator calculator;
    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }
    @Test
    public void testAddSuma() {
        System.out.println("Suma dos números positivos");
        float n1 = 7;
        float n2 = 6;
        float expected = 13;
        float actual;
        actual = this.calculator.add(n1, n2);
        assertEquals(expected, actual, 0.000);
    }

    @Test
    public void assertTestSuma(){
        System.out.println("Suma dos números positivos");
        Integer resultado = 7+6;
        Assert.assertNotNull(resultado);
        System.out.println(resultado);
    }


   @Test
    public void Resta(){
       System.out.println("Resta dos números");
        Integer resultado = 7-6;
        Assert.assertNotNull(resultado);
       System.out.println(resultado);
    }
    @Test
    public void Multiplicacion(){
        System.out.println("Multiplica dos números");
        Integer resultado = 7*6;
        Assert.assertNotNull(resultado);
        System.out.println(resultado);
    }

    @Test
    public void Divide(){
        System.out.println("Divide dos números");
        Integer resultado = 7/6;
        Assert.assertNotNull(resultado);
        System.out.println(resultado);
    }

    @Test
    public void DivideCero(){
        System.out.println("Divide dos números");
        Integer resultado = 7/0;
        Assert.assertNotNull(resultado);
        System.out.println(resultado);
    }


}
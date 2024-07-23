package recursao;

import org.junit.Assert;
import org.junit.Test;

public class MetodosRecursivosTest {

    private MetodosRecursivos mr;

    public void MetodosRecursivosTest() {
        mr = new MetodosRecursivos();
    }


    @Test
    public void calcularSomaArrayTest() {
        MetodosRecursivosTest();
        int[] c = new int[5];
        c[0] = 1;
        Assert.assertEquals(1, mr.calcularSomaArray(c));
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        Assert.assertEquals(3, mr.calcularSomaArray(a));
        int[] b = new int[5];
        b[0] = 1;
        b[1] = 1;
        b[2] = 1;
        b[3] = 1;
        b[4] = 1;
        Assert.assertEquals(5, mr.calcularSomaArray(b));

    }

    @Test
    public void calcularFatorialTest() {
        MetodosRecursivosTest();
        Assert.assertEquals(1, mr.calcularFatorial(0));
        Assert.assertEquals(1, mr.calcularFatorial(1));
        Assert.assertEquals(6, mr.calcularFatorial(3));
        Assert.assertEquals(720, mr.calcularFatorial(6));
    }

    @Test
    public void calcularFibonacciTest() {
        MetodosRecursivosTest();
        Assert.assertEquals(0, mr.calcularFibonacci(0));
        Assert.assertEquals(1, mr.calcularFibonacci(1));
        Assert.assertEquals(1, mr.calcularFibonacci(2));
        Assert.assertEquals(2, mr.calcularFibonacci(3));
        Assert.assertEquals(34, mr.calcularFibonacci(9));
        Assert.assertEquals(55, mr.calcularFibonacci(10));
    }

    @Test
    public void countNotNullTest() {
        MetodosRecursivosTest();
        Object[] a = new Object[5];
        Assert.assertEquals(0, mr.countNotNull(a));
        a[0] = 1;
        a[1] = 1;
        Assert.assertEquals(2, mr.countNotNull(a));
        a[2] = 1;
        a[3] = 1;
        a[4] = 1;
        Assert.assertEquals(5, mr.countNotNull(a));
    }

    @Test
    public void potenciaDe2Test() {
        MetodosRecursivosTest();
        Assert.assertEquals(1, mr.potenciaDe2(0));
        Assert.assertEquals(2, mr.potenciaDe2(1));
        Assert.assertEquals(4, mr.potenciaDe2(2));
        Assert.assertEquals(1024, mr.potenciaDe2(10));
    }

    @Test
    public void progressaoAritmetica() {
        MetodosRecursivosTest();
        double delta = 0.0001;
        Assert.assertEquals(5, mr.progressaoAritmetica(0, 1, 5), delta);
        Assert.assertEquals(20, mr.progressaoAritmetica(10, 2, 5), delta);
        Assert.assertEquals(55, mr.progressaoAritmetica(5, 5, 10), delta);
        Assert.assertEquals(1, mr.progressaoAritmetica(1, 0, 1), delta);
    }

    @Test
    public void progressaoGeometrica() {
        MetodosRecursivosTest();
        double delta = 0.0001;
        Assert.assertEquals(16, mr.progressaoGeometrica(2, 2, 3), delta);
        Assert.assertEquals(125, mr.progressaoGeometrica(1, 5, 3), delta);
        Assert.assertEquals(0, mr.progressaoGeometrica(0, 100, 18), delta);
        Assert.assertEquals(0, mr.progressaoGeometrica(100, 0, 50), delta);
        Assert.assertEquals(100, mr.progressaoGeometrica(100, 1, 1), delta);
        Assert.assertEquals(59049, mr.progressaoGeometrica(1, 3, 10), delta);
    }

} 

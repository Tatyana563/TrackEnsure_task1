import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
Main main;


@BeforeEach
void setUp(){
    main=new Main();
    double[]x = {1.};
   // MyArr myarray = new MyArr();
}
    @Test
    void numMax() {
    int expected=4;
    int res=main.numMax(new double[]{1.1,1.2,1.3,1.4,1.5});
    assertEquals(expected,res);
    }

    @Test
    void numMin() {
        int expected=0;
        int res=main.numMin(new double[]{1.1,1.2,1.3,1.4,1.5});
        assertEquals(expected,res);
    }

    @Test
    void function() {
       double expected=0.025;
       double res=main.f(3);
       assertEquals(expected,res,1e-4);
    }

    @Test

    void testStepNumber() {
    int expected=5;
    double res=main.stepNumber(1.1,5.2,1);
    assertEquals(expected,res);
    }

    @Test
    void tab() {
       double [] expected1 = {2.0,2.005,2.01,2.015};
       double [] expected2= {0.0105,0.0106,0.0106, 0.0107};
     MyArr arr = main.tabToArrays(2,2.015,0.005);

assertArrayEquals(expected1,arr.getX(),0.001);
assertArrayEquals(expected2,arr.getY(),0.001);

    }

    @Test
    void average() {
        double expected=3.0;
        double[] arr={1.0,2.0,3.0,6.0};
        double res=main.average(arr);
        assertEquals(expected,res);
    }
    @Test
    void testSum(){
    double expected=12;
        double[] arr={1.0,2.0,3.0,6.0};
    double res=main.sum(arr);
    assertEquals(expected,res);
    }
}
import junit.framework.TestCase;

public class UpgradedTriangleTestCalculate extends TestCase {
    public void test1(){
        assertEquals(UpgradedTriangle.calculateArea(0,0,0),0.0);
    }
    public void test2(){
        assertEquals(UpgradedTriangle.calculateArea(-1,2,1),0.0);
    }
    public void test3(){
        assertEquals(UpgradedTriangle.calculateArea(1,1,1),0.4330127018922193);
    }
    public void test4(){
        assertEquals(UpgradedTriangle.calculateArea(1,2,3),0.0);
    }
    public void test5(){
        assertEquals(UpgradedTriangle.calculateArea(1000000000,1000000000,1000000000),433012701892219323.0);
    }
    public void test6(){
        assertEquals(UpgradedTriangle.calculateArea(3,4,5),6.0);
    }
    public void test7(){
        assertEquals(UpgradedTriangle.calculateArea(2,3,4),2.9047375096555625);
    }
    public void test8(){
        assertEquals(UpgradedTriangle.calculateArea(10,8,3),9.921567416492215);
    }
    public void test9(){
        assertEquals(UpgradedTriangle.calculateArea(0,1,10),0.00);
    }
    public void test10(){
        assertEquals(UpgradedTriangle.calculateArea(-1,-1,-1),0.00);
    }
    public void test11(){
        assertEquals(UpgradedTriangle.calculateArea(1,3,5),0.0);
    }
    public void test12(){
        assertEquals(UpgradedTriangle.calculateArea(1,1000,1000000),0.0);
    }
    public void test13(){
        assertEquals(UpgradedTriangle.calculateArea(1,1000000000,1000000000),500000000.0);
    }
    public void test14(){
        assertEquals(UpgradedTriangle.calculateArea(2,999999999,1000000000),866025403.3514259);
    }
    public void test15(){
        assertEquals(UpgradedTriangle.calculateArea(500000001,500000000,1000000000),11180339890294.033);
    }
}

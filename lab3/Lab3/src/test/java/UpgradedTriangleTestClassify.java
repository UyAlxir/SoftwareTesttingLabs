import junit.framework.TestCase;
//import static Type.*;

public class UpgradedTriangleTestClassify extends TestCase {
    public void test1() {
        assertEquals (UpgradedTriangle.classify(0,1301,1), UpgradedTriangle.Type.INVALID);
    }
    public void test2() {
        assertEquals (UpgradedTriangle.classify(1108,1,1), UpgradedTriangle.Type.INVALID);
    }
    public void test3() {
        assertEquals (UpgradedTriangle.classify(1,0,-665), UpgradedTriangle.Type.INVALID);
    }
    public void test4() {
        assertEquals (UpgradedTriangle.classify(1,1,0), UpgradedTriangle.Type.INVALID);
    }
    public void test5() {
        assertEquals (UpgradedTriangle.classify(582,582,582), UpgradedTriangle.Type.EQUILATERAL);
    }
    public void test6() {
        assertEquals (UpgradedTriangle.classify(1,1088,15), UpgradedTriangle.Type.INVALID);
    }
    public void test7() {
        assertEquals (UpgradedTriangle.classify(1,2,450), UpgradedTriangle.Type.INVALID);
    }
    public void test8() {
        assertEquals (UpgradedTriangle.classify(1663,1088,823), UpgradedTriangle.Type.SCALENE);
    }
    public void test9() {
        assertEquals (UpgradedTriangle.classify(1187,1146,1), UpgradedTriangle.Type.INVALID);
    }
    public void test10() {
        assertEquals (UpgradedTriangle.classify(1640,1640,1956), UpgradedTriangle.Type.ISOSCELES);
    }
    public void test11() {
        assertEquals (UpgradedTriangle.classify(784,784,1956), UpgradedTriangle.Type.INVALID);
    }
    public void test12() {
        assertEquals (UpgradedTriangle.classify(1,450,1), UpgradedTriangle.Type.INVALID);
    }
    public void test13() {
        assertEquals (UpgradedTriangle.classify(1146,1,1146), UpgradedTriangle.Type.ISOSCELES);
    }
    public void test14() {
        assertEquals (UpgradedTriangle.classify(1640,1956,1956), UpgradedTriangle.Type.ISOSCELES);
    }
    public void test15() {
        assertEquals (UpgradedTriangle.classify(-1,1,1), UpgradedTriangle.Type.INVALID);
    }
    public void test16() {
        assertEquals (UpgradedTriangle.classify(1,-1,1), UpgradedTriangle.Type.INVALID);
    }
    public void test17() {
        assertEquals (UpgradedTriangle.classify(1,2,3), UpgradedTriangle.Type.INVALID);
    }
    public void test18() {
        assertEquals (UpgradedTriangle.classify(2,3,1), UpgradedTriangle.Type.INVALID);
    }
    public void test19() {
        assertEquals (UpgradedTriangle.classify(3,1,2), UpgradedTriangle.Type.INVALID);
    }
    public void test20() {
        assertEquals (UpgradedTriangle.classify(1,1,2), UpgradedTriangle.Type.INVALID);
    }
    public void test21() {
        assertEquals (UpgradedTriangle.classify(1,2,1), UpgradedTriangle.Type.INVALID);
    }
    public void test22() {
        assertEquals (UpgradedTriangle.classify(2,1,1), UpgradedTriangle.Type.INVALID);
    }
    public void test23() {
        assertEquals (UpgradedTriangle.classify(1,1,1), UpgradedTriangle.Type.EQUILATERAL);
    }
    public void test24() {
        assertEquals (UpgradedTriangle.classify(0,1,1), UpgradedTriangle.Type.INVALID);
    }
    public void test25() {
        assertEquals (UpgradedTriangle.classify(1,0,1), UpgradedTriangle.Type.INVALID);
    }
    public void test26() {
        assertEquals (UpgradedTriangle.classify(1,2,-1), UpgradedTriangle.Type.INVALID);
    }
    public void test27() {
        assertEquals (UpgradedTriangle.classify(1,1,-1), UpgradedTriangle.Type.INVALID);
    }
    public void test28() {
        assertEquals (UpgradedTriangle.classify(0,0,0), UpgradedTriangle.Type.INVALID);
    }
    public void test29() {
        assertEquals (UpgradedTriangle.classify(3,2,5), UpgradedTriangle.Type.INVALID);
    }
    public void test30() {
        assertEquals (UpgradedTriangle.classify(5,9,2), UpgradedTriangle.Type.INVALID);
    }
    public void test31() {
        assertEquals (UpgradedTriangle.classify(7,4,3), UpgradedTriangle.Type.INVALID);
    }
    public void test32() {
        assertEquals (UpgradedTriangle.classify(3,8,3), UpgradedTriangle.Type.INVALID);
    }
    public void test33() {
        assertEquals (UpgradedTriangle.classify(7,3,3), UpgradedTriangle.Type.INVALID);
    }
    public void test34() {
        assertEquals (UpgradedTriangle.classify(-1,-1,-1), UpgradedTriangle.Type.INVALID);
    }
    public void test35() {
        assertEquals (UpgradedTriangle.classify(0,0,0), UpgradedTriangle.Type.INVALID);
    }
    public void test36() {
        assertEquals (UpgradedTriangle.classify(0,1,1), UpgradedTriangle.Type.INVALID);
    }
    public void test37() {
        assertEquals (UpgradedTriangle.classify(1,0,1), UpgradedTriangle.Type.INVALID);
    }
    public void test38() {
        assertEquals (UpgradedTriangle.classify(1,1,0), UpgradedTriangle.Type.INVALID);
    }
    public void test39() {
        assertEquals (UpgradedTriangle.classify(-1,1,1), UpgradedTriangle.Type.INVALID);
    }
    public void test40() {
        assertEquals (UpgradedTriangle.classify(1,-1,1), UpgradedTriangle.Type.INVALID);
    }
    public void test41() {
        assertEquals (UpgradedTriangle.classify(1,1,-1), UpgradedTriangle.Type.INVALID);
    }
}

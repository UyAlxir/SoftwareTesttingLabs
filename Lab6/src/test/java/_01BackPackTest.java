import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class _01BackPackTest {
    private  _01backpack backpack = new _01backpack();

    @Before
    public void beforeTest(){
        backpack = new _01backpack();
    }

    @Test
    public void test1(){
        int[] w= {2, 3, 5, 4, 7};
        int[] v= {5, 6, 10, 8, 15};
        int vol = 10;
        int ans = 21;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test2(){
        int[] w= {2, 3, 5, 4, 7, 1, 6};
        int[] v= {5, 6, 10, 8, 15, 3, 12};
        int vol = 15;
        int ans = 33;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test3(){
        int[] w = {3, 5, 2, 9, 6, 7, 4};
        int[] v = {8, 12, 6, 15, 10, 18, 9};
        int vol = 20;
        int ans = 47;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }


    @Test
    public void test4(){
        int[] w = {4, 6, 3, 2, 8, 5, 7};
        int[] v = {7, 12, 5, 3, 15, 9, 11};
        int vol = 13;
        int ans = 24;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test5(){
        int[] w = {5, 2, 7, 3, 1, 6, 4};
        int[] v = {10, 6, 15, 8, 3, 12, 7};
        int vol = 9;
        int ans = 21;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test6(){
        int[] w = {6, 7, 2, 4, 5, 3, 1};
        int[] v = {12, 15, 5, 8, 10, 6, 3};
        int vol = 20;
        int ans = 43;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test7(){
        int[] w = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 15, 25, 35, 45, 55, 65, 75, 85, 95, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int[] v = {20, 35, 50, 60, 75, 90, 100, 120, 135, 150, 25, 40, 55, 70, 85, 100, 110, 130, 145, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
        int vol = 250;
        int ans = 545;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test8(){
        int[] w = {2, 6, 10, 8, 5, 7, 12, 3, 9, 11, 4, 1, 15, 18, 13, 17, 14, 16, 20, 19}; // replace with any array of item weights
        int[] v = {8, 20, 30, 25, 15, 22, 40, 10, 28, 35, 12, 5, 50, 60, 42, 55, 38, 48, 75, 68}; // replace with any array of item values
        int vol = 50;
        int ans = 181;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test9(){
        int[] w = {10, 17, 12, 14, 15, 13, 11};
        int[] v = {12, 15, 5, 8, 10, 6, 3};
        int vol = 9;
        int ans = 0;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test10(){
        int[] w = {6, 7, 2, 4, 5, 3, 1};
        int[] v = {12, 15, 5, 8, 10, 6, 3};
        int vol = 60;
        int ans = 59;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test11(){
        int[] w = {120, 150, 180, 200, 250, 300, 350, 400, 450, 500};
        int[] v = {30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        int vol = 1000;
        int ans = 270;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test12(){
        int[] w = {3, 6, 5, 4, 2, 7, 8, 9, 1, 4};
        int[] v = {10, 20, 15, 16, 8, 25, 27, 30, 5, 18};
        int vol = 25;
        int ans = 94;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test13(){
        int[] w = {10, 5, 8, 3, 6, 2, 7, 4, 9, 1};
        int[] v = {20, 10, 30, 15, 25, 8, 35, 18, 28, 12};
        int vol = 50;
        int ans = 191;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test14(){
        int[] w = {5, 7, 3, 4, 2};
        int[] v = {10, 15, 8, 12, 6};
        int vol = 20;
        int ans = 45;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }

    @Test
    public void test15(){
        int[] w = {2, 4, 3};
        int[] v = {8, 10, 6};
        int vol = 7;
        int ans = 18;
        assertTrue(ans==backpack.backpack(w,v,vol));
    }
}

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest{
    private BubbleSort bubbleSort = new BubbleSort();

    @Before
    public void beforeTest(){
        bubbleSort = new BubbleSort();
    }

    @Test
    public void test1(){
        int[] input = {3,2,1};
        int[] out = {1,2,3};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test2(){
        int[] input = {1,2,1};
        int[] out = {1,1,2};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test3(){
        int[] input = {1,1,1};
        int[] out = {1,1,1};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test4(){
        int[] input = {-1,0,1};
        int[] out = {-1,0,1};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test5(){
        int[] input = {1000000000,-1000000000,0};
        int[] out = {-1000000000,0,1000000000};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test6(){
        int[] input = {8, 2, 7, 6, 4};
        int[] out = {2,4,6,7,8};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test7() {
        int[] input = {1, 3, 5, 6, 7, 8};
        int[] out = {1, 3, 5, 6, 7, 8};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test8() {
        int[] input = {-1000,-1111,-999};
        int[] out = {-1111,-1000,-999};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test9() {
        int[] input = {-1000000000,-1000000,-1000};
        int[] out = {-1000000000,-1000000,-1000};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test10() {
        int[] input = {};
        int[] out = {};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test11() {
        int[] input = {-5,-2,-3,0,-1,2,1,4,3,5};
        int[] out = {-5,-3,-2,-1,0,1,2,3,4,5};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test12() {
        int[] input = {0};
        int[] out = {0};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test13() {
        int[] input = {5,4,3,2,1};
        int[] out = {1,2,3,4,5};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test14() {
        int[] input = {10,1,2,3,4,9,5,6,7,8};
        int[] out = {1,2,3,4,5,6,7,8,9,10};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }

    @Test
    public void test15() {
        int[] input = {1,1,1,1,1,0,0,0,0,0};
        int[] out = {0,0,0,0,0,1,1,1,1,1};
        assertTrue(Arrays.equals(out,bubbleSort.sort(input,input.length)));
    }
}

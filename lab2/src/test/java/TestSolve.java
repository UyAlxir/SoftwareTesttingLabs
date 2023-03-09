import org.junit.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestSolve {
    Solve solve;

    @BeforeClass
    public static void runBeforeClass(){
        System.out.println("the function Solve2.getMax() will be tested by several testcases");
    }

    @Before
    public void runBefore(){
        solve = new Solve();
        System.out.println("This is the beginning  of a Test");
    }

    @After
    public void runAfter(){
        System.out.println("This is the end of a Test");
    }

    @AfterClass
    public static void runAfterClass(){
        System.out.println("the function Solve2.getMax() has been tested by whole testcases");
    }

    @Test
    public void testSolve2ByReadingTestFile(){
        String filepath = "src/main/resources/testinput.txt";
        File file = new File(filepath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                String[] cur = tempString.split(",");
                int input = Integer.valueOf(cur[0]);
                long output = Long.valueOf(cur[1]);
                assertEquals(output,solve.getMax(input));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+" is successful");
    }

    @Test
    public void TestSolve2Single1(){
        assertEquals(6,solve.getMax(5));
        assertEquals(9,solve.getMax(6));
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+" is successful");
    }

    @Test
    public void TestSolve2Single2(){
        assertEquals(1,solve.getMax(1));
        assertEquals(1,solve.getMax(2));
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+" is successful");
    }
}

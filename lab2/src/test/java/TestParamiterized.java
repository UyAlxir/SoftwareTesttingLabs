import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestParamiterized {
    private int input;
    private long expected;
    private Solve solve;

    @Before
    public void setUp(){
        solve = new Solve();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ArrayList<Object[]> arrayList = new ArrayList();
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
                Object[] curs = new Object[]{input,output};
                arrayList.add(curs);
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
        return arrayList;
    }

    public TestParamiterized(int input,long output){
        this.input = input;
        this.expected = output;
    }

    @Test
    public void test(){
        assertEquals(expected,solve.getMax(input));
    }
}

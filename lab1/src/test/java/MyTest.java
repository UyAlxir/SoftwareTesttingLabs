import org.junit.Test;

import static org.junit.Assert.*;

public class MyTest {
    @Test
    public void testMyClass(){
        Myclass myclass = new Myclass();
        assertTrue(myclass.check(8));
        assertTrue(myclass.check(13));
        assertTrue(myclass.check(93));
        assertFalse(myclass.check(9));
        assertFalse(myclass.check(4));
        assertFalse(myclass.check(14));
        assertEquals(true,myclass.check(10));
        assertEquals(true,myclass.check(23));
        assertEquals(true,myclass.check(71));
    }

}

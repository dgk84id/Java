package jul;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

    //@Test
    @Test(timeout=1000) 
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested
        /*This test assumes that the MyClass class exists and has a multiply(int, int) method.*/
        // assert statements
        assertEquals(0, tester.multiply(10, 0));
        assertEquals(0, tester.multiply(0, 10));
        assertEquals(0, tester.multiply(0, 0));
        
    }
}

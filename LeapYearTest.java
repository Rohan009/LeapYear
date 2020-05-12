import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {
	
	@Test
    public void testCase1() {
        assertEquals( false, LeapYear.checkLeapYear(1700));
    }
	
	@Test
    public void testCase2() {
        assertEquals( false, LeapYear.checkLeapYear(1900));
    }
	
	@Test
    public void testCase3() {
        assertEquals( true, LeapYear.checkLeapYear(2000));
    }
	
	@Test
    public void testCase4() {
        assertEquals( true, LeapYear.checkLeapYear(1600));
    }
	
	@Test
    public void testCase5() {
        assertEquals( false, LeapYear.checkLeapYear(100));
    }
	
	@Test
    public void testCase6() {
        assertEquals( true, LeapYear.checkLeapYear(1996));
    }
	
	@Test
    public void testCase7() {
        assertEquals( true, LeapYear.checkLeapYear(2012));
    }
	
	@Test
    public void testCase8() {
        assertEquals( false, LeapYear.checkLeapYear(1991));
    }
	
	@Test
    public void testCase9() {
        assertEquals( true, LeapYear.checkLeapYear(400));
    }
	
	@Test
    public void testCase10() {
        assertEquals( true, LeapYear.checkLeapYear(2020));
    }

}

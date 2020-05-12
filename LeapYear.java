import java.util.ArrayList;
import java.util.List;

public class LeapYear {

	public static void main(String[] args) {
		
		List<Integer> leapYears = new ArrayList<>();
		leapYears.add(1700);
		leapYears.add(1900);
		leapYears.add(2000);
		leapYears.add(1600);
		leapYears.add(100);
		leapYears.add(1996);
		leapYears.add(2012);
		leapYears.add(1991);
		leapYears.add(400);
		leapYears.add(202);
		
		for(Integer year : leapYears)
			System.out.println(checkLeapYear(year));
		
	}
	
	static boolean checkLeapYear(int leapYear) {
		
		return leapYear % 4 == 0 && (leapYear % 100 != 0 || leapYear % 400 == 0);
	}
	
}

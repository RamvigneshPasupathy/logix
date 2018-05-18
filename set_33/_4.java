package set_33;

/*
	Given two dates, find the total number of days between them.
	Input:
		date1 = {10, 2, 2014}
		date2 = {10, 3, 2015}
		Output: 393
 */

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDaysBetween(new int[]{10, 2, 2014}, new int[]{10, 3, 2015});
      	printDaysBetween(new int[]{10, 2, 2000}, new int[]{10, 3, 2000});
      	printDaysBetween(new int[]{10, 2, 2000}, new int[]{10, 2, 2000});
      	printDaysBetween(new int[]{1, 2, 2000}, new int[]{1, 2, 2004});
	}
	
	static void printDaysBetween(int[] date1, int[] date2) {
		int[] MONTH_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days1 = 0;
		int days2 = 0;
		
		// days for completed years from 00-00-000
		days1 = date1[2] * 365 + leapYearsCount(date1[2]);
		days2 = date2[2] * 365 + leapYearsCount(date2[2]);
		
		// days for completed month of the current year
		for(int i=1; i<date1[1]; i++) {
			if(i == 2 && isLeapYear(date1[2])) {
				days1 += 1;
			}
			days1 += MONTH_DAYS[i-1];
		}
		for(int i=1; i<date2[1]; i++) {
			if(i == 2 && isLeapYear(date2[2])) {
				days2 += 1;
			}
			days2 += MONTH_DAYS[i-1];
		}
		
		// completed days for current month of the current year
		days1 += date1[0];
		days2 += date2[0];
		
		System.out.println(days2 - days1);
	}
	
	static int leapYearsCount(int currentYear) {
		int _400 = currentYear / 400;
		int _100 = currentYear / 100;
		int _4 = currentYear / 4;
		return _400 + _4 - _100;
	}
	
	static boolean isLeapYear(int year) {
		if(year % 400 == 0) {
			return true;
		}
		if(year % 100 == 0) {
			return false;
		}
		if(year % 4 == 0) {
			return true;
		}
		return false;
	}

}

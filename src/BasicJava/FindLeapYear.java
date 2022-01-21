package BasicJava;

public class FindLeapYear {

	public static void main(String[] args) {

		// Leap Year divisible by 4, also century year ending with 00 is divisible by
		// 400
		int year = 2016;
		boolean flag = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				flag = true;
			}
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is a not Leap Year");
		}
	}

}

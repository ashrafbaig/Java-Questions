package BasicJava;

public class Digitsofanumberatevenandoddplaces {

	public static void main(String[] args) {
		int num = 12538;
		int sumodd = 0, sumeven = 0;
		//boolean isodd = num % 2 == 1;
		// it will give me true or false

//		while (num != 0) {
//
//			if (isodd) {
//				sumodd += num % 10;
//			} else {
//				sumeven += num % 10;
//			}
//
//			isodd = !isodd;
//			num /= 10;
//
//		}
		boolean flag = num%2==1 || num%2==0;
		while(num!=0) {
			
			if(flag) {
				sumeven += num % 10;
			}else {
				sumodd += num % 10;
			}
			flag = !flag;
			
			
			num=num/10;
			
			
			
		}

		System.out.println("sum of odd indexes  " + sumodd);
		System.out.println("sum of even indexes  " + sumeven);

	}

}

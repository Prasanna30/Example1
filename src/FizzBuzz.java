/*
 * FizzBuzz Program
 * given number n .. print the values from 1 to n 
 * if the number is multiple of 3 print fizz
 * if the number is multiple of 5 print buzz
 * if the number is multiple of both 3 and 5 print fizzbuzz
 * otherwise print the number itself
 * 
 * e.g Input -> 15
 * output ->
 * 1
 * 2
 * fizz
 * 4
 * buzz
 * fizz
 * 7
 * ...
 * 14 
 * fizzbuzz
 * 
 */


public class FizzBuzz {
	
	public static void main(String[] argv) {
		int n = 15;
		
		for(int i=1; i<=n; i++) {
			if((i % 3) == 0) {
				System.out.println("fizz");
				continue;
			}
			if((i % 5) == 0) {
				System.out.println("buzz");
				continue;
			}
			if(i % 3 == 0 && i %5 ==0 ) {
				System.out.println("fizzbuzz");
				continue;
			}
			System.out.println(i);
			
		}
	}

}

package practicStatement;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
	
		//what is Fibonacci number?
		//Next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
		
		
		int firstnumber=0;
		int secondnumber=1;
		int fibo;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many fibonacci number you want: ");
		int num=scan.nextInt();
		System.out.print(firstnumber+" "+secondnumber);
		for (int i = 3; i <=num; i++) {
			fibo=firstnumber+secondnumber;
			System.out.print(" "+fibo);
			firstnumber=secondnumber;
			secondnumber=fibo;
			
		}
		

	}

}

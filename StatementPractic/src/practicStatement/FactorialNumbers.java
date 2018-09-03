package practicStatement;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		
		// What is Factorialnumber?
		// The number of previous all numbers multipulation each other then result will be factorialnumber.
		// Example: The number is 5.
		// Factorialnumber is : 1*2*3*4*5=120
		// 5 factorialnumber is 120.
		// How to find the factorial number?
		
		// Take the number from user
		int num,result=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		 num=scan.nextInt();
		for (int i =num; i >=1; i--) {
			result=result*i;
			
		}
		System.out.println("The Factoria number "+num+" is= "+result);
		
		
		// What is Prime number?
		// the numbers previous all number with division if ther is no remain number that means that are not prime number
		int first,last,count=0,totalnumber=0;
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter your first number: ");
		 first=scan2.nextInt();
		 
	
			System.out.println("Enter your last number: ");
			 last=scan2.nextInt();
			 
			 for (int i =first; i <=last; i++) {
				 for (int j =2; j <i; j++) {
					 if(i%j==0) {
						 count++;
						 break;
						 
					 }
					
				}
				if(count==0) {
					System.out.println(i);
					totalnumber++;
				}
				count=0;
			}
			 System.out.println(" "+totalnumber);
			 
			 
				//what is Fibonacci number?
				//Next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
				
				
				int firstnumber=0;
				int secondnumber=1;
				int fibo;
				Scanner scan1=new Scanner(System.in);
				System.out.println("How many fibonacci number you want: ");
				int num1=scan1.nextInt();
				System.out.print(firstnumber+" "+secondnumber);
				for (int i = 3; i <=num1; i++) {
					fibo=firstnumber+secondnumber;
					System.out.print(" "+fibo);
					firstnumber=secondnumber;
					secondnumber=fibo;
					
				}

	}

}

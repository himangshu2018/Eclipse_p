package practicStatement;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// Sum of Digit
		// if i enter 234 it will return 9
		int temp,num,r,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		 num=scan.nextInt();
		 temp=num;
		 while(temp !=0)
		 {
			 r=temp%10;
			 sum=sum+r;
			 temp=temp/10;
		 }

		System.out.println("Your sum is "+sum);
		
		//Reverse Sum of degit
		//if i Enter 234 it will return 432
         int num1,temp1,sum1=0,r1;
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		num1=scan1.nextInt();
		temp1=num1;
		while(temp1 !=0)
		{
			r1=temp1%10;
			sum1=sum1*10+r1;
			temp1=temp1/10;
		}
		System.out.println(sum1);

	}

}

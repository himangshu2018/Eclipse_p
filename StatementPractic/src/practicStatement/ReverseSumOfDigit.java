package practicStatement;

import java.util.Scanner;

public class ReverseSumOfDigit {

	public static void main(String[] args) {
		int num,temp,sum=0,r;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		num=scan.nextInt();
		temp=num;
		while(temp !=0)
		{
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		System.out.println(sum);
	

	}

}

import java.util.Scanner;

import bsh.This;

public class Bronx {
	int a=10,b=20,c=30;
	public int add() {
		Bronx obj1=new Bronx();
		int cb=obj1.c;
		return cb;
		
	}
	public static void main(String[] args) {
		/*int temp,num,sum=0,rem;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		num=scan.nextInt();
		temp=num;
		while(temp != 0)
		{rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
			
		}
		if(num==sum)
		{
			System.out.println("it is a palimdrome number");
		}
			else
			{
				System.out.println("it is not palimdrome number");
			}*/
		
		Bronx obj=new Bronx();
		int ab=obj.add();
		System.out.println(ab);
		
		
	}

}

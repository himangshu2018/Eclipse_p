package practicStatement;

import java.util.Scanner;

public class Multipulations {
	

	public int MultiplicationTable() {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		num=scan.nextInt();
		for (int i = 1; i <=10; i++) {
			System.out.println(num+" x "+i+" ="+num*i);
			
		}
		return num;
		
		}
	public int Additions() {
		int firstnumber,secondnumber;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your firstnumber: ");
	    firstnumber=scan.nextInt();
		
		System.out.println("Enter your secondnumber: ");
		secondnumber=scan.nextInt();
		int a=firstnumber+secondnumber;
		
		System.out.println("Your Additions number is "+a);
		return a;
	}
	public int multy()
	{int firstnumber,secondnumber;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your firstnumber: ");
    firstnumber=scan.nextInt();
	
	System.out.println("Enter your secondnumber: ");
	secondnumber=scan.nextInt();
	int a=firstnumber*secondnumber;
	
	System.out.println("Your Additions number is "+a);
	return a;
		
	}
	public int substraction()
	{
		int firstnumber,secondnumber;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your firstnumber: ");
	    firstnumber=scan.nextInt();
		
		System.out.println("Enter your secondnumber: ");
		secondnumber=scan.nextInt();
		int a=firstnumber/secondnumber;
		
		System.out.println("Your Additions number is "+a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

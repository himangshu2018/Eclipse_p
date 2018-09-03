package practicStatement;



import java.util.Scanner;

public class primeNumber {
	

	public static void main(String[] args) {
		int num,count=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your number: ");
	num=scan.nextInt();
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
			break;
		}
	}
		
		if(count==0)
		{
			System.out.println("It is prime number");
		}
		else {
			System.out.println("It is not prime number");
		}
		int m,n,count1=0,totalprimenumber=0;;
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter your initialize number: ");
		m=scan.nextInt();
		
		System.out.println("Enter your last number: ");
		n=scan1.nextInt();
		
		for (int i = m; i <n; i++) {
			for (int j =2; j <=i-1; j++) {
				if(i%j==0) {
					count1++;
					break;
				}
				
			}
			if(count1==0)
			{
				System.out.println(i);
				totalprimenumber++;
			}
			count1=0;
		}
		
		System.out.println("Total prime number is: "+totalprimenumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(int i=0; i<=20;i=i+3)
		{
		if(i!=15&& i!=12 && i!=9) {
			System.out.print(i+" ");
		}
			
			
		}
		for (int i =20; i >=1; i=i-3) {
			System.out.println(i);
			
		}*/
		
		//Nested for loop int value
		/*for (int i = 0; i <10; i++) {
			for (int j = 1; j <=2; j++) {
				for (int k = 1; k <=2; k++) {
					System.out.println("This is for k "+k);
				}
				System.out.println();
				System.out.println("This ia for j= "+j);
				
			}
		System.out.println(i);
		}*/
		
		/*for (double i=1.5; i<=5.5; i=i+1) {
			if (i!=3.5) {
			System.out.println(i);
			}
			}*/
		
	/*	// How to find the Factorial number by java programming
		
		int number,box=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number:");
		number=scan.nextInt();
		for (int i =number; i >=1; i--) {
			box=box*i;
			
		}
	System.out.println("Your factorial number is "+number+" =" +box);*/
		
		
			
		
	}
	
		
		}



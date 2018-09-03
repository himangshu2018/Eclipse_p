import java.util.Scanner;

public class PracticA {

	public static void main(String[] args) {
/*		int number, count=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		number=scan.nextInt();
		for (int i = 2; i <number; i++) {
			if(number % i==0)
			{
				count++;
				break;
			
			}
			
		}
		if(count==0) {
			System.out.println("Your number is prime");
		}
		else
		{
			System.out.println("Your number is not prime");
		}*/
		
		int firstnumber,lastnumber,count=0,totalnumber=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your First Number: ");
		firstnumber=scan.nextInt();
		System.out.println("Enter Your Last Number: ");
		lastnumber=scan.nextInt();
		for (int i =firstnumber; i <lastnumber; i++) {
			for (int j = 2; j < i-1; j++) {
				if(i%j==0)
				{
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
		System.out.println("Total prime Number= "+totalnumber);
		

	}

}

import java.util.Scanner;

public class TemparetureCalculate {

	public static void main(String[] args) {
		
		//convert Fahrenhit to Celsius
		
		Scanner scan=new Scanner(System.in);
		double celsius,fahrenhit;
		
		System.out.println("Enter Your fahrenhit: ");
		fahrenhit=scan.nextDouble();
		celsius=0.54*(fahrenhit-32);
		System.out.println("celsius is: "+celsius);
		System.out.println();
		//convert Celsius to Fahrenhit
		
		Scanner scan1=new Scanner(System.in);
		double celsius1,fahrenhit1;
		
		System.out.println("Enter Your celsius1: ");
		celsius1=scan1.nextDouble();
		fahrenhit1=1.8*celsius1+32;
		System.out.println("Fahrenhit is: "+fahrenhit1);
		
	

	}

}

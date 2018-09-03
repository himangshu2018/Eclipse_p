package practicStatement;

public class UnaryOperators {

	public static void main(String[] args) {
		//  + unary plus
		//  - unary ninus
		// ++ increment
		// -- decrement
		
		int a= 10;
		int b;
		b = +a;
		System.out.println(b);//10
		b= -a;
		System.out.println(b);// -10
		b= a++;
		System.out.println(b);//10
		b=a;
		System.out.println(b);//11
		b= --a;
		System.out.println(b);//10
		b=++a;
		System.out.println(b);//11
		

	}

}

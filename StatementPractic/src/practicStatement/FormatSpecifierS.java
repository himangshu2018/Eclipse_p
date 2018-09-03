package practicStatement;

public class FormatSpecifierS {
	boolean a=true;
	char b='a';
	int c=120;
	byte d=20;
	long a1=1240;
	float b1=10.3f;
	double c1=20.30;
	String s="himangshu";

	public static void main(String[] args) {
		FormatSpecifierS obj=new FormatSpecifierS();
		System.out.printf("boolean a value is =%B\n",obj.a);
		System.out.printf("char b value is =%C\n",obj.b);
		System.out.printf("int c value is =%d\n",obj.c);
		System.out.printf("byte d value is =%d\n",obj.d);
		System.out.printf("long a1 value is =%d\n",obj.a1);
		System.out.printf("float b1 value is =%.2f\n",obj.b1);
		System.out.printf("double c1 value is =%.3f\n",obj.c1);
		System.out.printf("String s value is =%s\n",obj.s);



	}

}

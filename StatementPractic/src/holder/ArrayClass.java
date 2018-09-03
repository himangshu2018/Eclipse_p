package holder;



public class ArrayClass{
	public void m(final int x, final int y)
	{
	
		System.out.println(x+y);
	}
	
	public static void main(String... args) {
		ArrayClass obj=new ArrayClass();
		obj.m(40, 50);
	}
}

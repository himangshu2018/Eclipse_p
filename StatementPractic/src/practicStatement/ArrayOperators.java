package practicStatement;

public class ArrayOperators {

	public static void main(String[] args) {
		int mim=6;
		int ab=0;
		int ac=0;
		double d=0;
		int mix=0;
int a[][]= {{2,4,6,8},{3,5,7,5}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				int b=a[i][j];
				ab=ab+b;
				ac++;
				System.out.println(b);
				if(a[i][j]<mim)
				{
					mim=a[i][j];
				}
				if(a[i][j]>mix) {
					mix=a[i][j];
				}
			}
		}
		System.out.println(ab);
		System.out.println(ac);
		double di=ab/ac;
		d=d+di;
		System.out.println(d);
		System.out.println(mim);
		System.out.println(mix);

	}

}


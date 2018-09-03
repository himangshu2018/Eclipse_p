package practicStatement;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class LearnTutorial {

public static void main(String[] args) {
	/*int a=50;
	int b=20;
	int x=40;
	int y=30;
	
	
	
	if (a>b) {
		System.out.println("A is a small number");
	}
	else {
		System.out.println("B is a big number");
	}
	
	System.out.println(a<b? "A ia a big number" : "B is a big number");
	System.out.println(x>y? "x is a big number": "B ia a big number");
	System.out.println(x!=y? x:y);*/
	
	//declare the array
	/*int hi1[]=new int [100];
	
	//declared the value of array
	int i=100;
	while( i>0)
	{
		hi1[i-1]=(i-1)+1;
		i--;
	}
	
	// while loop for array
	while(i<100)
	{
		System.out.println("hi["+i+"]:"+hi1[i]);
		i++;
	}*/
	
	/*int a=20;
	for (int i =1; i<=20; i++) {
		System.out.println(i);
		
	}*/
	
/*	String a[]= { "selenium","Uft","java","coobal","ruby"};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println();
	
	String b[]= {"500","100","200","400","300"};
	
	Arrays.sort(b);
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	System.out.println();

	for (int i=b.length-1;i>=0;i--)
	{
		System.out.println(b[i]);
	}*/
	
	//sorting the number
	/*int a[]= {1,2,3,4};
	System.out.println(a[2]);*/
	
	/*Arrays.sort(a);
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println();
	
	for(int i=a.length-1; i>=0; i--) {
		System.out.println(a[i]);
	}*/
	//print the bigest number
	/*int a[]= {2,4,3,1,5,9};
	int maxnumber=a[0];
	
	
	for(int i=1;i<a.length;i++) {
		if(a[i]>maxnumber) {
			maxnumber=a[i];
		}
		
	}
	System.out.println(maxnumber);	*/
	
	int a[][]= {{2,3,4,5,6},{3,4,5,6,7}};
	
	/*System.out.println(a[0][3]);//5
	System.out.println(a[1][3]);//6
*/	for (int i = 0; i < a.length; i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.println(a[i][j]);
		}
	
	}

	
	
	
	
	
	
	
	
	
}
}

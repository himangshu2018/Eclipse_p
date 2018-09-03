package practicStatement;

import java.util.Scanner;

public class StringOparetion {
	
	
	
	public static void main(String[] args) {
	
		
		
		
		String a="Hello New York";
		
		
		//count with this string how many word
		String b[]=a.split(" ");
		int c=b.length;
		System.out.println(c);//3
		
		//count with this string how many chracter
		String bc[]=a.split("");
		int cd=bc.length;
		System.out.println(cd);//14
		
		//print the string variable
		System.out.println(a);//Hello new york
		
		//print reverse string variable by word
		for (int i=b.length-1; i>=0; i--)
		{
			System.out.println(b[i]);//york new hello
		}
		
		//print reverse string variable by number
		
		for (int i=b.length-1; i>=0; i--)
		{
			System.out.println(i);
		}
		
		String longest=b[2];
		for (int i=0; i<b.length;i++)
		{
			if(b[i].length()> longest.length())
			{
				 longest=b[i];
				
			}
			System.out.println(longest);
		}
		
		String a1= "united state of america";
		char ch[]=a.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			for(int j=i+1; j<ch.length;j++)
			{
				if(ch[i]==ch[j]);
				{
					System.out.println(ch[i]+ " is matched with " + ch[j]);
				}
			}
		}
		
		String a2="bat";
		String b1=a2.substring(1);
		System.out.println(b);
		String c1="c";
		String ab=c1.concat(b1);
		System.out.println(ab);
		
		String hi ="anabelle";
		int hi1=hi.indexOf('e', 5);
		System.out.println(hi1);
		
		String ind="india";
		String ind1=ind.replace("india", "Nepal");
		String ind2=ind.replaceAll("india", "Nepal");
		System.out.println(ind1);
		System.out.println(ind2);
		
		String s="I am here";
		
		boolean s1=s.startsWith("I");
		System.out.println(s1);
		
		String s2="cat";
		String s3="cap";
		int s4=s2.compareTo(s3);
		System.out.println(s4);
		int s5=s3.compareTo(s2);
		System.out.println(s5);
		
		
		int x=100;
		Integer y=x;
		int xy=y.compareTo(150);
		System.out.println(xy);
		
		//convert integer to string
		int a3=100;
		String b2= Integer.toString(a3);
		System.out.println(b);//100
		
		//convert string to int 
		String a4="50";
		int c3=Integer.parseInt(a4);
		System.out.println(c3);//50
		
		//convert double to string 
		double b3=100.25;
		String b4=Double.toString(b3);
		System.out.println(b2);//100.25
		
		//convert boolean to string 
		boolean a5=true;
		String a6=Boolean.toString(a5);
		System.out.println(a3);//true
		
		//convert char to string
		char a7='A';
		String a8=Character.toString(a7);
		System.out.println(a5);//A
		
		//convert byte to string
		byte abc=15;
		String ba=Byte.toString(abc);
		System.out.println(ba);//15
		
		//convert string to byte
		String h="120";
		byte ab1=Byte.parseByte(ba);
		System.out.println(ab1);//15
		
		//convert string to interger
		String bi="200";
		int bi1=Integer.valueOf(bi);
		System.out.println(bi1);
		
		// What is the Autoboxing and Unboxing 
		// When convert primitive data type object then call Autoboxing 
		// When convert object to primitive data then call Unboxing
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
	
		
		
		
		

	



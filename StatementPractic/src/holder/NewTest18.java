package holder;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest18 {
	@BeforeClass
	public void login()
	{
		System.out.println("login sucessful pass");
	}
	
	@Test(priority=4)
	public void add()
	{
		System.out.println("geturl sucessful pass");
	}
	
	@Test(priority=3)
	public void search()
	{
		System.out.println("search sucessful pass");
	}
	
	@Test(priority=2)
	public void advence()
	{
		System.out.println("advence search sucessful pass");
	}
	
	@Test(priority=1)
	public void selects()
	{
		System.out.println("select sucessful pass");
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("logout sucessful pass");
	}

}



package holder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest19 {
	
	@BeforeClass
	public void login()
	{
		System.out.println("login sucessful pass");
	}
	
	@Test(priority=1)
	public void delectadd18()
	{
		System.out.println("delect geturl sucessful pass");
	}
	
	@Test(priority=2)
	public void delectadd19()
	{
		System.out.println("delect search sucessful pass");
	}
	
	@Test(priority=3)
	public void delectadd20()
	{
		System.out.println("delect advence search sucessful pass");
	}
	
	@Test(priority=4)
	public void delectadd30()
	{
		System.out.println("delect select sucessful pass");
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("logout sucessful pass");
	}

}

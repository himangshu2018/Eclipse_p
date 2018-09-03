import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {
	@BeforeClass
	public void login()
	{
		System.out.println("login sucessful pass");
	}
	@Test(dependsOnMethods= {"add3"})
	public void add()
	{
		System.out.println("geturl sucessful pass");
	}
	@Test(dependsOnMethods= {"add"})
	public void add1()
	{
		System.out.println("search sucessful pass");
	}
	@Test
	public void add2()
	{
		System.out.println("advence search sucessful pass");
	}
	@Test(dependsOnMethods= {"add2"})
	public void add3()
	{
		System.out.println("select sucessful pass");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logout sucessful pass");
	}

}

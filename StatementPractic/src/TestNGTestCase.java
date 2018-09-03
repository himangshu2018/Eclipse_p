
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestCase {
	@Test (priority=4)
	public void testAA(){
		Assert.assertEquals("email", "email");
	
	}
	
	@Test (priority=3)
	public void testCC(){
		Assert.assertEquals("google", "google");
	
	}
	
	@Test (priority = 1)
	public void testDD(){
		Assert.assertEquals("google", "google");
	
	}
	
	@Test (priority=2)
	public void testBB(){
		Assert.assertEquals("yahoo", "yahoo");
	
	}
	

}

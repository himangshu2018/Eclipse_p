package practicStatement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomLogin1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier");
	
		PomLogin obj= new PomLogin(driver); 
		 obj.TypeEmailID("naskar.shatabdi2017@gmail.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 obj.CaptureValue();
		 obj.CNext();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 obj.TypePassword("Laskar2017");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 obj.CNext1();
		/* String url=driver.getCurrentUrl();
		 System.out.println(url);
		 if(url.contains("https://accounts.google.com/signin/v2/sl/pwd?")) {
			 System.out.println("Singin Successfuly pass");
		 }
		 else
		 {
			 System.out.println("Singin not Successfuly pass");
		 }*/
		String ab= obj.ErrorMassege();
		if(ab.contains("Wrong password. Try again or click Forgot password to reset it.")) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("feilad");
		}

	}

}

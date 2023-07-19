package in.amazon.DemoJenkins;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	       WebDriver driver;
	       
	       @BeforeTest
	       public void launchApplication() {
	    	   //1)Open the browser
	    	   driver = new ChromeDriver();//Class object = new
	    	   
	    	   //2) navigate to application 
	    	   //object.method()
	    	   driver.get("https://facebook.com");	   
	       }
	       @Test
	       public void titleVerification() {
	    	   //3)Verify the visitor on the page sees the title - 'Facebook - log in or sign in
	    	   //up
	    	   String expectedTitle = "Facebook – log in or sign up";
	   		String actualTitle = driver.getTitle();
	    	   Assert.assertEquals(actualTitle, expectedTitle);
	       }
	       @AfterTest
	       public void closeBrowser() {
	    	   driver.quit();
	       
	
		
		
	}
}


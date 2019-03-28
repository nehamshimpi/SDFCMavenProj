import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4A extends ReUsableMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 intializePath("C:\\Data\\JanQAReports\\MavenReport4A.html");		
		 initializeDriver();
		 launchUrl("https://login.salesforce.com/","tc4A");
		
		WebElement fpwd=findElement(By.xpath("//a[@class='fl small']"),"Forgot Password");
		clickButton(fpwd,"Forgot password");
		
		
		WebElement un = findElement(By.xpath("//input[@id='un']"), "User name");
		enterText(un, "User name", "neha.m.shimpi@gmail.com");		
		
		WebElement click=findElement(By.xpath("//input[@id='continue']"),"Click");
		clickButton(click,"Click");
		
		endReport();
	}

}

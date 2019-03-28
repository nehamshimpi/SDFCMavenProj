import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase2 extends ReUsableMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 intializePath("C:\\Data\\JanQAReports\\MavenReport2.html");		
		 initializeDriver();
		 launchUrl("https://login.salesforce.com/","tc2");
		
		WebElement un = findElement(By.xpath("//input[@id='username']"), "Username");
		enterText(un, "Username", "neha.m.shimpi@gmail.com");
		
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "neha1987");
		
		WebElement lg=findElement(By.id("Login"),"Log In");
		clickButton(lg,"Login");
		
		WebElement ft=findElement(By.xpath("//a[@class='button secondary']"),"TryForFree");
		clickButton(ft,"TryForFree");		
		
		endReport();
	}

}

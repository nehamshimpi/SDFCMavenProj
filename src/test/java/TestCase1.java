import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 extends ReUsableMethodClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 initializeDriver();
		intializePath("C:\\Data\\JanQAReports\\MavenReport1.html");		
	
		 launchUrl("https://login.salesforce.com/","tc1");
		
		WebElement un = findElement(By.xpath("//input[@id='username']"), "Username");
		enterText(un, "username", "User@gmail.com");
		
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", " ");
		
		WebElement lg=findElement(By.id("Login"),"Log In");
		clickButton(lg,"Login");
		
		WebElement er=findElement(By.id("error"), "Error msg");
		System.out.println(er.getText());
		endReport();
	}

}

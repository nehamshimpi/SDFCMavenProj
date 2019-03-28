import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4B extends ReUsableMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intializePath("C:\\Data\\JanQAReports\\MavenReport4B.html");		

		initializeDriver();

		launchUrl("https://login.salesforce.com/","tc4B");

		WebElement un = findElement(By.xpath("//input[@id='username']"), "Username");
		enterText(un, "Username", "123");

		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "22131");

		WebElement lg=findElement(By.id("Login"),"Log In");
		clickButton(lg,"Login");	


		endReport();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase3 extends ReUsableMethodClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		intializePath("C:\\Data\\JanQAReports\\MavenReport3.html");		

		initializeDriver();

		launchUrl("https://login.salesforce.com/","tc3");

		WebElement un = findElement(By.xpath("//input[@id='username']"), "Username");
		enterText(un, "Username", "neha.m.shimpi@gmail.com");

		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "neha1987");

		WebElement lg=findElement(By.id("Login"),"Log In");
		clickButton(lg,"Login");
		
		Thread.sleep(2000);
		
		WebElement popupWindow = findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"), "PopUpWindow");
		clickButton(popupWindow,"PopUpWindow");

		WebElement dd=findElement(By.xpath("//div[@class='userNav-buttonArrow mbrButtonArrow']"),"DropDown");
		clickButton(dd ,"DropDown");

		WebElement logout=findElement(By.xpath("//a[@title='Logout']"),"Logout");
		clickButton(logout,"Logout");
		System.out.println("Test case 3 Completed");
		endReport();
	}

}

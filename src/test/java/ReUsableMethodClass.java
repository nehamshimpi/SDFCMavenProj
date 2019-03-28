

	import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;

	public class ReUsableMethodClass {

		static WebDriver driver;
		static ExtentReports report;
		static ExtentTest logger;	

		//Driver Initialization
		public static void initializeDriver()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();		 
		}

		//Launch Browser
		public static void launchUrl(String url,String logFile )
		{
			driver.get(url);
			driver.manage().window().maximize();
			logger=report.startTest(logFile);
		}

		//Inititalize path
		public static void intializePath(String path)
		{
			report=new ExtentReports(path, false);
		}

		/*
		 * Name: findElement
		 * Description: Enter the text value in to theText object on the page.
		 * 
		 * Arguments: objName : Name of the object
		 * 							location:Location of the object
		 * textValue: Value to be entered
		 * 
		 *  Created By: Neha
		 *  Creation Date: 27 Feb 2019
		 *  Last Modified Date: 27 Feb 2019
		 * */

		public static WebElement findElement(By location,String objName)
		{
			WebElement obj=null;
			try {
				obj=driver.findElement(location);
				System.out.println("Pass: " + objName + "found on the page.");
				logger.log(LogStatus.PASS, ""+ objName + "found on the page.");
			}catch(NoSuchElementException errMessage)
			{
				System.out.println("Fail: " + objName + "could not be found on the page.");
				logger.log(LogStatus.FAIL,  ""+ objName + "could not be found on the page.");

			}
			return obj;
		}

		/*
		 * Name: enterText
		 * Description: Enter the text value in to theText object on the page. 
		 * Arguments: objName : Name of the object
		 * 						 obj
		 * 						textValue: Text to be Entered
		 *  Created By: Neha
		 *  Creation Date: 27 Feb 2019
		 *  Last Modified Date: 27 Feb 2019
		 * */
		public static void enterText(WebElement obj , String objName, String textValue)
		{
			if(obj==null)
				return;
			if(obj.isDisplayed())
			{
				obj.sendKeys(textValue);
				System.out.println("Pass: " + textValue + " entered in " + objName);
				logger.log(LogStatus.PASS, ""+ objName + " found on the page.");
			}else
			{
				System.out.println("Fail: " + objName + "could not be found");
				logger.log(LogStatus.FAIL, ""+ objName + "could not be found.");
			}
		}


		/*
		 * Name: selectCheckBox
		 * Description: Select the checkbox on page
		 * 
		 * Arguments: objName : Name of the object
		 * 						 obj 
		 *  Created By: Neha
		 *  Creation Date: 27 Feb 2019
		 *  Last Modified Date: 27 Feb 2019
		 * */

		public static void selectCheckBox(WebElement obj, String objName) {
			// TODO Auto-generated method stub
			if(obj == null)
				return;
			if (obj.isDisplayed()) {
				if(!obj.isSelected())
				{
					obj.click();
				}
				System.out.println("Pass: checkbox " + objName + " is selected");
			} else {
				System.out.println("Fail: " + objName + " could not be found");
			}

		}
		
		/*
		 * Name: clickButton
		 * Description:Click Button on the page
		 * 
		 * Arguments: objName : Name of the object
		 * 						 obj 
		 *  Created By: Neha
		 *  Creation Date: 27 Feb 2019
		 *  Last Modified Date: 27 Feb 2019
		 * */
		public static void clickButton(WebElement obj, String objName) {
			// TODO Auto-generated method stub
			if(obj == null)
				return;
			if (obj.isDisplayed()) {			
				obj.click();
				System.out.println("Pass: " + objName + " Clicked");
				logger.log(LogStatus.PASS, ""+ objName + " button Clicked");
			} else {
				System.out.println("Fail: " + objName + " could not be found the button");
				logger.log(LogStatus.FAIL,  ""+ objName + "could not be found the button");
			
			}
		}
		
		/*public void wait()
		{
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		}*/
		
		public static void endReport()
		{
			//ExtentTest test;
			//driver.report.endTest(test);
			report.endTest(logger);
			report.flush();		
			driver.quit();
		}
	}



package smapleCodes;

 
import org.junit.AfterClass;
 
import org.junit.BeforeClass;
 
import org.junit.Test;
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestOn1 {
private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	 
	 
	@Test
	public void Test01() {
		driver.get("https://www.valtech.com");
		(new WebDriverWait(driver,10)).until(ExpectedConditions.titleContains("Valtech"));
		try{
			(new WebDriverWait(driver,10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/main/div[2]/div[3]/div[1]/header/h2")));
			System.out.println("Latest News section appears");
		}
		catch(Exception e1){
		System.out.println("Latest News section doesn't appear");
		}
	}
	 
	@Test
	public void Test02() {
		driver.get("https://www.valtech.com");
		(new WebDriverWait(driver,10)).until(ExpectedConditions.titleContains("Valtech"));
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div[1]/label[2]/span/div/div/div[1]/i")).click();
		
		try{	
		(new WebDriverWait(driver,5)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@Title,\"Cases\")]"))));
		}
		catch(Exception e1){
		System.out.println("Cases link NOT present");
		return;
		}
		driver.findElement(By.linkText("Cases")).click();
		(new WebDriverWait(driver,10)).until(ExpectedConditions.titleContains("Valtech"));
		(new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
		if(driver.findElement(By.tagName("h1")).getText().equalsIgnoreCase("Cases"))
			System.out.println("H1 text is Cases");
		else
			System.out.println("H1 text is NOT Cases");
	}
	 
	@Test
	public void Test03() {
		driver.get("https://www.valtech.com");
		(new WebDriverWait(driver,10)).until(ExpectedConditions.titleContains("Valtech"));
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div[1]/label[2]/span/div/div/div[1]/i")).click();
		
		try{	
		(new WebDriverWait(driver,5)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@Title,\"Services\")]"))));
		}
		catch(Exception e1){
		System.out.println("Services link NOT present");
		return;
		}
		driver.findElement(By.linkText("Services")).click();
		(new WebDriverWait(driver,10)).until(ExpectedConditions.titleContains("Valtech"));
		(new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
		if(driver.findElement(By.tagName("h1")).getText().equalsIgnoreCase("Services"))
			System.out.println("H1 text is Services");
		else
			System.out.println("H1 text is NOT Services");
	}
	 
	@Test
	public void Test04() {
		driver.get("https://www.valtech.com");
		(new WebDriverWait(driver,10)).until(ExpectedConditions.titleContains("Valtech"));
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div[1]/label[2]/span/div/div/div[1]/i")).click();
		
		try{	
		(new WebDriverWait(driver,5)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@Title,\"Jobs\")]"))));
		}
		catch(Exception e1){
		System.out.println("Jobs link NOT present");
		return;
		}
		driver.findElement(By.linkText("Jobs")).click();
		(new WebDriverWait(driver,10)).until(ExpectedConditions.titleContains("Valtech"));
		(new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
		if(driver.findElement(By.tagName("h1")).getText().equalsIgnoreCase("Jobs"))
			System.out.println("H1 text is Jobs");
		else
			System.out.println("H1 text is NOT Jobs");
	}

	@Test
	public void Test05() {
		driver.get("https://www.valtech.com");
		(new WebDriverWait(driver,10)).until(ExpectedConditions.titleContains("Valtech"));
		driver.findElement(By.xpath(".//*[@id='contacticon']/div/div/div[2]/i")).click();
		(new WebDriverWait(driver,5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,\"Contact our other offices\")]")));
		
		try{	
		System.out.println("Total Valtech Offices - " + driver.findElements(By.xpath("//*[contains(@data-icon,\"location\")]")).size()+ "");
		}
		catch(Exception e1){
		System.out.println("NO such elements");
		return;
		}
		}
}

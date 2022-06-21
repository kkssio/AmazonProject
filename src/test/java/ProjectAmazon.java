import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectAmazon {

	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().setSize(new Dimension(1920, 1080));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit(); 
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.amazon.com.br/?&linkCode=ll2&tag=operagx-desktop-br-20&linkId=0c5896fd250c025d414d54f4ebef8b6c&language=pt_BR&ref_=as_li_ss_tl");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		Thread.sleep(2000);
		
	//LOGIN ELEMENTS	
		
		driver.findElement(By.id("ap_email")).sendKeys("k.vinhy07@gmail.com");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("neverend123");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		
		
	//RESEARCH ELEMENTS
		
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gabinete branco antigo");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3500);
		
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class YouTubeVideoTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Driver\\chromedriver\\chromedriver.exe");
				//"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    driver.get("https://www.youtube.com/watch?v=W3bUXQtsMqA&list=RDMMW3bUXQtsMqA&start_radio=1");
	 /*   Screen s = new Screen();
	    Pattern pauseImg = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\SikuliAutomation\\y_tpause.png");
	    s.wait(pauseImg,4000);
	    s.click();
	    s.click();
	    
	     Pattern playImg = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\SikuliAutomation\\y_tplay.png");
	     s.wait(playImg,2000);
	     s.click();
	    //s.click();*/
	}

}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sikuli_YouTube {
	WebDriver driver;

	@BeforeClass
	public void beforeClassExecute() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void Test01() {
		driver.get("https://www.youtube.com/watch?v=W3bUXQtsMqA&list=RDW3bUXQtsMqA&start_radio=1");
	}

	@Test
	public void Test02() throws FindFailed {
		Screen s = new Screen();
		Pattern playImg = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\SikuliAutomation\\y_tplay.PNG");
		s.wait(playImg, 2000);
		s.click();
		s.click();

		Pattern muteImg = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\SikuliAutomation\\y_tmute.PNG");
		s.click();
		Pattern pauseImg = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\SikuliAutomation\\y_tpause.PNG");
		s.click();
	}
}

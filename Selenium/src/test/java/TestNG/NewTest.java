package TestNG;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Test() {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Setear la ruta del chrome
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");//Agregando la propiedad con la ruta de chrome
		WebDriver driver = new ChromeDriver();//Inicializando nuestro chrome driver
		driver.get("https://www.google.com");
  }
}

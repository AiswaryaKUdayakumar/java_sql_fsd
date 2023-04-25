package ustbatchno3.Seleniumtesting;
//package ustbatchno3.Seleniumtesting;
////package ustbatchno3.Seleniumtesting;
////
////
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////public class ChromeLaunch{
////   public static void main(String[] args) {
////      WebDriver driver = new ChromeDriver();
////      String url = " https://www.tutorialspoint.com/questions/index.php";
////      driver.get(url);
////   }
////}
//
//

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App
{
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            String url = " https://www.instagram.com/";
            driver.get(url);
        }
}
 
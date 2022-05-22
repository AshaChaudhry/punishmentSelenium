package WdSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");

    }




}

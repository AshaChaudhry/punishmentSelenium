package WdSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver\\geckodriver.exe");
        WebDriver d=new FirefoxDriver();
        d.get("https://demo.nopcommerce.com/");
    }
}

package WdSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://demo.nopcommerce.com/");
    }
}

package WdSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","\"C:\\\\Users\\\\Tej\\\\IdeaProjects\\\\software\\\\driver\\\\chromedriver.exe\"");
        WebDriver aa=new ChromeDriver();
        aa.get("https://www.tesco.com/");
    }
}

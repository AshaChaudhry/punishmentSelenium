package WdSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver\\msedge.exe");


        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }
}

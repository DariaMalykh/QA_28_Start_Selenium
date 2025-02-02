import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement button  =  wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));

        List<WebElement> listA = wd.findElements(By.tagName("a"));
        List<WebElement> listA1 = wd.findElements(By.cssSelector("a"));

        WebElement form = wd.findElement(By.tagName("form"));
        List<WebElement> form1 = wd.findElements(By.cssSelector("form"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        List<WebElement> listInput = wd.findElements(By.tagName("input"));
        List<WebElement> listInput1 = wd.findElements(By.cssSelector("input"));

        //by class
        WebElement divLogo = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement divLogo1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement div = wd.findElement(By.className("container"));
        WebElement div1 = wd.findElement(By.cssSelector(".container"));

        WebElement divLogin = wd.findElement(By.className("active"));
        WebElement divLogin1 = wd.findElement(By.cssSelector(".active"));

        WebElement div2 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement div3 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //by id
        WebElement divID = wd.findElement(By.id("root"));
        WebElement divID1 = wd.findElement(By.cssSelector("#root"));

        //by attribute
        WebElement home = wd.findElement(By.cssSelector("[href ='/home']"));
        WebElement about = wd.findElement(By.cssSelector("[href ='/about']"));
        WebElement login = wd.findElement(By.cssSelector("[href ='/login']"));
        WebElement email = wd.findElement(By.cssSelector("[name =\"email\"]"));
        WebElement pas = wd.findElement(By.cssSelector("[name =\"password\"]"));

        //start
        WebElement reg1 = wd.findElement(By.cssSelector("[name ^='reg']"));
        WebElement pas1 = wd.findElement(By.cssSelector("[placeholder ^='Passw']"));

        //end
        WebElement email1 = wd.findElement(By.cssSelector("[placeholder $='ail']"));
        WebElement reg2 = wd.findElement(By.cssSelector("[name $= \"registration\"]"));

        //contains
        WebElement pas2 = wd.findElement(By.cssSelector("[placeholder *='assw']"));
        WebElement pas3 = wd.findElement(By.cssSelector("[name *=\"ssword\"]"));
        WebElement reg3 = wd.findElement(By.cssSelector("[name *= \"egistrat\"]"));



    }
    @AfterClass
    public void postConditions(){
        wd.quit();

    }
}

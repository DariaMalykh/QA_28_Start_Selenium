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
    public void classWork2(){
        WebElement el = wd.findElement(By.cssSelector("[name = 'login']"));
        String text = el.getText();//get from innerText
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("**************************");
        System.out.println(textForm);
    }
    @Test
    public void classWork(){
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

        //ancestor - or - self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement h1 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
        List<WebElement> list_a = wd.findElements(By.xpath("//a[3]/preceding-sibling::a"));
    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement button  =  wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement button3 = wd.findElement(By.xpath("//button"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));
        WebElement a3 = wd.findElement(By.xpath("//a"));
        WebElement a4Login = wd.findElement(By.xpath("//a[3]"));


        List<WebElement> listA = wd.findElements(By.tagName("a"));
        List<WebElement> listA1 = wd.findElements(By.cssSelector("a"));

        WebElement form = wd.findElement(By.tagName("form"));
        List<WebElement> form1 = wd.findElements(By.cssSelector("form"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_2 = wd.findElement(By.xpath("//h1"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));
        WebElement input3 = wd.findElement(By.xpath("//input"));

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
        WebElement divID2 = wd.findElement(By.xpath("//div[@id = 'root']"));

        WebElement divID3 = wd.findElement(By.cssSelector("div#root.container"));
        WebElement divID4 = wd.findElement(By.xpath("//div[@id = 'root' and @class = 'container']"));

        //by attribute
        WebElement home = wd.findElement(By.cssSelector("[href ='/home']"));
        WebElement home1 = wd.findElement(By.xpath("//*[@href = '/home']"));

        WebElement about = wd.findElement(By.cssSelector("[href ='/about']"));
        WebElement about1 = wd.findElement(By.xpath("//*[@href = '/about']"));

        WebElement login = wd.findElement(By.cssSelector("[href ='/login']"));
        WebElement login1 = wd.findElement(By.xpath("//*[@href = '/login']"));

        WebElement email = wd.findElement(By.cssSelector("[name =\"email\"]"));
        WebElement email1 = wd.findElement(By.xpath("//*[@name = 'email']"));

        WebElement pas = wd.findElement(By.cssSelector("[name =\"password\"]"));
        WebElement pas1 = wd.findElement(By.xpath("//*[@name = 'password']"));

        //start
        WebElement reg1 = wd.findElement(By.cssSelector("[name ^='reg']"));
        WebElement reg2 = wd.findElement(By.xpath("//*[starts-with(@name,'reg')]"));

        WebElement pas2 = wd.findElement(By.cssSelector("[placeholder ^='Passw']"));
        WebElement pas3 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Passw')]"));

        //end
        WebElement email2 = wd.findElement(By.cssSelector("[placeholder $='ail']"));
        WebElement reg3 = wd.findElement(By.cssSelector("[name $= \"registration\"]"));

        //contains
        WebElement pas4 = wd.findElement(By.cssSelector("[placeholder *='assw']"));
        WebElement pas5 = wd.findElement(By.xpath("//*[contains(@placeholder,'assw')]"));

        WebElement pas6 = wd.findElement(By.cssSelector("[name *=\"ssword\"]"));
        WebElement pas7 = wd.findElement(By.xpath("//*[contains(@name,'ssword')]"));

        WebElement reg4 = wd.findElement(By.cssSelector("[name *= \"egistrat\"]"));
        WebElement reg5 = wd.findElement(By.xpath("//*[contains(@name,'egistrat')]"));




    }
    @AfterClass
    public void postConditions(){
        wd.quit();

    }
}

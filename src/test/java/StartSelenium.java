import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;


    @Test
    public void test(){
        wd = new ChromeDriver();
        //wd.get("https://telranedu.web.app/home");не происходит сохраниения истории
        wd.navigate().to("https://telranedu.web.app/home");
        //wd.navigate().back();
        //wd.navigate().forward();

       // wd.close(); закрывает только одну вкладку
        wd.quit();//закрывает все вкладки и браузер
    }
}

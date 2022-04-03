
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationTest {


    // Sanity Test URL
    @Test
    public void getUrl() {

        AutomationPractice gUrl = new AutomationPractice("C:\\Users\\david\\Desktop\\SELENIUM\\chromedriver.exe");
        Assert.assertEquals(gUrl.SignUpTest(), "http://automationpractice.com/index.php");
    }


    // Test of Sign In
    @Test
    public void signIn() throws InterruptedException {
        AutomationPractice sIn = new AutomationPractice("C:\\Users\\david\\Desktop\\SELENIUM\\chromedriver.exe");
        Assert.assertEquals(sIn.signInAutomation(), "My account - My Store");

    }

}

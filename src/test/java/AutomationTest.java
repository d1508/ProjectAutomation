
import org.junit.Assert;
import org.junit.Test;

public class AutomationTest {


    // Sanity Test URL
    @Test
    public void getUrl() {

        SignInAutomation gUrl = new SignInAutomation("C:\\Users\\david\\Desktop\\SELENIUM\\chromedriver.exe");
        Assert.assertEquals(gUrl.SignUpTest(), "http://automationpractice.com/index.php");
    }


    // Test of Sign In
    @Test
    public void signIn() throws InterruptedException {
        SignInAutomation sIn = new SignInAutomation("C:\\Users\\david\\Desktop\\SELENIUM\\chromedriver.exe");
        Assert.assertEquals(sIn.signInAuto(), "My account - My Store");

    }

}

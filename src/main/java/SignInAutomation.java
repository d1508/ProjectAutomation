
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class SignInAutomation {
        private String url;

        public SignInAutomation(String url){
            this.url=url;
        }


        public  String SignUpTest(){
            System.setProperty("webdriver.chrome.driver", this.url);
            WebDriver driver = new ChromeDriver();
            // site name
            driver.get("http://automationpractice.com/index.php");
            return driver.getCurrentUrl();

        }



        public String signInAuto() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver",this.url);
            WebDriver driver = new ChromeDriver();

            driver.get("http://automationpractice.com/index.php");
            driver.manage().window().maximize();

            // Sign in
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

            // Mail
            WebElement mailAdress = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
            mailAdress.sendKeys("israelvivra260@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
            Thread.sleep(5000);

            //Title Mr
            driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();

            // First Name
            WebElement firstName = driver.findElement(By.id("customer_firstname"));
            firstName.sendKeys("Jordan");

            // Last Name
            WebElement lastName = driver.findElement(By.id("customer_lastname"));
            lastName.sendKeys("Israel");

            // Password
            WebElement passWord = driver.findElement(By.id("passwd"));
            passWord.sendKeys("charlesaznavour");

            // Birthday
            driver.findElement(By.id("days")).click();
            driver.findElement(By.xpath("//*[@id=\"days\"]/option[16]")).click();
            driver.findElement(By.id("months")).click();
            driver.findElement(By.xpath("//*[@id=\"months\"]/option[9]")).click();
            driver.findElement(By.id("years")).click();
            driver.findElement(By.xpath("//*[@id=\"years\"]/option[36]")).click();

            // Newsletter & Special Offers
            driver.findElement(By.id("newsletter")).click();
            driver.findElement(By.id("optin")).click();

            // Address
            WebElement aDDress = driver.findElement(By.id("address1"));
            aDDress.sendKeys("5th Avenue");

            //City
            WebElement city = driver.findElement(By.id("city"));
            city.sendKeys("New York");

            // State
            driver.findElement(By.xpath("//*[@id=\"id_state\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[34]")).click();

            // Zip/Postal Code
            WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
            postalCode.sendKeys("10021");

            // Additional information
            WebElement addInfo = driver.findElement(By.id("other"));
            addInfo.sendKeys("On the Last floor ");

            // Mobile Phone
            WebElement mobPhone = driver.findElement(By.id("phone_mobile"));
            mobPhone.sendKeys("0543817355");

            // Register
            driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();

            Thread.sleep(10000);
            System.out.println(driver.getTitle());

            return driver.getTitle();


        }

    }




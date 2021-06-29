
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
    public static void main(String[] args) {
        WebDriver driver = Base.getDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("shamim@braincraftapps.com");
        driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
        driver.findElement(By.xpath("id_gender1")).click();
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Shamim");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Hossain");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("@Shamim0011");

        Select days= new Select(driver.findElement(By.xpath("//select[@id='days']")));
        days.selectByValue("17");


        Select months = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        months.selectByValue("7");

        Select years = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        years.selectByValue("1995");


        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Shamim");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Hossain");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("BCL");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Dhaka, Mohammadpur");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Dhaka");
        Select state = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        years.selectByValue("Georgia");

        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("1207");

        Select country = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        country.selectByValue("United States");

        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("01637019061");
        driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Dhaka, Danmondi");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();



    }

}

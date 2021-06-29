import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {
    public static void main(String[] args) {
        WebDriver driver = Base.getDriver();
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();

        WebElement element = driver.findElement(By.xpath("//a[@title='View my shopping cart']']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        driver.findElement(By.xpath("//a[@id='button_order_cart']")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();

    }
}

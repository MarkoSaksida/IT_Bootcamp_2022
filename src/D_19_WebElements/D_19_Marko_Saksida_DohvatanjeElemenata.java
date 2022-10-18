package D_19_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D_19_Marko_Saksida_DohvatanjeElemenata {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();

            WebDriver wd = new ChromeDriver();

            wd.get("https://demoqa.com/text-box");

            wd.manage().window().maximize();

            String ime = "Marko Markovic";
            String email = "markomarkovic@markomail.com";
            String adresa = "Beograd, Beogradska bb";
            String stalnaAdresa = "Novi Beograd, Beogradska bb";

            WebElement inputName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
            inputName.sendKeys(ime);
            Thread.sleep(1000);

            WebElement inputEmail = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
            inputEmail.sendKeys(email);
            Thread.sleep(1000);

            WebElement inputAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
            inputAddress.sendKeys(adresa);
            Thread.sleep(1000);

            WebElement inputPermanentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
            inputPermanentAddress.sendKeys(stalnaAdresa);
            Thread.sleep(1000);

            WebElement submitBtn = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
            submitBtn.click();
            Thread.sleep(1000);

            WebElement outputName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[1]"));
            WebElement outputEmail = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[2]"));
            WebElement outputAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[3]"));
            WebElement outputPermanentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[4]"));


            Assert.assertTrue(outputName.getText().contains(ime));
            System.out.println(outputName.getText());
            Assert.assertTrue(outputEmail.getText().contains(email));
            System.out.println(outputEmail.getText());
            Assert.assertTrue(outputAddress.getText().contains(adresa));
            System.out.println(outputAddress.getText());
            Assert.assertTrue(outputPermanentAddress.getText().contains(stalnaAdresa));
            System.out.println(outputPermanentAddress.getText());

            wd.close();

        }
}

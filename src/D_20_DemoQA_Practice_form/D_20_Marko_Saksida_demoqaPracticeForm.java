package D_20_DemoQA_Practice_form;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class D_20_Marko_Saksida_demoqaPracticeForm {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        Actions actions = new Actions(wd);

        wd.get("https://demoqa.com/automation-practice-form");

        String ime = "Marko";
        String prezime = "Markovic";
        String mail = "marko.markovic@markovmail.com";
        String mobilni = "1234567890";

        WebElement firstName = wd.findElement(By.id("firstName"));
        firstName.sendKeys(ime);
        WebElement lastName = wd.findElement(By.id("lastName"));
        lastName.sendKeys(prezime);
        WebElement email = wd.findElement(By.id("userEmail"));
        email.sendKeys(mail);
        WebElement radio1 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        radio1.click();
        WebElement mobile = wd.findElement(By.id("userNumber"));
        mobile.sendKeys(mobilni);
        WebElement dateOfbirth = wd.findElement(By.id("dateOfBirthInput"));
        dateOfbirth.click();
        Select year = new Select(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")));
        year.selectByVisibleText("1980");
        Select month = new Select(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")));
        month.selectByVisibleText("October");
        WebElement dayOfBirth = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]"));
        dayOfBirth.click();

        WebElement subjects = wd.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Mat");
        subjects.sendKeys(Keys.ENTER);

        WebElement hobbies2 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]/label[1]"));
        WebElement hobbies3 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]"));
        hobbies2.click();
        hobbies3.click();

        WebElement pictureInput = wd.findElement(By.id("uploadPicture"));
        pictureInput.sendKeys("C:\\Users\\marko\\Desktop\\IT Bootcamp\\IntelliJ Projekti\\itBootcampBG14\\hogar_strasni_ft_ff.jpg");

        WebElement address = wd.findElement(By.id("currentAddress"));
        address.sendKeys("Beogradska bb, Beograd");

        WebElement state = wd.findElement(By.id("state"));
        actions.moveToElement(state);
        state.click();
        WebElement selectState = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        selectState.sendKeys("NCR");
        selectState.sendKeys(Keys.ENTER);
        WebElement city = wd.findElement(By.id("city"));
        city.click();
        WebElement selectCity = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        selectCity.sendKeys("Noida");
        selectCity.sendKeys(Keys.ENTER);

        WebElement submit = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[11]/div[1]/button[1]"));
        submit.click();


        WebElement checkName = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"));
        System.out.println("Name: " + checkName.getText().equalsIgnoreCase("Marko Markovic"));
        WebElement checkEmail = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"));
        System.out.println("Email: " + checkEmail.getText().equalsIgnoreCase("marko.markovic@markovmail.com"));
        WebElement checkGender = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]"));
        System.out.println("Gender: " + checkGender.getText().equalsIgnoreCase("Male"));
        WebElement checkPhone = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]"));
        System.out.println("Phone: " + checkPhone.getText().equalsIgnoreCase("1234567890"));
        WebElement checkBirth = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]"));
        System.out.println("Date of birth: " + checkBirth.getText().equalsIgnoreCase("01 October,1980"));
        WebElement checkSubject = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]"));
        System.out.println("Subject: " + checkSubject.getText().equalsIgnoreCase("Maths"));
        WebElement checkHobbies = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[2]"));
        System.out.println("Hobbies: " + checkHobbies.getText().equalsIgnoreCase("Reading, Music"));
        WebElement checkPicture = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[8]/td[2]"));
        System.out.println("Picture: " + checkPicture.getText().equalsIgnoreCase("hogar_strasni_ft_ff.jpg"));
        WebElement checkAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[2]"));
        System.out.println("Address: " + checkAddress.getText().equalsIgnoreCase("Beogradska bb, Beograd"));
        WebElement checkStateCity = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[10]/td[2]"));
        System.out.println("State and City: " + checkStateCity.getText().equalsIgnoreCase("NCR Noida"));


    }
}

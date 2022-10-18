package D_21_Shopping_cart;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver webDriver;

    private final String HOME_PAGE = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]";
    private final String CART = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]";


    private final String MODAL_HEADING_XPATH = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]";
    private final String MODAL_HEADING_TEXT = "Added!";
    private final String ADD_TO_CART = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]";
    private final String VIEW_CART_BTN = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/a[1]";

    public HomePage (WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }

    public String getModalTitle() {
        boolean elementFound = new WebDriverWait(webDriver, Duration.ofSeconds(2))
                .until(ExpectedConditions.textToBe(By.xpath(MODAL_HEADING_XPATH), MODAL_HEADING_TEXT));
        WebElement addedText = webDriver.findElement(By.xpath(MODAL_HEADING_XPATH));
        return addedText.getText();
    }

    public void clickOnHome(){
        WebElement home = webDriver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
        home.click();

    }
    public WebElement getDress(int dressNumber) {
        if (dressNumber < 2 || dressNumber > 35) {
            throw new IllegalArgumentException(String.format("The dress %d is not available", dressNumber));
        }
        return webDriver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[" + dressNumber + "]"));

    }
    public void scrollToDress(int dressNumber) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", getDress(dressNumber));
    }
    ///html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]

    public void hoverToDress(int dressNumber) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(getDress(dressNumber)).perform();

    }

    public void clickToAddCartButton() {
        WebElement addToCard = webDriver.findElement(By.xpath(ADD_TO_CART));
        addToCard.click();
    }

    public void clickToViewCartButton() {
        WebElement viewCart = webDriver.findElement(By.xpath(VIEW_CART_BTN));
        viewCart.click();
    }
    public void clickOnCart(){
        WebElement home = webDriver.findElement(By.xpath(CART));
        home.click();
    }
    public void enterEmailToSubscribe(String email){
        WebElement subscribeField = webDriver.findElement(By.id("susbscribe_email"));
        subscribeField.click();
        subscribeField.sendKeys(email);
        WebElement subscribeBtn = webDriver.findElement(By.id("subscribe"));
        subscribeBtn.click();
    }


}

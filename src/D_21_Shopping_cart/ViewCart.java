package D_21_Shopping_cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart {

    private WebDriver webDriver;

    @FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
    private WebElement slika;

    //public WebElement getSlika() {ovo je isto sto i @FindBy sa odredjenim xpath
    //return webDriver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]");
    //}


    public ViewCart(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }
    private final String EMPTY_CART_BTN = "/html[1]/body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/a[1]";

    private final String EMPTY_CART_STRING = "/html[1]/body[1]/section[1]/div[1]/div[2]/span[1]/p[1]/b[1]";

    public String getSrcAtt() {
        return slika.getAttribute("src");
    }

    public void clickOnEmptyCartBtn(){
        WebElement home = webDriver.findElement(By.xpath(EMPTY_CART_BTN));
        home.click();
    }

    public String cartIsEmpty() {
//        WebElement emptyCart = new WebDriverWait(webDriver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(EMPTY_CART_STRING)));
        //new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        WebElement emptyCart = webDriver.findElement(By.xpath(EMPTY_CART_STRING));
        String actualText = emptyCart.getText();
        return actualText;
    }



}

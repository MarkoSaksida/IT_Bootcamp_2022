package D_21_Shopping_cart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestHomePage {

    @BeforeClass
    public void preKlase() {
        System.out.println("Pre pustanja u rad klase");
    }

//    @BeforeGroups
//    @BeforeSuite
//    @BeforeTest

    private final static String MODAL_TITLE_EXPECTED = "Added!";
    private WebDriver webDriver;
    private HomePage homePage;
    private ViewCart viewCart;
    private final static String EMPTY_CART_TITLE_EXPECTED = "Cart is empty!";

    @BeforeMethod
    public void configure() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        viewCart = new ViewCart(webDriver);
        webDriver.get("https://www.automationexercise.com/");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        webDriver.manage().window().maximize();
    }

    /**
     * Test steps:
     * 1. Idem na home
     * 2. Scroll do prve haljine
     * 3. Hover na tu haljinu (koristimo Actions, moveToElement(element).perform()
     * 4. Kliknemo 'add to cart'
     * 5. Potvrdimo da se pojavilo 'Added'
     * 6. Kliknemo view cart
     * 7. Potvrdimo da je haljina u korpi
     */


    @Test
    public void testAddToShoppingCartHappyPath() {

        homePage.getDress(2);
        homePage.hoverToDress(2);
        homePage.clickToAddCartButton();

        Assert.assertEquals(homePage.getModalTitle(), MODAL_TITLE_EXPECTED, "The text should be added");

        homePage.clickToViewCartButton();

        Assert.assertEquals(viewCart.getSrcAtt(), "https://www.automationexercise.com/get_product_picture/1");

    }

    @Test
    public void testAddToShoppingCartUnappyPath() {

        Assert.assertThrows(IllegalArgumentException.class, () -> homePage.scrollToDress(100));
    }

    @Test
    public void checkIfTheShoppingCartIsEmpty() throws InterruptedException {

        homePage.clickOnCart();
        Thread.sleep(5000);

        Assert.assertEquals(viewCart.cartIsEmpty(), EMPTY_CART_TITLE_EXPECTED, "the text should be 'Cart is empty!'");
    }

    @Test
    public void testRemoveItemFromShoppingCart() throws InterruptedException {

        homePage.getDress(2);
        homePage.hoverToDress(2);
        homePage.clickToAddCartButton();

        Assert.assertEquals(homePage.getModalTitle(), MODAL_TITLE_EXPECTED, "The text should be added");

        homePage.clickToViewCartButton();
        viewCart.getSrcAtt();
        viewCart.clickOnEmptyCartBtn();
        Thread.sleep(5000);

        Assert.assertEquals(viewCart.cartIsEmpty(), EMPTY_CART_TITLE_EXPECTED, "the text should be 'Cart is empty!'");

    }

    @Test
    public void subscribeToNewsletter() {
        homePage.enterEmailToSubscribe("email@mail.com");
        // ovde ne mogu da ulovim "You have successfully subscribed!"
    }

    @AfterMethod
    public void closeWebDriver() {
        webDriver.close();
    }

}
package D_22_LogoutTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver webDriver;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
    private WebElement name;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
    private WebElement email;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")
    private WebElement button;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
    private WebElement loginEmail;

    @FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
    private WebElement loginPassword;

    @FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")
    private WebElement loginButton;

    @FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")
    private WebElement loginTitle;

    public Login(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }

    public void inputNameField(String name) {
        this.name.sendKeys(name);
    }

    public void clickSingUp() {
        this.button.click();
    }

    public void inputEmailField(String email) {
        this.email.sendKeys(email);
    }

    public void inputSignInEmailField(String email) {
        this.loginEmail.sendKeys(email);
    }

    public void inputSignInPasswordField(String password) {
        this.loginPassword.sendKeys(password);
    }

    public void clickLogin() {
        this.loginButton.click();
    }

    public String getModalTitle1() {
        return this.loginTitle.getText();
    }



}
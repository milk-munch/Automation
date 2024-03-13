import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "user-name")
    public WebElement loginUserName;

    @FindBy(id = "password")
    public WebElement loginPassword;

    @FindBy(id = "login-button")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[text() = 'Epic sadface: Username and password do not match any user in this service']")
    public WebElement wrongPswErr;
}

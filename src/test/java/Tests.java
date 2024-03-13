import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Tests {
    WebDriver driver;
    LoginPage login;
    ProductsPage products;
    CartPage cart;

    @BeforeMethod
    public void openEnvURL() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        login = PageFactory.initElements(driver, LoginPage.class);
        products = PageFactory.initElements(driver, ProductsPage.class);
        cart = PageFactory.initElements(driver, CartPage.class);

    }

    @Test
    public void loginStandardUser() {
        login.loginUserName.sendKeys("standard_user");
        login.loginPassword.sendKeys("secret_sauce");
        login.loginBtn.click();
        products.productsHeader.isDisplayed();
    }


    @Test
    public void loginWrongPassword() {
        login.loginUserName.sendKeys("standard_user");
        login.loginPassword.sendKeys("aaa");
        login.loginBtn.click();
        login.wrongPswErr.isDisplayed();
    }

    @Test
    public void logout() throws InterruptedException {
        login.loginUserName.sendKeys("standard_user");
        login.loginPassword.sendKeys("secret_sauce");
        login.loginBtn.click();
        products.openMenu.click();
        Thread.sleep(17);
        products.logoutBtn.click();
    }

    @Test
    public void addProductToChart() {
        login.loginUserName.sendKeys("standard_user");
        login.loginPassword.sendKeys("secret_sauce");
        login.loginBtn.click();
        products.addBikeLightToCart.click();
        products.openCart.click();
        cart.bikeLightInCart.isDisplayed();
    }

    @Test
    public void continueShoppingFromCart() {
        login.loginUserName.sendKeys("standard_user");
        login.loginPassword.sendKeys("secret_sauce");
        login.loginBtn.click();
        products.addBikeLightToCart.click();
        products.openCart.click();
        cart.continueShopping.click();
    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
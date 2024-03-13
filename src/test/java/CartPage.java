import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(xpath = "//*[@class = 'cart_item']//*[text() = 'Sauce Labs Bike Light']")
    public WebElement bikeLightInCart;

    @FindBy(id = "continue-shopping")
    public WebElement continueShopping;
}

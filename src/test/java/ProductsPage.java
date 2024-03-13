import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
    @FindBy(xpath = "//*[text() = 'Products']")
    public WebElement productsHeader;

    @FindBy(id = "react-burger-menu-btn")
    public WebElement openMenu;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutBtn;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addBikeLightToCart;

    @FindBy(id = "shopping_cart_container")
    public WebElement openCart;
}

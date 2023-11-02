package Pages.Inventory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Pages.Inventory.Locators.*;

public class JunoJacketPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(how = How.ID,using =SIZELARGELEBELLOCATOR )
    private  WebElement SizeLargeLabel;

    @FindBy(how = How.ID,using =COLORGREENLABELLOCATOR)
    private  WebElement ColorGreenLabel;
    @FindBy(how = How.ID,using =QTYFIELDLOCATOR)
    private  WebElement QtyField;
    @FindBy(how = How.ID,using = ADDTOCARTBUTTONLOCATOR)
    private static WebElement AddToCartButton;


    public JunoJacketPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void clickLarge(){
        wait.until(ExpectedConditions.visibilityOf(SizeLargeLabel));
        SizeLargeLabel.click();
    }
    public void clickGreen(){
        ColorGreenLabel.click();
    }
    public void enterQty(String Qty){
        QtyField.clear();
        QtyField.sendKeys(Qty);
    }

    public void clickAddToCart(){
        AddToCartButton.click();
    }





}

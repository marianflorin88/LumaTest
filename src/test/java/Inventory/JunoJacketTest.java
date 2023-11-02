package Inventory;

import Base.JunoJacketBase;
import Pages.Inventory.JunoJacketPage;
import org.testng.annotations.Test;

public class JunoJacketTest extends JunoJacketBase {

    @Test
    public void testAddJunoJacketToCart() {
        JunoJacketPage junoJacketPage = new JunoJacketPage(driver);
        junoJacketPage.clickLarge();
        junoJacketPage.clickGreen();
        junoJacketPage.enterQty("2");
        junoJacketPage.clickAddToCart();

    }
}

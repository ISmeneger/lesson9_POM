import Ilya_S.pageObjects.HomePage;
import Ilya_S.pageObjects.NavigationPage;
import Ilya_S.pageObjects.WebFormPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static Ilya_S.pageObjects.HomePage.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("POM")
class NavigationTestsForPOM extends BaseTestForPOM {
    @Test
    void openNavigationTest() {
        HomePage homePage = new HomePage(driver);
        NavigationPage navigationPage = homePage.openNavigationPage();
        String currentUrl = navigationPage.getCurrentUrl();
        WebElement title = navigationPage.getTitle();
        String webFormUrl = navigationPage.getUrl();

        assertEquals(BASE_URL + webFormUrl, currentUrl);
        assertEquals("Navigation example", title.getText());
    }
}

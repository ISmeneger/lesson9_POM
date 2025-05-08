import Ilya_S.pageObjects.HomePage;
import Ilya_S.pageObjects.WebFormPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static Ilya_S.pageObjects.HomePage.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("POM")
class WebFormTestsForPOM extends BaseTestForPOM {
    @Test
    void openWebFormTest() {
        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();
        String currentUrl = webFormPage.getCurrentUrl();
        WebElement title = webFormPage.getTitle();
        String webFormUrl = webFormPage.getUrl();

        assertEquals(BASE_URL + webFormUrl, currentUrl);
        assertEquals("Web form", title.getText());
    }

    @Test
    void openWebFormTestWithCheck() {
        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();

        webFormPage.checkIsWebPage();
    }

    @Test
    void submitFormTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();

        webFormPage.submitForm();
        Thread.sleep(3000);
    }
}

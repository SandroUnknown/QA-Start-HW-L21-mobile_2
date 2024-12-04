package tests.ios;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.WikipediaErrorScreen;
import screens.WikipediaMainScreen;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.name;

@Tag("ios")
@Owner("Petyukov Alexander")
@DisplayName("Проверки для Android")
public class IosTests extends TestBase {

    //@Test
    void successfulSearchTest() {

        //$("XCUIElementTypeStaticText").click();
        $("Text").click();

    }

    @Test
    public void searchTest() {
        String searchQuery = "Appium";

            $(accessibilityId("Text Button")).click();

            //$(accessibilityId("Text Input")).sendKeys(searchQuery + "\n");
            $(accessibilityId("Text Input")).sendKeys(searchQuery);

            $(accessibilityId("Text Output")).shouldHave(text(searchQuery));

    }

    //@Test
    public void visibleMainPageTest() {

            $(name("Alert")).shouldBe(visible);
            $(name("Text")).shouldBe(visible);

    }


}
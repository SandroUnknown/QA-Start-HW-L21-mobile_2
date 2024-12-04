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

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

@Tag("ios")
@Owner("Petyukov Alexander")
@DisplayName("Проверки для Android")
public class IosTests extends TestBase {

    @Test
    void successfulSearchTest() {


        //$("XCUIElementTypeStaticText").click();
        $("Text").click();

    }




}
package tests.ios;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.ios.SampleAppSearchScreen;
import tests.TestBase;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.name;

@Tag("ios")
@Owner("Petyukov Alexander")
@DisplayName("Проверки для Android")
public class IosTests extends TestBase {

    //@Test
    public void successfulSearchTest() {

        String query = "Appium";
        SampleAppSearchScreen searchScreen = new SampleAppSearchScreen();

        searchScreen
                .clickSearchField()
                .searchQuery(query);

        searchScreen
                .checkSearchResult(query);
    }

    @Test
    public void visibleMainPageTest() {

            $(name("Aler12")).shouldBe(exist);
            $(name("Text")).shouldBe(exist);

    }


}
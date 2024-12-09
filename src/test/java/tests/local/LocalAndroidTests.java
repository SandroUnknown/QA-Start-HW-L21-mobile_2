package tests.local;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.android.components.WikipediaContinueButtonComponent;
import screens.android.components.WikipediaOnBoardingScreenComponent;
import tests.TestBase;

@Tag("local_android")
@Owner("Petyukov Alexander")
@DisplayName("Проверки для Android")
public class LocalAndroidTests extends TestBase {

    @Test
    @Feature("Позитивная проверка")
    @DisplayName("Проверить, что открываются все 4 страницы 'онбординга' и каждая содержит правильный текст")
    void successfulSearchTest() {

        WikipediaOnBoardingScreenComponent onBoardingScreen = new WikipediaOnBoardingScreenComponent();
        WikipediaContinueButtonComponent continueButton = new WikipediaContinueButtonComponent();

        onBoardingScreen.checkTextOnScreen("We’ve found the following on your device:");
        continueButton.click();

        onBoardingScreen.checkTextOnScreen("Dive down the Wikipedia rabbit hole " +
                "with a constantly updating Explore feed.");
        continueButton.click();

        onBoardingScreen.checkTextOnScreen("You can make reading lists from " +
                "articles you want to read later, even when you’re offline.");
        continueButton.click();

        onBoardingScreen.checkTextOnScreen("We believe that you should not have " +
                "to provide personal information to participate in the free knowledge movement.");
    }
}
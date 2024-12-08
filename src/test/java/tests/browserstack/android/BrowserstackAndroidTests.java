package tests.browserstack.android;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.android.WikipediaErrorScreen;
import screens.android.WikipediaMainScreen;
import screens.android.WikipediaSearchResultScreen;
import tests.TestBase;

@Tag("browserstack_android")
@Owner("Petyukov Alexander")
@DisplayName("Проверки для Android")
public class BrowserstackAndroidTests extends TestBase {

    @Test
    @Feature("Позитивная проверка")
    @DisplayName("Проверить, что поиск статей работает")
    void successfulSearchTest() {

        WikipediaMainScreen mainScreen = new WikipediaMainScreen();
        WikipediaSearchResultScreen searchResultScreen = new WikipediaSearchResultScreen();

        mainScreen.searchQuery("Appium");
        searchResultScreen.checkSearchResult();
    }

    @Test
    @Feature("Негативная проверка")
    @DisplayName("Проверить, что открытие статьи из результата поиска НЕ работает")
    void unsuccessfulOpenArticleTest() {

        WikipediaMainScreen mainScreen = new WikipediaMainScreen();
        WikipediaSearchResultScreen searchResultScreen = new WikipediaSearchResultScreen();
        WikipediaErrorScreen errorScreen = new WikipediaErrorScreen();

        mainScreen.searchQuery("Appium");
        searchResultScreen.openArticle(0);
        errorScreen.checkError("An error occurred");
    }
}
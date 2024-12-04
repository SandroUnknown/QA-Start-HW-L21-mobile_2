package tests.android;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.android.WikipediaErrorScreen;
import screens.android.WikipediaMainScreen;
import tests.TestBase;

@Tag("android")
@Owner("Petyukov Alexander")
@DisplayName("Проверки для Android")
public class AndroidTests extends TestBase {

    @Test
    @Feature("Позитивная проверка")
    @DisplayName("Проверить, что поиск статей работает")
    void successfulSearchTest() {

        WikipediaMainScreen mainScreen = new WikipediaMainScreen();

        mainScreen
                .clickSearchField()
                .searchQuery("Appium");

        mainScreen
                .checkSearchResult();
    }

    @Test
    @Feature("Негативная проверка")
    @DisplayName("Проверить, что открытие статьи из результата поиска НЕ работает")
    void unsuccessfulOpenArticleTest() {

        WikipediaMainScreen mainScreen = new WikipediaMainScreen();
        WikipediaErrorScreen errorScreen = new WikipediaErrorScreen();

        mainScreen
                .clickSearchField()
                .searchQuery("Appium")
                .openArticle(0);

        errorScreen
                .checkError("An error occurred");
    }
}
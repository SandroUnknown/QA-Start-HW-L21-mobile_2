package tests.android;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.WikipediaErrorScreen;
import screens.WikipediaMainScreen;
import tests.TestBase;

@Tag("android")
@Owner("Petyukov Alexander")
@DisplayName("Проверки для Android")
public class AndroidTests extends TestBase {

    @Test
    @Feature("Позитивная проверка")
    @DisplayName("Проверить, что поиск статей работает")
    void successfulSearchTest() {

        WikipediaMainScreen mainPage = new WikipediaMainScreen();

        mainPage
                .searchQuery("Appium");

        mainPage
                .checkSearchResult();
    }

    @Test
    @Feature("Негативная проверка")
    @DisplayName("Проверить, что открытие статьи из результата поиска НЕ работает")
    void unsuccessfulOpenArticleTest() {

        WikipediaMainScreen mainPage = new WikipediaMainScreen();
        WikipediaErrorScreen errorPage = new WikipediaErrorScreen();

        mainPage
                .searchQuery("Appium")
                .openArticle(0);

        errorPage
                .checkError("An error occurred");
    }
}
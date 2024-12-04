package tests.android;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.WikipediaErrorScreen;
import screens.WikipediaMainScreen;
import tests.TestBase;

@Tag("android")
@Owner("Petyukov Alexander")
public class AndroidTests extends TestBase {

    @Test
    @DisplayName("Проверить, что поиск статей работает")
    void successfulSearchTest() {

        WikipediaMainScreen mainPage = new WikipediaMainScreen();

        mainPage
                .searchQuery("Appium");

        mainPage
                .checkSearchResult();
    }

    @Test
    @DisplayName("Проверить, что открытие статьи из результата поиска НЕ работает (негативный тест)")
    void unsuccessfulSearchTest() {

        WikipediaMainScreen mainPage = new WikipediaMainScreen();
        WikipediaErrorScreen errorPage = new WikipediaErrorScreen();

        mainPage
                .searchQuery("Appium")
                .openArticle(0);

        errorPage
                .checkError("An error occurred");
    }
}
package tests;

import org.junit.jupiter.api.Test;
import screens.WikipediaErrorScreen;
import screens.WikipediaMainScreen;

public class SearchTests extends TestBase {


    @Test
    void successfulSearchTest() {

        WikipediaMainScreen mainPage = new WikipediaMainScreen();

        mainPage
                .searchQuery("Appium");

        mainPage
                .checkSearchResult();
    }

    @Test
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

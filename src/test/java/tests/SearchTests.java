package tests;

import org.junit.jupiter.api.Test;
import screens.WikipediaErrorScreen;
import screens.WikipediaMainScreen;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static groovy.xml.dom.DOMCategory.text;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {


    @Test
    void successfulSearchTest() {

        WikipediaMainScreen mainPage = new WikipediaMainScreen();

        mainPage
                .searchQuery("Appium")
                .openArticle(0);

        mainPage
                .checkSearchResult(1);




        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });

        step("Verify content found", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));



    }

    @Test
    void unSuccessfulSearchTest() {

        WikipediaMainScreen mainPage = new WikipediaMainScreen();
        WikipediaErrorScreen errorPage = new WikipediaErrorScreen();

        mainPage
                .searchQuery("Appium")
                .openArticle(0);

        errorPage
                .checkError("An error occurred");
    }
}

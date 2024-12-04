package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static groovy.xml.dom.DOMCategory.text;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {


   /* @Test
    void successfulSearchTest() {

        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });

        step("Verify content found", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));



    }*/

    @Test
    void successfulSearchTest2() {

        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });


        //Appius Claudius Caecus
        //Expand table


        //$(id("org.wikipedia.alpha:id/page_list_item_title")).click();

        //$(byText("Appius Claudius Caecus")).click();
        //$(accessibilityId("Appius Claudius Caecus")).click();
        //$(accessibilityId("Appium")).click();
        sleep(10000);

        $$(id("org.wikipedia.alpha:id/page_list_item_title")).get(0).click();



        //android.view.View
         //       Appium is an open



        /*

        package	org.wikipedia.alpha
        class	android.widget.TextView
        text	Appius Claudius Caecus
        resource-id	org.wikipedia.alpha:id/page_list_item_title

         */



/*
        step("Verify content found", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));

 */
    }




}

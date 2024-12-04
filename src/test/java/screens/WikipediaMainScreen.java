package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;
import static io.appium.java_client.AppiumBy.id;

public class WikipediaMainScreen {

    private final SelenideElement searchElement = $(id("org.wikipedia.alpha:id/search_src_text"));
    private final ElementsCollection articlesListElements = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Написать запрос в поле поиска")
    public WikipediaMainScreen searchQuery(String query) {

        $(accessibilityId("Search Wikipedia")).click();
        searchElement.sendKeys(query);
        return this;
    }

    @Step("Открыть одну из статей")
    public WikipediaMainScreen openArticle(int numberOfArticle) {

        articlesListElements.get(numberOfArticle).click();
        return this;
    }
}

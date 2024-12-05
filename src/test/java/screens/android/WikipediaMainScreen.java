package screens.android;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import screens.android.components.SearchInputComponent;

import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class WikipediaMainScreen {

    private final ElementsCollection articlesListElements = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Ввести запрос поиска")
    public WikipediaMainScreen searchQuery(String query) {

        new SearchInputComponent().clickSearchField().searchQuery(query);
        return this;
    }

    @Step("Открыть одну из статей")
    public WikipediaMainScreen openArticle(int numberOfArticle) {

        articlesListElements.get(numberOfArticle).click();
        return this;
    }

    public WikipediaMainScreen openArticle() {

        return openArticle(0);
    }

    @Step("Проверить, что есть результаты выдачи")
    public void checkSearchResult(int minArticleCount) {

        assertThat(articlesListElements).size().isGreaterThan(minArticleCount - 1);
    }

    public void checkSearchResult() {

        checkSearchResult(1);
    }
}
package screens.android.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchInputComponent {

    private final SelenideElement pceudoSearchElement = $(accessibilityId("Search Wikipedia"));
    private final SelenideElement searchElement = $(id("org.wikipedia.alpha:id/search_src_text"));

    @Step("Нажать в поле для поиска")
    public SearchInputComponent clickSearchField() {

        pceudoSearchElement.click();
        return this;
    }

    @Step("Написать запрос в поле поиска")
    public SearchInputComponent searchQuery(String query) {

        searchElement.sendKeys(query);
        return this;
    }
}

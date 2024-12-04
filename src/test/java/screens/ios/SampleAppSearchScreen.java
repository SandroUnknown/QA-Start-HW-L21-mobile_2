package screens.ios;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.assertj.core.api.Assertions.assertThat;

public class SampleAppSearchScreen {

    private final SelenideElement buttonElement = $(accessibilityId("Text Button"));
    private final SelenideElement inputElement = $(accessibilityId("Text Input"));
    private final SelenideElement outputElement = $(accessibilityId("Text Output"));

    @Step("Нажать в поле для поиска")
    public SampleAppSearchScreen clickSearchField() {

        buttonElement.click();
        return this;
    }

    @Step("Написать запрос в поле поиска")
    public SampleAppSearchScreen searchQuery(String query) {

        inputElement.sendKeys(query);
        inputElement.pressEnter();
        return this;
    }

    @Step("Проверить результат выдачи")
    public void checkSearchResult(String expectedText) {

        String actualText = outputElement.getText();
        assertThat(actualText).contains(expectedText);
    }
}
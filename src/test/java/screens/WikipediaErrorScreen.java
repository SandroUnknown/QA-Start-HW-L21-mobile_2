package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;
import static org.assertj.core.api.Assertions.assertThat;

public class WikipediaErrorScreen {

    private final SelenideElement errorFieldElement = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));

    @Step("Проверить, что произошла ошибка")
    public void checkError(String textError) {

        //errorFieldElement.shouldBe(visible);
        assertThat(errorFieldElement).isNotNull();
        //String errorOnPage = errorFieldElement.getAttribute("text");
        assertThat(errorFieldElement.getAttribute("text"))
                .isEqualTo(textError);
    }
}
package screens.ios;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.name;
import static org.assertj.core.api.Assertions.assertThat;

public class SampleAppMainScreen {

    private final SelenideElement buttonElement = $(accessibilityId("Text Button"));
    private final SelenideElement inputElement = $(accessibilityId("Text Input"));
    private final SelenideElement outputElement = $(accessibilityId("Text Output"));

    @Step("Проверить наличие надписи")
    public SampleAppMainScreen checkExistText(String text) {

        $(name(text)).shouldBe(exist);
        return this;
    }
}
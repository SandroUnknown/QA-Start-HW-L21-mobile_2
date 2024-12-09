package screens.android.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class WikipediaContinueButtonComponent {

    private final SelenideElement continueButtonElement = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));

    @Step("Перейти на следующую страницу")
    public void click() {

        continueButtonElement.click();
    }
}
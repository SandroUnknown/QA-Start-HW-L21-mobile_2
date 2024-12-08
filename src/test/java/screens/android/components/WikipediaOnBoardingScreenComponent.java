package screens.android.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class WikipediaOnBoardingScreenComponent {

    private static final SelenideElement secondaryTextLocator = $(id("org.wikipedia.alpha:id/secondaryTextView"));

    @Step("Проверить текст на странице")
    public static void checkTextOnScreen(String expectedText) {

        String actualText = $(secondaryTextLocator).getText();
        assertThat(actualText).contains(expectedText);
    }
}
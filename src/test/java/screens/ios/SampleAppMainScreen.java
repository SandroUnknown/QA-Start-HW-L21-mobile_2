package screens.ios;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.name;

public class SampleAppMainScreen {

    @Step("Проверить наличие надписи")
    public SampleAppMainScreen checkExistText(String text) {

        $(name(text)).shouldBe(exist);
        return this;
    }
}
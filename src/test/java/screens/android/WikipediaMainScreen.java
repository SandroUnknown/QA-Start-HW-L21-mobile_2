package screens.android;

import io.qameta.allure.Step;
import screens.android.components.WikipediaSearchInputComponent;

public class WikipediaMainScreen {

    @Step("Ввести запрос поиска")
    public WikipediaMainScreen searchQuery(String query) {

        new WikipediaSearchInputComponent().clickSearchField().searchQuery(query);
        return this;
    }
}
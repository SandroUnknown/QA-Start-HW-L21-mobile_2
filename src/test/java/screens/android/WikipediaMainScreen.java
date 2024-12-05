package screens.android;

import io.qameta.allure.Step;
import screens.android.components.SearchInputComponent;

public class WikipediaMainScreen {

    @Step("Ввести запрос поиска")
    public WikipediaMainScreen searchQuery(String query) {

        new SearchInputComponent().clickSearchField().searchQuery(query);
        return this;
    }
}
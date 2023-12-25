import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    @DisplayName("Check label successful search")
    void successfulSearchTest() {
        open("https://github.com/");
        $(".header-search-button").click();
        $("#query-builder-test").setValue("qa guru").pressEnter();

        $("[data-testid=\"results-list\"]").shouldHave(text("qa-guru/niffler"));


    }
    @Test
    void unsuccessfulSearchTextTest() {
        open("https://github.com/");
        $(".home-campaign-hero").shouldHave(text("Let’s build from here"));
    }
}

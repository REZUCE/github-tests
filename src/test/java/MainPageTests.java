import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class MainPageTests {

    @Test
    @DisplayName("Check label \"Let’s build from here\" on main page")
    void HeaderTextTest() {
        open("https://github.com/");
        $(".home-campaign-hero").shouldHave(text("Let’s build from here"));
    }

    @Test
    void secondTest() {

    }

    @Test
    void thirdTest() {

    }
}

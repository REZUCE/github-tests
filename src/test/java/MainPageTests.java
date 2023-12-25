import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class MainPageTests {

    @Test
    void firstTest() {
        open("https://github.com/");
        $("html").shouldHave(text("Let’s build from here"));
    }

    @Test
    void secondTest() {

    }

    @Test
    void thirdTest() {

    }
}

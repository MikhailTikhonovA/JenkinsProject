package github.ux.positive;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TopBar {

    @Test
    void clickSignInButton(){
        open("https://github.com/");
        $(byText("Sign in")).click();
    }
}

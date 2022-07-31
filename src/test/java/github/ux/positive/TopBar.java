package github.ux.positive;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TopBar {

    @Test
    @Tag("regression")
    @Tag("1")
    void clickSignInButton() {
        open("https://github.com/");
        $(byText("Sign in")).click();
        closeWindow();
        System.out.println("1");
    }

    @Test
    @Tag("smoke")
    @Tag("2")
    void clickSignInButton2() {
        open("https://github.com/");
        $(byText("Sign in")).click();
        closeWindow();
        System.out.println("1");
    }
}

package steps;

import io.cucumber.java.Before;
import pages.BasicPage;
import sun.awt.www.content.audio.basic;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {
    BasicPage basicPage = new BasicPage();

    @Before
    public void openUrl() {
        open("https://grinfer.com/");
        closeCookiesPopup();
    }

    public void closeCookiesPopup() {
        if (basicPage.checkTextExist("This website is using cookies")) {
            basicPage.clickButtonSpan("I agree");
        }
    }

}

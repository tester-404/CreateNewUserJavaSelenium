package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text) {
        $(By.xpath("//div[contains(text(),'" + text + "')]")).click();
    }

    public void clickButtonSpan(String text) {
        $(By.xpath("//span[text()='" + text + "']/..")).click();
    }

    public void clickButtonLi(String text) {
        $(By.xpath("//li[text()='" + text + "']/..")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }

    public Boolean checkTextExist(String text) {
        if ($(By.xpath("//*[text()='" + text + "']")).exists()) {
        return true;
    } else return false;
}
}




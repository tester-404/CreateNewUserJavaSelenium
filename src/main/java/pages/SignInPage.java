package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.cssSelector("#email"));
    private SelenideElement passwordInput = $(By.cssSelector("#password"));
    private SelenideElement firstNameInput = $(By.cssSelector("#firstName"));
    private SelenideElement lastNameInput = $(By.cssSelector("#lastName"));

    public void inputEmail(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

    public void inputFirstName(String text){
        firstNameInput.val(text);
    }

    public void inputLastName(String text){
        lastNameInput.val(text);
    }


}

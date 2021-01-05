package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import pages.SignInPage;
import static app_context.RunContext.*;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();

    @Then("Input email")
    public void inputEmail() {
        String email = "Auto_" + RandomStringUtils.randomAlphabetic(5) + "@mail.com";
        signInPage.inputEmail(email);
        put("email", email);
        // signInPage.inputEmail(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Input First Name")
    public void inputFirstName(){
    }

    @Then("Input Last Name")
    public void inputLastName(){
    }

}

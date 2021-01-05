package steps;

import pages.HomePage;

public class HomePageDef {

    HomePage homePage = new HomePage();

    public void clickAvatarButton(){
        homePage.avatarButton.click();
    }

}

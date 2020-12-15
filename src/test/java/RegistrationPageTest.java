import org.testng.annotations.Test;

public class RegistrationPageTest extends DriverSettings {

    @Test(priority = 1)
    public void registrationTitle() {
        registrationPage.registration();
    }

    @Test(priority = 2)
    public void socialBtnsVisible() {
        registrationPage.facebookBtn();
        registrationPage.vkBtn();
        registrationPage.twitterBtn();
        registrationPage.githubBtn();
        registrationPage.liveIdBtn();
        registrationPage.googleBtn();
    }

    @Test(priority = 3)
    public void emailFieldFill() {
        registrationPage.setEmailField();
    }

    @Test(priority = 4)
    public void nicknameFieldFill() {
        registrationPage.setNicknameField();
    }

    @Test(priority = 5)
    public void passwordFieldFill() {
        registrationPage.setPasswordField();
    }

    @Test(priority = 6)
    public void passwordRepeatFieldFill() {
        registrationPage.setPasswordRepeatField();
    }

    @Test(priority = 7)
    public void checkboxElement() {
        registrationPage.checkBoxElement();
    }

    // ERROR: Selenium does`nt work with captcha
    @Test(priority = 8)
    public void captchaElement() {
        registrationPage.captchaElement();
    }
    //--------------------------------------------

    @Test(priority = 9)
    public void registrationBtn() {
        registrationPage.registrationBtnCheck();
        registrationPage.registrationBtnClick();
    }
}

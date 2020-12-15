import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage extends DriverSettings {

    public WebDriver driver;


    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void registration() {
        $("title").shouldHave(attribute("text", "Регистрация аккаунта — Habr Account"));
    }


    public void facebookBtn() {
        $(By.cssSelector("svg")).shouldBe(Condition.visible);
    }

    public void vkBtn() {
        $(By.cssSelector("a.socials-buttons__button.socials-buttons__button_vkontakte > svg")).shouldBe(Condition.visible);
    }

    public void twitterBtn() {
        $(By.cssSelector("a.socials-buttons__button.socials-buttons__button_twitter > svg")).shouldBe(Condition.visible);
    }

    public void githubBtn() {
        $(By.cssSelector("a.socials-buttons__button.socials-buttons__button_github > svg")).shouldBe(Condition.visible);
    }

    public void liveIdBtn() {
        $(By.cssSelector("a.socials-buttons__button.socials-buttons__button_liveid > svg")).shouldBe(Condition.visible);
    }

    public void googleBtn() {
        $(By.cssSelector("a.socials-buttons__button.socials-buttons__button_google.google > svg")).shouldBe(Condition.visible);
    }

    public void setEmailField() {
        $(By.id("email_field")).val("Test User");
    }

    public void setNicknameField() {
        $(By.id("nickname_field")).val("Tester");
    }

    public void setPasswordField() {
        $(By.id("password_field")).val("Test");
    }

    public void setPasswordRepeatField() {
        $(By.id("password_repeat")).val("Test");
    }

    public void checkBoxElement() {
        $(By.cssSelector("span.checkbox__label.checkbox__label_top")).shouldBe(Condition.enabled);
    }

    public void registrationBtnCheck() {
        $(By.id("registration_button")).shouldBe(Condition.enabled);
    }

    public void captchaElement() {
        $(By.id("rc-anchor-container")).click();
    }

    public void registrationBtnClick() {
        $(By.id("registration_button")).click();
    }


}

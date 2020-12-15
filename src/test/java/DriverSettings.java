import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class DriverSettings {

    public static RegistrationPage registrationPage;
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        open("https://account.habr.com/register/");
        registrationPage = new RegistrationPage(driver);
    }
}

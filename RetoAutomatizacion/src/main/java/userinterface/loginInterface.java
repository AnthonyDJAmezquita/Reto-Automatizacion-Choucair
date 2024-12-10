package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

public class loginInterface extends PageObject {

    public static final Target USERNAME = Target.the("username").located(By.xpath("//input[@placeholder='Username']"));
    public static final Target PASSWORD = Target.the("password").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target LOGINBUTTON = Target.the("loginbutton").located(By.xpath("//button[@type='submit']"));
}

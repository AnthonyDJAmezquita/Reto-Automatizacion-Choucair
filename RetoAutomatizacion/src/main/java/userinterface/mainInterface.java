package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class mainInterface extends PageObject {
    public static final Target DASHBOARD = Target.the("Dashboard").located(By.xpath("//h6[text()='Dashboard']"));
}
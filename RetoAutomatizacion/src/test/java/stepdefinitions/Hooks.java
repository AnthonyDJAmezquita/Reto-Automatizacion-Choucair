package stepdefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before
    public void setTheStage() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Anthony");
    }
}

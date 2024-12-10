package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.loginInterface;

public class openBrowserTask implements Task {

    private loginInterface loginInterface;

    public static openBrowserTask urlApp() {
        return Tasks.instrumented(openBrowserTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginInterface));
    }
}
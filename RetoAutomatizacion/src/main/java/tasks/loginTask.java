package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.loginInterface;

public class loginTask implements Task {

    public static loginTask loginAttempt() {
        return Tasks.instrumented(loginTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Admin").into(userinterface.loginInterface.USERNAME));
        actor.attemptsTo(Enter.theValue("admin123").into(userinterface.loginInterface.PASSWORD));
        actor.attemptsTo(Click.on(userinterface.loginInterface.LOGINBUTTON));
    }
}

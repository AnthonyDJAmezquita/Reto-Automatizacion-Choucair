package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.recruitmentInterfaceFM;

public class recruitmentTaskMenu implements Task {

    public static recruitmentTaskMenu recruitmentAttempt() {
        return Tasks.instrumented(recruitmentTaskMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(recruitmentInterfaceFM.RECRUITMENT));
        actor.attemptsTo(Click.on(recruitmentInterfaceFM.ADD));
    }

}


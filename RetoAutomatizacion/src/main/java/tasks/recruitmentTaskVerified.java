package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class recruitmentTaskVerified implements Task {

    public static recruitmentTaskVerified recruitmentAttempt() {
        return Tasks.instrumented(recruitmentTaskVerified.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(userinterface.recruitmentInterfaceV.CANDIDATES_PAGE));
        actor.attemptsTo(Click.on(userinterface.recruitmentInterfaceV.DATA_SORTING_LIST));
        actor.attemptsTo(Click.on(userinterface.recruitmentInterfaceV.DATA_SORTING_OPT));
    }
}


package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import userinterface.recruitmentInterfaceFM;

import java.nio.file.Paths;

public class recruitmentTaskFill implements Task {

    private final String projectPath = System.getProperty("user.dir");

    public static recruitmentTaskFill recruitmentAttempt() {
        return Tasks.instrumented(recruitmentTaskFill.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Oscar").into(recruitmentInterfaceFM.FIRST_NAME));
        actor.attemptsTo(Enter.theValue("Andres").into(recruitmentInterfaceFM.MIDDLE_NAME));
        actor.attemptsTo(Enter.theValue("Roa").into(recruitmentInterfaceFM.LASTNAME));
        actor.attemptsTo(Click.on(recruitmentInterfaceFM.VACANCY_LIST));
        actor.attemptsTo(Click.on(recruitmentInterfaceFM.VACANCY_OPT));
        actor.attemptsTo(Enter.theValue("oscarandres@gmail.com").into(recruitmentInterfaceFM.EMAIL));
        actor.attemptsTo(Enter.theValue("453465464347").into(recruitmentInterfaceFM.CONTACT_NUMBER));
        actor.attemptsTo(Upload.theFile(Paths.get(projectPath+"\\Resume_CV\\Prueba.txt")).to(recruitmentInterfaceFM.BROWSE_FILE_INPUT));
        actor.attemptsTo(Click.on(recruitmentInterfaceFM.SAVE));
    }

}


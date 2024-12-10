package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.mainInterface;

public class verifyLogin implements Question {
    public static verifyLogin verifyLogin() {
        return new verifyLogin();
    }
    @Override
    public Object answeredBy(Actor actor){
        return actor.asksFor(Text.of(mainInterface.DASHBOARD));
    }
}

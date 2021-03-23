package co.com.choucair.certification.projectnewuser.tasks;

import co.com.choucair.certification.projectnewuser.userinterface.NewUserUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private NewUserUtestPage newUserUtestPage;
    public static OpenUp thePage() {
            return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(newUserUtestPage));

    }
}

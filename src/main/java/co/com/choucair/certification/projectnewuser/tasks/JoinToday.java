package co.com.choucair.certification.projectnewuser.tasks;

import co.com.choucair.certification.projectnewuser.userinterface.NewUserUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinToday implements Task {
    public static JoinToday onThePage() {
      return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NewUserUtestPage.JOIN_BUTTON),
        Enter.theValue("Erick").into(NewUserUtestPage.INPUT_NAME),
        Enter.theValue("Martinez").into(NewUserUtestPage.INPUT_LASTNAME),
        Enter.theValue("erick9305@gmail.com").into(NewUserUtestPage.INPUT_EMAIL),
        Click.on(NewUserUtestPage.INPUT_MONTH), Click.on(NewUserUtestPage.INPUT_DAY),
                Click.on(NewUserUtestPage.INPUT_YEAR), Click.on(NewUserUtestPage.NEXT_BUTTON),
        Enter.theValue("Panama").into(NewUserUtestPage.INPUT_CITY),
        Enter.theValue("507").into(NewUserUtestPage.INPUT_ZIP),
        Click.on(NewUserUtestPage.INPUT_COUNTRY),
        Click.on(NewUserUtestPage.NEXT_BUTTONDEVICES),
        Click.on(NewUserUtestPage.INPUT_COMPUTER)


                );
    }
}

package com.choucairtesting.lonatel.utest.tasks;

import com.choucairtesting.lonatel.utest.userinterfaces.UtestCreateSecion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateSecion implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String monthBirth;
    private String dayBirth;
    private String yearBirth;
    private String city;
    private String zip;
    private String country;
    private String computer;
    private String osVersion;
    private String osLanguage;
    private String password;

    public CreateSecion(String firstName, String lastName, String email, String monthBirth, String dayBirth, String yearBirth, String city, String zip, String country, String computer, String osVersion, String osLanguage, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.yearBirth = yearBirth;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.computer = computer;
        this.osVersion = osVersion;
        this.osLanguage = osLanguage;
        this.password = password;
    }

    public static CreateSecion fillForm(String firstName, String lastName, String email, String monthBirth, String dayBirth,
                                        String yearBirth, String city, String zip, String country, String computer, String osVersion, String osLanguage, String password) {
        return Tasks.instrumented(CreateSecion.class,  firstName,  lastName,  email,  monthBirth,  dayBirth,  yearBirth,  city,  zip,  country,  computer,  osVersion,  osLanguage,  password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestCreateSecion.JOIN_BUTTON),
                Enter.theValue(firstName).into(UtestCreateSecion.FIRSTNAME_INPUT),
                Enter.theValue(lastName).into(UtestCreateSecion.LASTNAME_INPUT),
                Enter.theValue(email).into(UtestCreateSecion.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(monthBirth).from(UtestCreateSecion.MONTH_SELECT),
                SelectFromOptions.byVisibleText(dayBirth).from(UtestCreateSecion.DAY_SELECT),
                SelectFromOptions.byVisibleText(yearBirth).from(UtestCreateSecion.YEAR_SELECT),
                Click.on(UtestCreateSecion.LOCATION_BUTTON),
                Enter.theValue(city).into(UtestCreateSecion.CITY_INPUT),
                Enter.theValue(zip).into(UtestCreateSecion.ZIP_INPUT),
                Click.on(UtestCreateSecion.COUNTRY_SELECT),
                Enter.theValue(country).into(UtestCreateSecion.COUNTRY_INPUT),
                Click.on(UtestCreateSecion.DEVICES_BUTTON),
                Click.on(UtestCreateSecion.COMPUTER_SELECT),
                Enter.theValue(computer).into(UtestCreateSecion.COMPUTER_INPUT),
                Click.on(UtestCreateSecion.VERSION_SELECT),
                Enter.theValue(osVersion).into(UtestCreateSecion.VERSION_INPUT),
                Click.on(UtestCreateSecion.LANGUAGE_SELECT),
                Enter.theValue(osLanguage).into(UtestCreateSecion.LANGUAGE_INPUT),
                Click.on(UtestCreateSecion.LASTSTEP_BUTTON),
                Enter.theValue(password).into(UtestCreateSecion.PASSWORD_INPUT),
                Enter.theValue(password).into(UtestCreateSecion.PASSWORD_CONFIRM_INPUT),
                Click.on(UtestCreateSecion.TERM_OF_USE_INPUT),
                Click.on(UtestCreateSecion.PRIVACY_INPUT));
    }
}

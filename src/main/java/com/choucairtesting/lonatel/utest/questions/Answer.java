package com.choucairtesting.lonatel.utest.questions;

import com.choucairtesting.lonatel.utest.userinterfaces.UtestCreateSecion;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameQuestion = Text.of(UtestCreateSecion.COMPLETE_SETUP_BUTTON).viewedBy(actor).asString();
        if (question.equals(nameQuestion)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

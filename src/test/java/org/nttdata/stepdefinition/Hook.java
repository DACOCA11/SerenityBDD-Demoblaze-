package org.nttdata.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import org.nttdata.hook.OpenWeb;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.nttdata.utils.Constants.*;
import static org.nttdata.utils.Time.waiting;


public class Hook {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} abre el sitio web de pruebas")
    public void openWebsite(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.browserURL()

        );

        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheWebPage.title(), Matchers.containsString(TITLE))

        );

    }

}

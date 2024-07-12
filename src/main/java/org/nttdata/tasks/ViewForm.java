package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.nttdata.ui.ShopPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewForm implements Task {

    public static Task viewForm() {

        return instrumented(ViewForm.class);
    }

    @Override
    @Step("{0}Visualización del formulario de compra")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ShopPage.BTN_ORDER, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPage.BTN_ORDER)
        );

    }
}

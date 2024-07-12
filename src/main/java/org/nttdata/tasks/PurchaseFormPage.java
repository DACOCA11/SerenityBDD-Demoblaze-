package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.nttdata.ui.PurchasePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Task {

    public final String name;
    public final String country;
    public final String city;
    public final String card;
    public final String month;
    public final String year;


    public PurchaseFormPage(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    public static Performable withData(String name, String country, String city, String card, String month, String year) {
        return instrumented(PurchaseFormPage.class, name, country, city, card, month, year);
    }


    @Override
    @Step("{0}Se llenado de formulario de compra y finalización de la compra")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(


                WaitUntil.the(PurchasePage.INP_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(PurchasePage.INP_NAME),
                WaitUntil.the(PurchasePage.INP_COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(country).into(PurchasePage.INP_COUNTRY),
                WaitUntil.the(PurchasePage.INP_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PurchasePage.INP_CITY),
                WaitUntil.the(PurchasePage.INP_CARD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(card).into(PurchasePage.INP_CARD),
                WaitUntil.the(PurchasePage.INP_MONTH, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(month).into(PurchasePage.INP_MONTH),
                WaitUntil.the(PurchasePage.INP_YEAR, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(year).into(PurchasePage.INP_YEAR),

                WaitUntil.the(PurchasePage.BTN_PURCHASE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePage.BTN_PURCHASE),
                WaitUntil.the(PurchasePage.BTN_OK, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePage.BTN_OK)


        );

    }
}

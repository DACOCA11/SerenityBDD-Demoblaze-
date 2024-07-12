package org.nttdata.stepdefinition;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.nttdata.tasks.AddProductPage;
import org.nttdata.tasks.PurchaseFormPage;
import org.nttdata.tasks.ViewForm;

import static org.nttdata.utils.Constants.ACTOR;

public class OpenWebStep {

    @Before

    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("selecciono un producto del catalogo")
    public void selectProduct() {

        OnStage.theActorCalled(ACTOR).attemptsTo(AddProductPage.addProductsToCart());

    }

    @And("agrego el producto al carrito")
    public void agregoElProductoAlCarrito() {

    }


    @And("veo al carrito")
    public void viewCart() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ViewForm.viewForm());

    }


    @Cuando("ingreso datos {string} {string} {string} {string} {string} {string}")
    public void ingresoDatos(String name, String country, String city, String card, String month, String year) {
        OnStage.theActorCalled(ACTOR).attemptsTo(PurchaseFormPage.withData(name, country, city, card, month, year));

    }

    @Entonces("selecciono purchase")
    public void Purchase() {
    }
}

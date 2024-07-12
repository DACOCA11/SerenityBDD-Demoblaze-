package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.nttdata.ui.PurchasePage;
import org.nttdata.ui.ShopPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductPage implements Task {
    public static Task addProductsToCart() {
        return instrumented(AddProductPage.class);

    }

    @Override
    @Step("{0} Selección de dos productos al carrito y visualización del carrito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(ShopPage.BTN_PRODUCT1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPage.BTN_PRODUCT1),
                WaitUntil.the(ShopPage.BTN_ADD_PRODUCT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPage.BTN_ADD_PRODUCT),
                WaitUntil.the(ShopPage.BTN_HOME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPage.BTN_HOME),
                WaitUntil.the(ShopPage.BTN_PRODUCT2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPage.BTN_PRODUCT2),
                WaitUntil.the(ShopPage.BTN_ADD_PRODUCT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPage.BTN_ADD_PRODUCT),
                WaitUntil.the(ShopPage.BTN_CART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPage.BTN_CART)


        );

    }
}

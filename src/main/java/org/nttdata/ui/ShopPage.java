package org.nttdata.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPage {


    public static final Target BTN_PRODUCT1 = Target.the("Boton Producto uno").located(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img"));
    public static final Target BTN_ADD_PRODUCT = Target.the("Boton Agregar a carrito").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    public static final Target BTN_HOME = Target.the("Boton Inicio").located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
    public static final Target BTN_PRODUCT2 = Target.the("Boton Producto dos").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img"));

    public static final Target BTN_CART = Target.the("Boton carrito").located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
    public static final Target BTN_ORDER = Target.the("Boton Place Order").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));


}

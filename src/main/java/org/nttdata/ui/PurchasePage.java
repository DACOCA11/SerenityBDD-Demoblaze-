package org.nttdata.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePage {
    public static final Target INP_NAME = Target.the("Input Name").located(By.xpath("//*[@id=\"name\"]"));
    public static final Target INP_COUNTRY = Target.the("Input Country").located(By.xpath("//*[@id=\"country\"]"));
    public static final Target INP_CITY = Target.the("Input City").located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INP_CARD = Target.the("Input CreditCard").located(By.xpath("//*[@id=\"card\"]"));
    public static final Target INP_MONTH = Target.the("Input Month").located(By.xpath("//*[@id=\"month\"]"));
    public static final Target INP_YEAR = Target.the("Input Year").located(By.xpath("//*[@id=\"year\"]"));
    //BUTTONS

    public static final Target BTN_PURCHASE = Target.the("Boton Purchase").located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));

    public static final Target BTN_OK = Target.the("Boton Ok").located(By.xpath("/html/body/div[10]/div[7]/div/button"));


}

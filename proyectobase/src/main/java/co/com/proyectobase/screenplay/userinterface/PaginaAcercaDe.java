package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaAcercaDe extends PageObject {

    public static final Target INFORMACION_CORPORATIVA = Target.the("Click en menu Informacion Corporativa")
            .located(By.xpath("//a[@class='dropdown-toggle']"));
}

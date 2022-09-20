package co.com.proyectobase.screenplay.userinterface;

import co.com.proyectobase.screenplay.util.Constantes;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(Constantes.URL_PAGINA)
public class PaginaInicialBanismo extends PageObject {

    public static final Target ACERCA_DE = Target.the("Click en menu Acerca de nosotros")
            .located(By.xpath("//*[@id=\"menu-top\"]/div/ul[1]/li[4]/a"));

}

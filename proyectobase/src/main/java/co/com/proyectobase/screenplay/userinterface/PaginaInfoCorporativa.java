package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoCorporativa extends PageObject {

    public static final Target SOSTENIBILIDAD = Target.the("Dar Click en  la opcion Sostenibilidad")
            .located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/ul[3]/li[1]/a"));
}

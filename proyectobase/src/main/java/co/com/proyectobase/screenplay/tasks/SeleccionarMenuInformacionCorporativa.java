package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PaginaAcercaDe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarMenuInformacionCorporativa implements Task {

    public static SeleccionarMenuInformacionCorporativa infoCorporativa() {
        return Tasks.instrumented(SeleccionarMenuInformacionCorporativa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaAcercaDe.INFORMACION_CORPORATIVA));
    }
}

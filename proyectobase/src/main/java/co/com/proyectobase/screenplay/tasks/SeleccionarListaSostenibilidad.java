package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PaginaInfoCorporativa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarListaSostenibilidad implements Task {

    public static SeleccionarListaSostenibilidad sostenibilidad() {
        return Tasks.instrumented(SeleccionarListaSostenibilidad.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaInfoCorporativa.SOSTENIBILIDAD));
    }
}

package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PaginaInicialBanismo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaBanismo implements Task {

    private PaginaInicialBanismo paginaInicialBanismo;

    public static AbrirPaginaBanismo banismo() { return Tasks.instrumented(AbrirPaginaBanismo.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicialBanismo),
                Click.on(PaginaInicialBanismo.ACERCA_DE));

    }
}

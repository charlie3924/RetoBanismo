package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.AbrirPaginaBanismo;
import co.com.proyectobase.screenplay.tasks.SeleccionarListaSostenibilidad;
import co.com.proyectobase.screenplay.tasks.SeleccionarMenuInformacionCorporativa;
import co.com.proyectobase.screenplay.util.Constantes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class RetoBanismoStepDefinitions {

    @Given("^Deseo ingresar a la pagina web de Banismo y selecciono el menu Acerca de nosotros$")
    public void deseoIngresarALaPaginaWebDeBanismoYSeleccionoElMenuAcercaDeNosotros() {
        OnStage.theActorCalled(Constantes.ACTOR_NOMBRE).wasAbleTo(AbrirPaginaBanismo.banismo());

    }


    @When("^selecciono la opcion Informacion Corporativa doy click en la opcion Sostenibilidad$")
    public void seleccionoLaOpcionInformacionCorporativaDoyClickEnLaOpcionSostenibilidad() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarMenuInformacionCorporativa.infoCorporativa());
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarListaSostenibilidad.sostenibilidad());
    }

    @When("^selecciono de la lista la opcion Generacion sostenible, descargo la edicion (\\d+) del boletin en formato pdf$")
    public void seleccionoDeLaListaLaOpcionGeneracionSostenibleDescargoLaEdicionDelBoletinEnFormatoPdf(int arg1) {

    }

    @Then("^verifico que el PDF generado sea el correcto\\.$")
    public void verificoQueElPDFGeneradoSeaElCorrecto() {

    }


}

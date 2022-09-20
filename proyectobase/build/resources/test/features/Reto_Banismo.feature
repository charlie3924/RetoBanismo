#Autor: Carlos Alberto Lopez Muriel

Feature: Automatizacion pagina web Banismo
  como usuario quiero ingresar a la pagina web de Banismo para ingresar a la seccion de sostenibilidad
  y poder descargar la edicion # 9 del boletin Generacion sostenible en formato pdf.

  Scenario: Descarga exitosa boletin Generacion sostenible edicion # 9
    Given Deseo ingresar a la pagina web de Banismo y selecciono el menu Acerca de nosotros
    When selecciono la opcion Informacion Corporativa doy click en la opcion Sostenibilidad
    When  selecciono de la lista la opcion Generacion sostenible, descargo la edicion 9 del boletin en formato pdf
    Then verifico que el PDF generado sea el correcto.

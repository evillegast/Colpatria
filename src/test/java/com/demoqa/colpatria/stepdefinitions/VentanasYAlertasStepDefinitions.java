package com.demoqa.colpatria.stepdefinitions;

import com.demoqa.colpatria.steps.VentanasYAlertasStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;


public class VentanasYAlertasStepDefinitions {

    @Steps
    VentanasYAlertasStep ventanasYAlertasStep;

    @Cuando("^ingresa al link de alerts y frame$")
    public void ingresaAlLinkDeAlertsYFrame() {

        ventanasYAlertasStep.btnWindows();
        ventanasYAlertasStep.btnAlerts();
        ventanasYAlertasStep.btnAlerts2();



    }

    @Entonces("^puede ver las ventanas de alertas$")
    public void puedeVerLasVentanasDeAlertas() {

        ventanasYAlertasStep.btnAlertButton1();
        ventanasYAlertasStep.btnAlertButton2();
        ventanasYAlertasStep.btnAlertButton3();
        ventanasYAlertasStep.btnAlertButton4();

    }


}

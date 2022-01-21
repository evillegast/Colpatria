package com.demoqa.colpatria.stepdefinitions;


import com.demoqa.colpatria.pageobjects.DemoQaPaginaPpalPageObject;
import com.demoqa.colpatria.pageobjects.SeleccionarFechaPaginaPpal;
import com.demoqa.colpatria.steps.BorrarFormularioStep;
import com.demoqa.colpatria.steps.PaginaPpalStep;
import com.demoqa.colpatria.steps.RegistrarFormularioStep;
import com.demoqa.colpatria.steps.SeleccionarFechaStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class SeleccionFechaStepDefinitions {

    @Steps
    SeleccionarFechaStep seleccionarFechaStep;
    @Steps
    SeleccionarFechaPaginaPpal seleccionarFechaPaginaPpal;


    @Cuando("^ingresa en el link widgets$")
    public void ingresa_en_el_link_widgets() {

        seleccionarFechaStep.botonWidgets();
        seleccionarFechaStep.botonDataPicker();

    }


    @Entonces("^puedo ingresar fecha y hora$")
    public void puedo_ingresar_fecha_y_hora() throws IOException {

        seleccionarFechaStep.txtTexBox();
        seleccionarFechaStep.txtTexBoxDate();


    }

}

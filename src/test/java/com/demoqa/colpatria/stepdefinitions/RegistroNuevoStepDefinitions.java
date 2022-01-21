package com.demoqa.colpatria.stepdefinitions;

import com.demoqa.colpatria.steps.BorrarFormularioStep;
import com.demoqa.colpatria.steps.PaginaPpalStep;
import com.demoqa.colpatria.steps.RegistrarFormularioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;


public class RegistroNuevoStepDefinitions {
    @Steps
    PaginaPpalStep paginaPpalStep;
    @Steps
    RegistrarFormularioStep registrarFormularioStep;
    @Steps
    BorrarFormularioStep borrarFormularioStep;

    @Dado("^que el usuario se encuentre en la página demo QA$")
    public void queElUsuarioSeEncuentreEnLaPáginaDemoQA() {
        paginaPpalStep.openBrowser();


    }


    @Cuando("^ingresa los datos en el formulario$")
    public void ingresaLosDatosEnElFormulario() throws IOException {
        registrarFormularioStep.clicEnAdd();
        registrarFormularioStep.ingresarDatosFormulario();




    }

    @Entonces("^puede ver el usuario nuevo creado$")
    public void puedeVerElUsuarioNuevoCreado() {
        registrarFormularioStep.validarUsuario();
        borrarFormularioStep.clicBotonBorrar();




    }


}

package com.demoqa.colpatria.steps;

import com.demoqa.colpatria.pageobjects.BorrarFormularioPaginaPpal;
import net.thucydides.core.annotations.Step;

public class BorrarFormularioStep {


    BorrarFormularioPaginaPpal borrarFormularioPaginaPpal;

    @Step

    public void clicBotonBorrar(){

        borrarFormularioPaginaPpal.getDriver().findElement(borrarFormularioPaginaPpal.getBtnDelete()).click();
    }



}

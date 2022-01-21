package com.demoqa.colpatria.steps;

import com.demoqa.colpatria.pageobjects.DemoQaPaginaPpalPageObject;
import com.demoqa.colpatria.pageobjects.RegistrarFormularioPaginaPpal;
import com.demoqa.colpatria.utils.ExcelDatos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;


public class RegistrarFormularioStep {

    DemoQaPaginaPpalPageObject demoQaPaginaPpalPageObject = new DemoQaPaginaPpalPageObject();
    RegistrarFormularioPaginaPpal registrarFormularioPaginaPpal;
    ExcelDatos excelDatos = new ExcelDatos();
    private static final String NOMBRE_EXCEL="Datos.xlsx";
    private static final  String NOMBRE_HOJA="Datos";


    @Step
    public void clicEnAdd(){
        demoQaPaginaPpalPageObject.getDriver().findElement(demoQaPaginaPpalPageObject.getBtnAddNew()).click();
    }
    @Step
    public void ingresarDatosFormulario() throws IOException {
        registrarFormularioPaginaPpal.getDriver().findElement(registrarFormularioPaginaPpal.getTxtTexBoxFirtsName()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1,  0));
        registrarFormularioPaginaPpal.getDriver().findElement(registrarFormularioPaginaPpal.getTxtTexBoxLastName()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 1));
        registrarFormularioPaginaPpal.getDriver().findElement(registrarFormularioPaginaPpal.getTxtTexBoxEmail()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 2));
        registrarFormularioPaginaPpal.getDriver().findElement(registrarFormularioPaginaPpal.getTxtTexBoxAge()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 3));
        registrarFormularioPaginaPpal.getDriver().findElement(registrarFormularioPaginaPpal.getTxtTexBoxSalary()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 4));
        registrarFormularioPaginaPpal.getDriver().findElement(registrarFormularioPaginaPpal.getTxtTextBoxDeparment()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 5));
        registrarFormularioPaginaPpal.getDriver().findElement(registrarFormularioPaginaPpal.getBtnSubmit()).click();



    }
    @Step
    public  void validarUsuario(){
        Assert.assertThat(registrarFormularioPaginaPpal.getDriver().findElement(registrarFormularioPaginaPpal.getTxtNombre()).isDisplayed(), Matchers.is(true));
    }



}

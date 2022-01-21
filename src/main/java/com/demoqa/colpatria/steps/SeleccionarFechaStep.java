package com.demoqa.colpatria.steps;

import com.demoqa.colpatria.pageobjects.DemoQaPaginaPpalPageObject;
import com.demoqa.colpatria.pageobjects.SeleccionarFechaPaginaPpal;
import com.demoqa.colpatria.utils.ExcelDatos;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class SeleccionarFechaStep {

    DemoQaPaginaPpalPageObject demoQaPaginaPpalPageObject;
    SeleccionarFechaPaginaPpal seleccionarFechaPaginaPpal;
    ExcelDatos excelDatos = new ExcelDatos();
    private static final String NOMBRE_EXCEL="Datos.xlsx";
    private static final  String NOMBRE_HOJA="Datos";


    @Step
    public void botonWidgets (){

        JavascriptExecutor jse = (JavascriptExecutor)seleccionarFechaPaginaPpal.getDriver();
        WebElement element = seleccionarFechaPaginaPpal.getDriver().findElement(seleccionarFechaPaginaPpal.getBtnWidgets());
        jse.executeScript("arguments[0].scrollIntoView()", element);
        seleccionarFechaPaginaPpal.getDriver().findElement(seleccionarFechaPaginaPpal.getBtnWidgets()).click();

    }
    @Step
    public void botonDataPicker(){

        JavascriptExecutor jse = (JavascriptExecutor)seleccionarFechaPaginaPpal.getDriver();
        WebElement element = seleccionarFechaPaginaPpal.getDriver().findElement(seleccionarFechaPaginaPpal.getBtnDataPicker());
        jse.executeScript("arguments[0].scrollIntoView()", element);
        seleccionarFechaPaginaPpal.getDriver().findElement(seleccionarFechaPaginaPpal.getBtnDataPicker()).click();

    }

    @Step
    public void txtTexBox() throws IOException {
        seleccionarFechaPaginaPpal.getDriver().findElement(seleccionarFechaPaginaPpal.getTxtTexBox()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1,  6));


    }

    @Step
    public void txtTexBoxDate() throws IOException {
        seleccionarFechaPaginaPpal.getDriver().findElement(seleccionarFechaPaginaPpal.getTxtTexBoxDate()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1,  7));

    }
}

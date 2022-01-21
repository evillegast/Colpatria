package com.demoqa.colpatria.steps;

import com.demoqa.colpatria.pageobjects.VentanasYAlertasPaginaPpal;
import com.demoqa.colpatria.utils.EsperaExplicita;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class VentanasYAlertasStep {

    VentanasYAlertasPaginaPpal ventanasYAlertasPaginaPpal;
    EsperaExplicita esperaExplicita = new EsperaExplicita();


    @Step
    public void btnWindows() {

        JavascriptExecutor jse = (JavascriptExecutor) ventanasYAlertasPaginaPpal.getDriver();
        WebElement element = ventanasYAlertasPaginaPpal.getDriver().findElement(ventanasYAlertasPaginaPpal.getBtnWindows());
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

    @Step
    public void btnAlerts() {

        ventanasYAlertasPaginaPpal.getDriver().findElement(ventanasYAlertasPaginaPpal.getBtnAlerts()).click();

    }

    @Step
    public void btnAlerts2() {
        ventanasYAlertasPaginaPpal.getDriver().findElement(ventanasYAlertasPaginaPpal.getBtnAlerts2()).click();

    }

    @Step
    public void btnAlertButton1() {

        ventanasYAlertasPaginaPpal.getDriver().findElement(ventanasYAlertasPaginaPpal.getBtnAlertButton1()).click();
        Alert alert = ventanasYAlertasPaginaPpal.getDriver().switchTo().alert();
        alert.accept();
    }

    @Step
    public void btnAlertButton2() {

        esperaExplicita.esperaExplicitaClick(ventanasYAlertasPaginaPpal.getBtnAlertButton2(), ventanasYAlertasPaginaPpal.getDriver());
        ventanasYAlertasPaginaPpal.getDriver().findElement(ventanasYAlertasPaginaPpal.getBtnAlertButton2()).click();
        esperaExplicita.esperaExplicitaAlerta(ventanasYAlertasPaginaPpal.getDriver());
        Alert alert = ventanasYAlertasPaginaPpal.getDriver().switchTo().alert();
        alert.accept();

    }

    @Step
    public void btnAlertButton3() {

        ventanasYAlertasPaginaPpal.getDriver().findElement(ventanasYAlertasPaginaPpal.getBtnAlertButton3()).click();
        Alert alert = ventanasYAlertasPaginaPpal.getDriver().switchTo().alert();
        alert.accept();
    }


    @Step
    public void btnAlertButton4() {

        ventanasYAlertasPaginaPpal.getDriver().findElement(ventanasYAlertasPaginaPpal.getBtnAlertButton4()).click();
        Alert alert = ventanasYAlertasPaginaPpal.getDriver().switchTo().alert();
        alert.accept();

    }


}

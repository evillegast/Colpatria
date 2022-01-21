package com.demoqa.colpatria.pageobjects;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;



public class VentanasYAlertasPaginaPpal extends PageObject {

 By btnWindows = By.xpath("//div[3]//span[1]//div[1]//div[2]//div[2]//*[name()='svg']");
 By btnAlerts = By.xpath("//span[contains(.,'Alerts, Frame & Windows')]");
 By btnAlerts2 = By.xpath("//div[@class='element-list collapse show']//li[2]");
 By btnAlertButton1 = By.id("alertButton");
 By btnAlertButton2 = By.xpath("//button[@id='timerAlertButton']");
 By btnAlertButton3 = By.xpath("//button[@id='confirmButton']");
 By btnAlertButton4 = By.xpath("//button[@id='promtButton']");


    public By getBtnWindows() {
        return btnWindows;
    }

    public By getBtnAlerts() {
        return btnAlerts;
    }

    public By getBtnAlertButton1() {
        return btnAlertButton1;
    }

    public By getBtnAlertButton2() {
        return btnAlertButton2;
    }

    public By getBtnAlertButton3() {
        return btnAlertButton3;
    }

    public By getBtnAlertButton4() {
        return btnAlertButton4;
    }

    public By getBtnAlerts2() { return btnAlerts2; }
}

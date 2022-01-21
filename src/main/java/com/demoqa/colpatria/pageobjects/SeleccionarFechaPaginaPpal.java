package com.demoqa.colpatria.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeleccionarFechaPaginaPpal  extends PageObject {

    By btnWidgets = By.xpath("//span[contains(.,'Widgets')]");
    By btnDataPicker = By.xpath("//span[normalize-space()='Date Picker']");
    By txtTexBox = By.id("datePickerMonthYearInput");
    By txtTexBoxDate = By.id("dateAndTimePickerInput");


    public By getBtnWidgets() {
        return btnWidgets;
    }

    public By getBtnDataPicker() {
        return btnDataPicker;
    }

    public By getTxtTexBox() {
        return txtTexBox;
    }

    public By getTxtTexBoxDate() {
        return txtTexBoxDate;
    }
}





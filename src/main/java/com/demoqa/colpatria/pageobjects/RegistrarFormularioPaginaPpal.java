package com.demoqa.colpatria.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrarFormularioPaginaPpal extends PageObject {

    By  txtTexBoxFirtsName = By.id("firstName");
    By  txtTexBoxLastName = By.id("lastName");
    By txtTexBoxEmail = By.id("userEmail");
    By txtTexBoxAge = By.id("age");
    By txtTexBoxSalary = By.id("salary");
    By txtTextBoxDeparment = By.id("department");
    By btnSubmit = By.id("submit");
    By txtNombre = By.xpath("//div[contains(text(),'Edison')]");

    public By getTxtTexBoxFirtsName() {
        return txtTexBoxFirtsName;
    }

    public By getTxtTexBoxLastName() {
        return txtTexBoxLastName;
    }

    public By getTxtTexBoxEmail() {
        return txtTexBoxEmail;
    }

    public By getTxtTexBoxAge() {
        return txtTexBoxAge;
    }

    public By getTxtTexBoxSalary() {
        return txtTexBoxSalary;
    }

    public By getTxtTextBoxDeparment() {
        return txtTextBoxDeparment;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }
}

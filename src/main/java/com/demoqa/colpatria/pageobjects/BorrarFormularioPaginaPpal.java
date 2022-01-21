package com.demoqa.colpatria.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BorrarFormularioPaginaPpal extends PageObject {

    By btnDelete = By.id("delete-record-3");

    public By getBtnDelete() {
        return btnDelete;

    }
}

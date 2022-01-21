package com.demoqa.colpatria.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://demoqa.com/webtables")


public class DemoQaPaginaPpalPageObject extends PageObject {


    By btnAddNew = By.id("addNewRecordButton");


    public By getBtnAddNew() {
        return btnAddNew;
    }
}

package com.demoqa.colpatria.steps;

import com.demoqa.colpatria.pageobjects.DemoQaPaginaPpalPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaPpalStep {

    DemoQaPaginaPpalPageObject demoQaPaginaPpalPageObject = new DemoQaPaginaPpalPageObject();

    @Step
    public void openBrowser(){
        demoQaPaginaPpalPageObject.open();
    }

}

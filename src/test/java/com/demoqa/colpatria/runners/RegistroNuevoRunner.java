package com.demoqa.colpatria.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\agregarnuevoregistro\\registronuevo.feature",

        glue = "com.demoqa.colpatria.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = ""
)


public class RegistroNuevoRunner {


}

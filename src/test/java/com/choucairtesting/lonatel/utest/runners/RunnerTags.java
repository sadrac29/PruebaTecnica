package com.choucairtesting.lonatel.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/utest.feature",
        tags = "@scenario1",
        glue = "com.choucairtesting.lonatel.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
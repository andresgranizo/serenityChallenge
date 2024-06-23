package com.example.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"},
   features = "src/test/resources/features",
   glue = {"com.example.steps"}
)
public class CucumberTestSuite {}

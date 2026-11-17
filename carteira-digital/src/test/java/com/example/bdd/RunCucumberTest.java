package com.example.bdd;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
@ConfigurationParameter(key = "cucumber.glue", value = "com.example.bdd")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty,html:target/cucumber.html")
public class RunCucumberTest {
}
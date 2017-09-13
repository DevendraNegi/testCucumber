package org.dev.test.firsttime.testCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/dev/test/firsttime/testCucumber/test.feature", tags = "@Login1")
public class CukeTest {

}

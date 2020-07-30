package BDDPractice29072020;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/Resources/WhoWeAre.feature",tags = "@smoke")
@CucumberOptions(features = "src/test/Resources/WhatWeDo.feature",tags = "@Regression")
public class RunCukesTest {
}

package com.ankur.junit.fitnesse.delete;

import java.util.Properties;

import org.junit.runner.RunWith;

import fitnesse.ContextConfigurator;
import fitnesse.FitNesseContext;
import fitnesse.junit.FitNesseRunner;


@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("FitNesse.SuiteAcceptanceTests.SuiteSlimTests.TestScriptTable")
@FitNesseRunner.FitnesseDir(".")
@FitNesseRunner.OutputDir("./target/fitnesse-results")
public class FitNesseRunnerTest {
	
	Properties properties=new Properties();
	//FitNesseContext context = new ContextConfigurator(properties).makeFitNesseContext();
}
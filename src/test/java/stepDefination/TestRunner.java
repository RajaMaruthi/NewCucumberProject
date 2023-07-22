package stepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature", 
glue= {"stepDefination"},
monochrome = true,
plugin = {"json:target/cucumber.json",
          "html:target/cucumber.html"})
public class TestRunner 
{

	
	
}

package Cucumber;

 
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources")
public class CucumberTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

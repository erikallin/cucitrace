package br.com.softbox.atest_bdd.stepdefs.sub;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:../evidence/output/report_data.json", "html:../evidence/output/"}
        , features = {"../feature/sub_page.feature"}
        , glue = {"classpath:br/com/softbox/atest_bdd/stepdefs/sub"}
)
public class SubTest {
}

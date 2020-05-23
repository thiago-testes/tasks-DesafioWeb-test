package desafioWeb.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/desafioWeb/features/desafioWeb.feature",
		glue = "desafioWeb.stepdefinitions",
		tags = "@automacaoCY0001",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.UNDERSCORE,
		dryRun = false,
		strict = false)

public class RunnerTest {

}

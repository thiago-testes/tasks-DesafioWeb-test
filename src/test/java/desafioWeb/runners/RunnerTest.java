package desafioWeb.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

/*
 * Definição das funcionalidades das Options do Cucumber:
 *
 * plugin -> Possui o plugin "pretty" responsável por exibir o detalhamento da
 * execução do cucumber no console.
 * 
 * features -> Configuração do path onde se encontram as features do projeto.
 * 
 * glue -> Configuração do path onde se encontraa a StepDefinitions do
 * projeto.
 * 
 * tags -> Local onde podemos definir as tags responsáveis por controlar a
 * execução das features e cenários.
 * 
 * monochrome -> Caso o projeto seja executado via linha de comando necessário
 * estar como True, pois essa propriedade estrutura o spool de execução com
 * cores. Caso a execução seja via Eclipse é necessário manter como False.
 * 
 * snippets -> Padroniza a nomenclatura dos métodos gerados para a step
 * definitions. Configurado como CAMELCASE os metodos são criados com o layout
 * "MetodoCenario01", caso não utilizar essa option, os métodos são criados com
 * o layout"Metodo_Cenario_01" (UNDERSCORE)
 * 
 * dryRun -> Por default é False. Caso alterarmos para True, o projeto não irá
 * executar o conteúdo da stepdefinitios, serão executados apenas a estrutura
 * da feature. Necessário para validarmos apenas a geração dos métodos pelo
 * cucumber.
 * 
 * strict -> Por default é false, onde caso alguma assertiva gere erro, será
 * lançado uma "Failure" na execução do cenário. Mas o projeto como o todo não
 * ficará falhado. Se alterado para True, nessas condições o projeto como todo
 * ficará falhado.
 *
 */

@CucumberOptions(
		features = "src/test/java/desafioWeb/features/desafioWeb.feature",
		glue = "desafioWeb.stepdefinitions",
		tags = {"@DesafioWebScenario", "@ProntaExecucao"},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.UNDERSCORE,
		dryRun = true,
		strict = false)

public class RunnerTest {

}

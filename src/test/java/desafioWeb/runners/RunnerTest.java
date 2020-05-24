package desafioWeb.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

/*
 * Defini��o das funcionalidades das Options do Cucumber:
 *
 * plugin -> Possui o plugin "pretty" respons�vel por exibir o detalhamento da
 * execu��o do cucumber no console.
 * 
 * features -> Configura��o do path onde se encontram as features do projeto.
 * 
 * glue -> Configura��o do path onde se encontraa a StepDefinitions do
 * projeto.
 * 
 * tags -> Local onde podemos definir as tags respons�veis por controlar a
 * execu��o das features e cen�rios.
 * 
 * monochrome -> Caso o projeto seja executado via linha de comando necess�rio
 * estar como True, pois essa propriedade estrutura o spool de execu��o com
 * cores. Caso a execu��o seja via Eclipse � necess�rio manter como False.
 * 
 * snippets -> Padroniza a nomenclatura dos m�todos gerados para a step
 * definitions. Configurado como CAMELCASE os metodos s�o criados com o layout
 * "MetodoCenario01", caso n�o utilizar essa option, os m�todos s�o criados com
 * o layout"Metodo_Cenario_01" (UNDERSCORE)
 * 
 * dryRun -> Por default � False. Caso alterarmos para True, o projeto n�o ir�
 * executar o conte�do da stepdefinitios, ser�o executados apenas a estrutura
 * da feature. Necess�rio para validarmos apenas a gera��o dos m�todos pelo
 * cucumber.
 * 
 * strict -> Por default � false, onde caso alguma assertiva gere erro, ser�
 * lan�ado uma "Failure" na execu��o do cen�rio. Mas o projeto como o todo n�o
 * ficar� falhado. Se alterado para True, nessas condi��es o projeto como todo
 * ficar� falhado.
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

package desafioWeb.stepdefinitions;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import desafioWeb.core.BrowserConfig;
import desafioWeb.utils.GeneralFunctions;
import desafioWeb.utils.Screenshot;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesafioWeb_StepDefinitions {

	private WebDriver driver;

	@Before
	@Given("que estou na tela principal do site")
	public void que_estou_na_tela_principal_do_site() {

		try {

			// Navegando at� a pagina principal do site Submarino
			driver = BrowserConfig.createChrome();

		} catch (Exception e) {
			Assert.fail("Erro ao tentar navegar at� a pagina principal do site Submarino. Motivo: \" + e");
		}
	}

	@When("realizo uma busca por um tipo de produto")
	public void realizo_uma_busca_por_um_tipo_de_produto() {

		try {

			// Inserindo um produto no campo de pesquisa
			driver.findElement(By.id("h_search-input")).sendKeys("pen drive");

			// Tirando print da pesquisa do produto
			Screenshot.takeScreenshot(driver);

		} catch (Exception e) {
			Assert.fail("Erro ao inserir um tipo de produto no campo de pesquisa. Motivo: \" + e");
		}
	}

	@When("clico na lupa para iniciar a pesquisa")
	public void clico_na_lupa_para_iniciar_a_pesquisa() {

		try {

			// Clicando na lupa para efetuar a busca pelo produto
			driver.findElement(By.id("h_search-btn")).click();

		} catch (Exception e) {
			Assert.fail("Erro ao clicar na lupa para efetuar a busca pelo produto. Motivo: \" + e");
		}
	}

	@When("valido o retorno da busca do produto")
	public void valido_o_retorno_da_busca_do_produto() {

		try {

			// Validando que o produto pesquisado foi retornado na p�gina
			String texto = driver.findElement(By.xpath("//h1[@class='h1 page-title']")).getText();
			Assert.assertEquals("pen drive", texto);

			// Tirando print do retorno da pesquisa do produto
			Screenshot.takeScreenshot(driver);

		} catch (Exception e) {
			Assert.fail("Erro ao validar o retorno do produto pesquisado na p�gina. Motivo: \" + e");
		}
	}

	@Then("escolho um produto na lista")
	public void escolho_um_produto_na_lista() {

		try {

			// Clicando no produto escolhido na lista
			driver.findElement(By.xpath("//h2[@class='TitleUI-bwhjk3-15 khKJTM TitleH2-sc-1wh9e1x-1 fINzxm']")).click();

			// Tirando print do produto escolhido na lista
			Screenshot.takeScreenshot(driver);

		} catch (Exception e) {
			Assert.fail("Erro ao clicar no produto escolhido na lista. Motivo: \" + e");
		}
	}

	@Then("clico no botao Comprar do produto")
	public void clico_no_botao_Comprar_do_produto() {

		try {

			// Clicando no bot�o 'Comprar' do produto
			driver.findElement(By.id("btn-buy")).click();

			// Tirando print do bot�o 'Comprar' na p�gina do produto
			Screenshot.takeScreenshot(driver);

		} catch (Exception e) {
			Assert.fail("Erro ao tentar clicar no bot�o 'Comprar' do produto. Motivo: \" + e");
		}
	}

	@Then("clico no botao Continuar da tela garantia estendida")
	public void clico_no_botao_Continuar_da_tela_garantia_estendida() {

		try {

			// Espera fixa para aguardar o carregamento dos elementos na p�gina
			GeneralFunctions.wait(2000);

			// Clicando no bot�o 'Continuar' da p�gina de Garantia Estendida
			driver.findElement(By.id("btn-continue")).click();

			// Tirando print do bot�o 'Continuar' na p�gina Garantia Estendida
			Screenshot.takeScreenshot(driver);

		} catch (Exception e) {
			Assert.fail("Erro ao tentar clicar no bot�o 'Continuar' na p�gina Garantia Estendida. Motivo: \" + e");
		}
	}

	@Then("valido o produto no meu carrinho")
	public void valido_o_produto_no_meu_carrinho() {

		try {

			// Validando a se��o da p�gina 'Meu Carrinho'
			String paginaMeuCarrinho = driver.findElement(By.xpath("//h2[@class='page-title col-xs-7']")).getText();
			Assert.assertEquals("Meu carrinho", paginaMeuCarrinho);

			// Validando que o produto se encontra inserido na p�gina 'Meu Carrinho'
			String produtoEscolhido = driver.findElement(By.linkText("Pen Drive 32Gb Sandisk Cruzer Blade")).getText();
			Assert.assertEquals("Pen Drive 32Gb Sandisk Cruzer Blade", produtoEscolhido);

			// Tirando print do produto na p�gina 'Meu Carrinho'
			Screenshot.takeScreenshot(driver);

		} catch (Exception e) {
			Assert.fail("Erro ao tentar validar o produto na p�gina 'Meu Carrinho'. Motivo: \" + e");
		}

	}

	@Then("seleciono garantia estendida doze meses")
	public void seleciono_garantia_estendida_doze_meses() {

		try {

			// Clicando para selecionar garantia estendida doze meses
			driver.findElement(By.xpath(
					"//div[@class='service-options__ViewOptionsDesktop-sc-6v3x4r-3 cYVePr ViewUI-sc-1ijittn-6 iXIDWU']"))
					.click();

			// Tirando print ao selecionar garantia estendida doze meses
			Screenshot.takeScreenshot(driver);

		} catch (Exception e) {
			Assert.fail("Erro ao tentar selecionar garantia estendida doze meses. Motivo: \" + e");
		}

	}

	@Then("valido a garantia estendida no meu carrinho")
	public void valido_a_garantia_estendida_no_meu_carrinho() {

		try {

			// Validando a se��o da p�gina 'Meu Carrinho'
			String paginaMeuCarrinho = driver.findElement(By.xpath("//h2[@class='page-title col-xs-7']")).getText();
			Assert.assertEquals("Meu carrinho", paginaMeuCarrinho);

			// Validando a garantia estendida no 'Meu Carrinho'
			String garantiaEscolhida = driver.findElement(By.className("extended-warranty")).getText();
			Assert.assertEquals("+ 1 ano protegido", garantiaEscolhida);

			// Tirando print da garantia estendida no 'Meu Carrinho'
			Screenshot.takeScreenshot(driver);

		} catch (Exception e) {
			Assert.fail("Erro ao tentar validar a garantia estendida na p�gina 'Meu Carrinho'. Motivo: \" + e");
		}
	}

	@After(order = 0)
	public void tearDown() {
		driver.quit();
	}
}

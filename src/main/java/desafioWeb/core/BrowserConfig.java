package desafioWeb.core;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {

	// Instancias do WEbDriver utilizado nos fluxos Selenium
	private static WebDriver webDriverInstance;

	public static WebDriver createChrome() {
		// Abrindo o navegador
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\thiago.f.a.santos\\eclipse-workspace\\DesafioWeb\\src\\test\\resources\\drivers\\chromedriver_win32_80_0_3987_16.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Maximizando a página Submarino
		driver.manage().window().maximize();

		// Navegando para a página Submarino
		driver.get("https://www.submarino.com.br/");

		return driver;
	}

	// Metodo para matar os processos do chrome
	public static void closeChrome() {
		try {

			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("cmd.exe", "/c", "taskkill /F /IM chrome.exe");
			processBuilder.start();

		} catch (IOException e) {
			System.out.println("Erro ao fechar o Chrome: " + e);
		}
	}

	// Método responsável por realizar o kill na instância do WebDriver
	public static void killWebDriverProcess() {
		try {

			if (webDriverInstance != null) {
				webDriverInstance.quit();
				webDriverInstance = null;
			}

		} catch (Exception e) {
			System.out.println("Erro ao realizar o kill na instância do WebDriver: " + e);
		}
	}
}

package desafioWeb.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void takeScreenshot(WebDriver driver) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,
					new File("C:\\Users\\thiago.f.a.santos\\eclipse-workspace\\DesafioWeb\\target\\screenshot\\"
							+ Generator.dataHoraParaArquivo() + ".png"));
		} catch (Exception e) {
			System.out.println("Houve problema ao copiar o arquivo para a pasta: " + e.getMessage());
		}
	}

}

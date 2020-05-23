package desafioWeb.utils;

public class GeneralFunctions {

	/*
	 * Função: wait(int milisegundos) Realiza uma espera em milisegundos.
	 * 
	 * Parametros:
	 * 
	 * int milisegundos -> Receberá um valor inteiro que será utilizado como
	 * milisegundos
	 * 
	 */
	public static void wait(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			System.out.println("Erro ao executar o comando de Wait fixo: " + e);
		}
	}
}

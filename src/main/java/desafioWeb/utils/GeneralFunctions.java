package desafioWeb.utils;

public class GeneralFunctions {

	/*
	 * Fun��o: wait(int milisegundos) Realiza uma espera em milisegundos.
	 * 
	 * Parametros:
	 * 
	 * int milisegundos -> Receber� um valor inteiro que ser� utilizado como
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

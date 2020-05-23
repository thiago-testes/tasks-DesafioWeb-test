package desafioWeb.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {

	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("dd-MM-YYYY_HH.mm.ss").format(ts);
	}
}

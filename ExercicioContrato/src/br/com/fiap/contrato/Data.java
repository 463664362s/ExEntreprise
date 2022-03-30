package br.com.fiap.contrato;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Data {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1995);
		c.set(Calendar.MONTH, Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 20);

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

		String date1 = format1.format(c);   
		
		System.out.println("Data/Hora atual: "+c.getTime());
;
	}

}
package ru.mail.dimapilot;

import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ReadYahoo {

	public static void readAnswer(String file) {

		try (FileWriter writer = new FileWriter(file)) {

			int c;
			URL url = new URL("http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20"
					+ "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys");
			URLConnection urlc = url.openConnection();

			long l = urlc.getContentLengthLong();
			if (l != 0) {
				System.out.println();
				InputStream ins = urlc.getInputStream();
				for (; (c = ins.read()) != -1;) {

					writer.write((char) c);

				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

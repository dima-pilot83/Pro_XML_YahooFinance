package ru.mail.dimapilot;

import java.io.IOException;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws SAXException, IOException {

		ReadYahoo.readAnswer("1.xml");
		FormatXML.format("1.xml");

	}

}

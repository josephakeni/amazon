package com.sapient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Send_XML_Post_Request {
	public static void main(String[] args) {
		try {
			String url = "http://www.holidaywebservice.com/HolidayService_v2/HolidayService2.asmx?op=GetCountriesAvailable";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
			String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?> "
					+ "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\"> "
					+ " <soap12:Body><GetCountriesAvailable xmlns=\"http://www.holidaywebservice.com/HolidayService_v2/\" />"
					+ " </soap12:Body> " + "</soap12:Envelope>";
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(xml);
			wr.flush();
			wr.close();
			String responseStatus = con.getResponseMessage();
			 int responseCode = con.getResponseCode();
			System.out.println(responseStatus);
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println("response:" + response.toString());

			/*
			 * Below will extract the values from the XML response This is using the DOM
			 * parser
			 */
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new InputSource(new StringReader(response.toString())));
			NodeList errNodes = doc.getElementsByTagName("GetCountriesAvailableResult");
			if (errNodes.getLength() > 0) {
				Element err = (Element) errNodes.item(0);
				System.out.println("CountryCode -" + err.getElementsByTagName("CountryCode").item(0).getTextContent());
				System.out.println("Code -" + err.getElementsByTagName("Code").item(0).getTextContent());
				System.out.println("status -" + responseCode);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

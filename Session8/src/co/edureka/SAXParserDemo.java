package co.edureka;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class Handler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println(">> Document Parsing Started");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch, start, length);
		System.out.print(data);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println(">> Document Parsing Ended");
	}
	
}

public class SAXParserDemo {

	public static void main(String[] args) {
		
		try{
		
			File file = new File("/Users/ishantkumar/Downloads/yourstudents.xml");
			FileInputStream stream = new FileInputStream(file);
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			Handler handler = new Handler();
			
			parser.parse(stream, handler);
			
		}catch(Exception e){
			System.out.println(">> Some Exception: "+e);
		}

	}

}

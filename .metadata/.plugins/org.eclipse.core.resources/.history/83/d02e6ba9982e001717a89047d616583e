package xml;

import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//Reading/Parsing XML file using SAX Parser
//SAX cannot be used to update the XML
//it is usually used for large XML files
class MyHandler extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("Document starts..");
			
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		System.out.print("<"+qName+">");
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		System.out.print(new String(ch, start, length));
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
	
		System.out.println("</"+qName+">");
	}
	
	@Override
	public void endDocument() throws SAXException {
		
		System.out.println("Document ends..");
	}
}

public class XML_ParseXMLSAX{
	
	public static void main(String[] args) {
		
		try{
			
			FileInputStream fis = new FileInputStream("C:\\Temp\\catalog2.xml");
			MyHandler handler = new MyHandler();
			
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser parser = spf.newSAXParser();
			
			parser.parse(fis, handler);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
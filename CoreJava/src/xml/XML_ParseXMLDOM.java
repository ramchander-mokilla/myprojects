package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//Reading/Parsing an XML using DOM parser
class ParseXMLFileWithDOM{
	
	void readFromXMLFile()
	{
		try
		{
			File file = new File("C:\\Temp\\catalog1.xml");
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			Document doc = db.parse(file);
			
			System.out.println("XML File Parsed...");
			System.out.println("Root element is  "+doc.getDocumentElement().getNodeName()+"\n");
		
			NodeList nodeList = doc.getElementsByTagName("book");
			
			for(int i=0; i<nodeList.getLength(); i++)
			{
				Node node = nodeList.item(i);
				
				System.out.println("Element "+(i+1)+" Name: "+node.getNodeName());
				
				if(node.getNodeType() == Node.ELEMENT_NODE)
				{
					Element element = (Element) node;
					System.out.println("Author: "+element.getElementsByTagName("author").item(0).getTextContent());
					System.out.println("Title: "+element.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("Genre: "+element.getElementsByTagName("genre").item(0).getTextContent());
					System.out.println("price: $"+element.getElementsByTagName("price").item(0).getTextContent());
					System.out.println("Publish Date: "+element.getElementsByTagName("publish_date").item(0).getTextContent());
					System.out.println("Description: "+element.getElementsByTagName("description").item(0).getTextContent()+"\n");
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
}

public class XML_ParseXMLDOM {

	public static void main(String[] args) {
		
		ParseXMLFileWithDOM pxf = new ParseXMLFileWithDOM();
		pxf.readFromXMLFile();
	}
}

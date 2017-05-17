package xml;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class WriteToXML{
	
	void writeInToXMLFile()
	{
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			
			Element root = doc.createElement("Employees");
			
			Element emp = doc.createElement("Employee");
			
			Element name = doc.createElement("Name");
			Element empID = doc.createElement("EmployeeID");
			Element salary = doc.createElement("Salary");
			
			Text txtEmpID = doc.createTextNode("230");
			Text txtEmpSalary = doc.createTextNode("150000");
			Text txtEmpName = doc.createTextNode("Doug");
			
			empID.appendChild(txtEmpID);
			name.appendChild(txtEmpName);
			salary.appendChild(txtEmpSalary);
			
			emp.appendChild(empID);
			emp.appendChild(name);
			emp.appendChild(salary);
			
			root.appendChild(emp);
			
			doc.appendChild(root);
			
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer tr = tf.newTransformer();
			
			FileOutputStream fos = new FileOutputStream("C:\\Temp\\Employees.xml");
			StreamResult resultDest = new StreamResult(fos);
			DOMSource domSource = new DOMSource(doc);		
			
			tr.transform(domSource, resultDest);
			
			System.out.println("XML File Created");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

public class XML_CreateXMLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WriteToXML wtx = new WriteToXML();
		wtx.writeInToXMLFile();
	}

}
package co.edureka;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

class Student{
	
	// Attributes: Property of Object
	int roll;
	String name;
	String address;
	
	void showStudent(){
		System.out.println("====="+roll+"====");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("=================");
	}
}



public class XMLDemo {
	
	void saveStudentInXML(Student sRef){
		
		try{
			// DOM : Document Object Model to Save data in XML File
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // Create an Empty XML Document
			
			// Tags which we wish to have in our XML file
			Element elmRoot = document.createElement("students");
			Element elmStudent = document.createElement("student");
			Element elmRoll = document.createElement("roll");
			Element elmName = document.createElement("name");
			Element elmAddress = document.createElement("address");
			
			// Data to be inserted in Tags of XML File
			Text txtRoll = document.createTextNode(String.valueOf(sRef.roll));
			Text txtName = document.createTextNode(sRef.name);
			Text txtAddress = document.createTextNode(sRef.address);
			
			// Put the data in tags
			elmRoll.appendChild(txtRoll);
			elmName.appendChild(txtName);
			elmAddress.appendChild(txtAddress);
			
			// Put tags in tags
			elmStudent.appendChild(elmRoll);
			elmStudent.appendChild(elmName);
			elmStudent.appendChild(elmAddress);
			
			elmRoot.appendChild(elmStudent);
			
			document.appendChild(elmRoot);
			
			// Generate XML File
			File file = new File("/Users/ishantkumar/Downloads/yourstudents.xml");
			FileOutputStream stream = new FileOutputStream(file);
			StreamResult result = new StreamResult(stream);
			
			DOMSource source = new DOMSource(document);
			
			// Transformer API will convert the source into result
			// DOMSource -> StreamResult		
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			transformer.transform(source, result);
			
			System.out.println(">> XML File Saved with Data !!");
		
		}catch(Exception e){
			System.out.println(">> Some Exception: "+e);
		}
		
	}
	
	void parseXMLFileWithDOM(){
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/yourstudents.xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // Parse XML document
			
			System.out.println(">> Root Element is: "+document.getDocumentElement().getNodeName());
			
			NodeList nodes = document.getElementsByTagName("student");
			System.out.println(">> "+nodes.getLength()+" student tags found in "+file.getName());
			
			System.out.println();
			
			ArrayList<Student> students = new ArrayList<Student>();
			
			for( int i=0;i<nodes.getLength();i++){
				Node node = nodes.item(i);
				Element element = (Element)node;
				
				Student s = new Student();
				
				/*
				String strRoll = element.getElementsByTagName("roll").item(0).getTextContent();
				int roll = Integer.parseInt(strRoll); // Convert String to Integer
				String name = element.getElementsByTagName("name").item(0).getTextContent();
				String address = element.getElementsByTagName("address").item(0).getTextContent();
				
				System.out.println(">> "+roll+"\t"+name+"\t"+address);
				*/
				
				// Read from XMl and write data into Student Object
				String strRoll = element.getElementsByTagName("roll").item(0).getTextContent();
				s.roll = Integer.parseInt(strRoll); // Convert String to Integer
				s.name = element.getElementsByTagName("name").item(0).getTextContent();
				s.address = element.getElementsByTagName("address").item(0).getTextContent();
				
				// Add Student Object in ArrayList
				students.add(s);
			}
			System.out.println();
			for(Student stu : students){
				stu.showStudent();
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		s1.address = "Redwood Shores";
		
		XMLDemo xRef = new XMLDemo();
		//xRef.saveStudentInXML(s1);
		xRef.parseXMLFileWithDOM();

	}

}

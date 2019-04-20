package co.edureka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream; // FileOutputStream throws Exception
import java.io.FileReader;
import java.io.FileWriter;

class Student{
	
	// Attributes
	int roll;
	String name;
	String address;
	
	Student(){
		
	}
	
	Student(int roll, String name, String address){
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	String toCSV(){
		return roll+","+name+","+address+"\n";
	}
}

public class FileIO {

	void writeDataInFile(Student sRef){
		
		try {
			
			//File file = new File("edureka_students.csv");
			File file = new File("/Users/ishantkumar/Downloads/edureka_students.csv");
			
			/*
			// Binary Stream : Data flows as bytes | Any Type of File : i.e. Audio, Video, Image, Text
			//FileOutputStream stream = new FileOutputStream(file); 	// data is overwritten
			FileOutputStream stream = new FileOutputStream(file, true); // data is appended
			
			String data = sRef.toCSV(); // We get the data to be written
			
			stream.write(data.getBytes()); // We write data in the form of bytes in the file
			
			stream.close(); // Ensure write operation and then release memory resources
			*/
			
			// Textual Stream : Data flows as characters : Text Files .txt, .csv. .java, .html etc..
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // enable append mode
			
			String data = sRef.toCSV();
			writer.write(data); // We write data in the form of text (String) in the file
			
			writer.close(); 	// Ensure write operation and then release memory resources
			
			System.out.println(">> Data Written in File");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	void readDataFromFile(){
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/edureka_students.csv");
			File file = new File("/Users/ishantkumar/Documents/Edureka/Edureka2019March30/Session7/src/co/edureka/FileIO.java");
			
			// Read data from File in the form of bytes
			/*
			FileInputStream stream = new FileInputStream(file);
			
			// Let us store byte in ch 
			int ch = 0;
			
			ch = stream.read(); // give us the first byte in the file
			//System.out.println((char)ch); // Lets convert into char and print it
			
			while(ch != -1){ // -1 means end of file
				System.out.print((char)ch);
				ch = stream.read(); 
			}
			
			stream.close();
			*/
			
			// Read data from File in the form of characters
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // So that we can read data from file as line by line
			
			int objectCount = 0;
			
			String data = buffer.readLine();
			//System.out.println(data);
			while(data != null){
				System.out.println(data);
				
				if(!data.startsWith("//") && data.contains("new")){
					objectCount++;
				}
				
				data = buffer.readLine();

			}

			System.out.println(">> Objects Found: "+objectCount);
			// HW: Show the name of classes as well for which object it is !! (Perform Source Code analysis for Objects in a Java File)
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		/*
		Student s1 = new Student(301, "Sia", "Redwood Shores");
		Student s2 = new Student(401, "Mike", "Prisitine Magnum");
		
		System.out.println("s1 details: "+s1.toCSV());
		System.out.println("s2 details: "+s2.toCSV());
		*/
		
		FileIO io = new FileIO();
		//io.writeDataInFile(s1);
		//io.writeDataInFile(s2);
		
		io.readDataFromFile();
		
	}

}

package interview.question.serializationdesrialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * When you implementes externalization then it gives more control to the developer which data you want to serialized or not using writeExternal and readExternal
 */
public class ExternlizationDemo {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
	 DebitCard debitCard=new DebitCard(1,"Rupay","omveer singh","567367778549032",123,"00000");
	 System.out.println(debitCard);
	
	 FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\eromv\\eclipse-workspace\\interview.question\\fileExternlization.sre");
	 ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	 objectOutputStream.writeObject(debitCard);
	 objectOutputStream.close();
	 fileOutputStream.close();
	 
		
	//Deserialization: read serialized object from file 
	FileInputStream fileInputStream=new FileInputStream("C:\\\\Users\\\\eromv\\\\eclipse-workspace\\\\interview.question\\\\fileExternlization.sre");
	ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
	DebitCard deserialisedObject=(DebitCard) objectInputStream.readObject();
	System.out.println("deserialised object from file : "+deserialisedObject);
	objectInputStream.close();
	fileInputStream.close();
 }
}

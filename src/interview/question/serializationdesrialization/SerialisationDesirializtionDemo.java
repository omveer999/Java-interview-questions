package interview.question.serializationdesrialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialisationDesirializtionDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Company company=new Company(1,"Beaconcoders","Vaishali Ghaziabad","beaconcoders.com");
		System.out.println("company :"+company);
		
		//Serialization write a object in to file
		FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\eromv\\eclipse-workspace\\interview.question\\file.sre");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(company);
		objectOutputStream.close();
		fileOutputStream.close();
		
		//Deserialization: read serialized object from file 
		FileInputStream fileInputStream=new FileInputStream("C:\\\\Users\\\\eromv\\\\eclipse-workspace\\\\interview.question\\\\file.sre");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		Company deserialisedObject=(Company) objectInputStream.readObject();
		System.out.println("deserialised object from file : "+deserialisedObject);
		objectInputStream.close();
		fileInputStream.close();
		
		/*******************************************
		 * Example of Transient in serialization   *
		 *******************************************/
	
		User user=new User(1,"omveer","123355");
		System.out.println("company :"+user);
		
		//So i don't want to serialize password field of user class then we use transient keyword
		FileOutputStream fileOutputStreamWithTransient=new FileOutputStream("C:\\Users\\eromv\\eclipse-workspace\\interview.question\\fileTransient.sre");
		ObjectOutputStream objectOutputStreamWithTransient=new ObjectOutputStream(fileOutputStreamWithTransient);
		objectOutputStreamWithTransient.writeObject(user);
		objectOutputStreamWithTransient.close();
		fileOutputStreamWithTransient.close();
		
		FileInputStream fileInputStreamWithTransient=new FileInputStream("C:\\Users\\eromv\\eclipse-workspace\\interview.question\\fileTransient.sre");
		ObjectInputStream objectInputStreamWithTransient=new ObjectInputStream(fileInputStreamWithTransient);
		User desrializedUser=(User) objectInputStreamWithTransient.readObject();
		//you can see the user object in which we get password null
		System.out.println("Deserialized user object : "+desrializedUser);
		objectInputStreamWithTransient.close();
		fileInputStreamWithTransient.close();
		
	}

}

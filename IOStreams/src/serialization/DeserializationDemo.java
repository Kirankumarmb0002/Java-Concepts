package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("/java/Javaprograms/IOStreams/Emp.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);

		
		Object obj=ois.readObject();
		System.out.println(obj);
		Employee emp=(Employee) obj;
		
		System.out.println("employee Id:" + emp.id);
		System.out.println("employee Name:" + emp.name);
		System.out.println("employee salary:" + emp.salary);
		System.out.println("employee ssn:" + emp.ssn);
	}

}

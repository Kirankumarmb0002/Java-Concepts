import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputandoutputStreamdemo {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("/java/Javaprograms/IOStreams/myphoto.jpeg");
			fos=new FileOutputStream("/java/Javaprograms/IOStreams/mycopy.jpeg");
			int data;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			System.out.println("File copied");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

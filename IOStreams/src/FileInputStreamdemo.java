import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamdemo {

	public static void main(String args[]) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("/java/Javaprograms/IOStreams/Myfiles.txt");
			System.out.println("opened the file");
			int i;
			while((i=fis.read())!=-1){
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("\n File is closed");
		}
	}
}

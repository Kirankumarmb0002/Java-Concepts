import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Readerandwriter {
	public static void main(String[] args) throws Exception {

		FileReader fr = null;
		FileWriter fw = null;
		

			fr = new FileReader("/java/Javaprograms/IOStreams/Myfiles.txt");
			fw=new FileWriter("/java/Javaprograms/IOStreams/copy.txt");
			
			int i;
			while((i=fr.read())!=-1){
				fw.write(i);
			}
			fr.close();
			fw.close();

	}
}

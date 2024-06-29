import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try(FileReader fr =  new FileReader("/java/Javaprograms/IOStreams/Myfiles.txt");
			BufferedReader bf = new BufferedReader(fr);) {

			String line;
			int countofwords=0;
			while((line=bf.readLine())!=null) {
				StringTokenizer st=new StringTokenizer(line);
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					countofwords++;
				}
			}
			System.out.println("Number of words in the files are :" +countofwords);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

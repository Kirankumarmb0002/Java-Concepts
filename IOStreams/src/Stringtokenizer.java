import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {

		String s = "You are the creator of your own distiny";
		String commastring = "You,are,the,creator,of,your,own,distiny";
		StringTokenizer st=new StringTokenizer(commastring, ",");
				while(st.hasMoreTokens()) {
					System.out.println(st.hasMoreTokens());
					System.out.println(st.nextToken());
					System.out.println(st.hasMoreElements());
				}
	}

}

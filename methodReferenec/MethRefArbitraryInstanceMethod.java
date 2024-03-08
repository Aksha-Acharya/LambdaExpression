package methodReferenec;

import java.util.Arrays;

public class MethRefArbitraryInstanceMethod {

	public static void main(String[] args) {
		
		String s[]= {"A","E","I","O","U","a","e","i","o","u"};
		
		Arrays.sort(s,(s1,s2)->s1.compareToIgnoreCase(s2));
		
		System.out.println(Arrays.asList(s));
		
		Arrays.sort(s, String::compareToIgnoreCase);
		
	}

}

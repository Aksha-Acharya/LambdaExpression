package methodReferenec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethRefConstructor {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		
		Function<List<String>,Set<String>> function= (fruitList) -> new HashSet(fruitList);
		
		System.out.println(function.apply(fruits));
		

		Function<List<String>,Set<String>> function2= HashSet:: new;
		
		System.out.println(function2.apply(fruits));
		
		
		
		

	}

}

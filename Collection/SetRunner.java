import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;

//import java.util.*;


// To get unique value from the list. 1st by order by sorting. 2nd by order of insertion.

public class SetRunner{
	public static void main(String[] args){
		List<Character> characters = List.of('A','Z','B','Z','A','F');
		
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("TreeSet: "+ treeSet);
		
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedHashSet: "+ linkedHashSet);
		
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet: "+ hashSet);
	}
}

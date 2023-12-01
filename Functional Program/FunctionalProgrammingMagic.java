import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Optional;


public class FunctionalProgrammingMagic {

    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        
        return numbers.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
    }

	public static List<Integer> getCubesOfFirstNNumbers(int n) {
        
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        
        return IntStream.range(1,n+1).map(e -> e * e * e).boxed().collect(Collectors.toList());
    }
	
	public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
	
        if(courses == null) {
            return List.of();
        }
        return courses.stream().map(String::length).collect(Collectors.toList());
    }
	
	public static long sumOfSquares(List<Integer> numbers) {
        
        if (numbers == null){
            return 0;
        }
        
        return numbers.stream().mapToLong(n -> n * n).sum();
    }
	
	public static int findMaxEvenNumber(List<Integer> numbers) {
		
        if(numbers == null || numbers.isEmpty()){
            return 0;
        }
		
        Optional<Integer> maxEven = numbers.stream()
                                    .filter(number -> number % 2 == 0)
                                    .max(Integer::compare);
        return maxEven.orElse(0);
    }
	
	public static void printWithFP(List<String> animals){
		
		animals.stream().forEach( e -> System.out.println(e);
	}
	
	public static void printOdd(List<Integer> number){
		
		number.stream().filter(e -> e%2 == 1).forEach(e -> System.out.println(e));
	}
	
	public static void printEven(List<Integer> number){
		
		number.stream().filter(e -> e%2 == 0).forEach(e -> System.out.println(e));
	}
	
	public static int sumOfNumbers(List<Integer> number){
		
		return number.stream().reduce(0, (n1,n2) -> n1 + n2);
	}
}

import java.util.HashMap;
import java.util.Map;

public class MapRunner{
   public static void main(String args[]){
        String str = "a quick big brown fox jump over a lazy dog";

        Map<Character, Integer> charOccurances = new HashMap<>();

        char[] characters = str.toCharArray();

        for(char character:characters){
            Integer count = charOccurances.get(character);

            if(count == null){
                charOccurances.put(character,1);
            }
            else{
                charOccurances.put(character, count + 1);
            }
        }

        System.out.println(charOccurances);

        Map<String, Integer> strOccurances = new HashMap<>();

        String[] words = str.split(" ");
        
        for(String word:words){
            Integer count = strOccurances.get(word);

            if(count == null){
                strOccurances.put(word,1);
            }
            else{
                strOccurances.put(word, count + 1);
            }
        }

        System.out.println(strOccurances);
   } 
}
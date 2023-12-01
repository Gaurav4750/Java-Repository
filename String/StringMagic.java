public class StringMagic {
    
	//check the upper case in the string
	public StringMagic(){
		
	}
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        int upperCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
        }
        return upperCount;
    }
	
	//to find the duplicate character in the string
	public boolean hasConsecutiveDuplicates(String str) {
        
        // TODO: Write your code here
        
        for(int i =0; i<str.length()-1; i++){
           if(str.charAt(i) == str.charAt(i+1)){
               return true;
           }
        }
        return false;
    }
	
	//to find the right most digit in the string
	public int getRightmostDigit(String str) {

        // TODO: Write your code here
        for(int i=str.length()-1; i>=0; i--){
            if(Character.isDigit(str.charAt(i))){
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
    }
	
	//to find the longest string in the sentence
	public String findLongestWord(String sentence) {

        // TODO: Write your code here
        if(sentence == null || sentence.equals("")){
            return "";
        }
        String[] words = sentence.split(" ");
        
        int maxLength = 0;
        String longestWord = "";
        
        for(String word: words){
            if(word.length() > maxLength){
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
        
    }
}

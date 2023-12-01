public class ReversedSentence {

    public static String reverseWordsInSentence(String sentence) {
        
        if(sentence == null){
            return "INVALID";
        }
        
        if(sentence.isEmpty()){
            return "";
        }
        
        String[] words = sentence.split(" ");
        
        StringBuilder reversedSentence = new StringBuilder();
        
        for(String word:words){
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        
         return reversedSentence.toString().trim();
        
    }
	
	public static void main(String args[]){
		String str = "a quick brown fox jump over a lazy dog";
		
		System.out.println(reverseWordsInSentence(str));
	}
}
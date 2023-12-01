public class HexadecimalValidation {

    public String str;

    public HexadecimalValidation(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
    }

    public boolean isHexadecimal() {
        // Write your code here
        if(str == null || str.length() == 0){
            return false;
        }
        
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
                return false;
            }
        }
        return true;
    }


	public static void main(String args[]){
		String str = "Gaurav";
		
		HexadecimalValidation hxv = new HexadecimalValidation(str);
		
		System.out.println(hxv.isHexadecimal());
		
		
		
	}
    
}
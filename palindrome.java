/**
 * palindrome
 *
 * 		returns whether a string is a palindrome
 *
 * 		Nick LEonard
 */
class palindrome {
	
	public static void main(String[] args) {
		// if(iterativePalindrome(args[0]) == true){
		// 	System.out.println("The word " + args[0] + " is a palindrome.");
		// }else{
		// 	System.out.println("The word " + args[0] + " is NOT a palindrome.");
		// }

		if(recursivePalindrome(args[0]).equals("isPal")){
			System.out.println("The word " + args[0] + " is a palindrome.");
		}else{
			System.out.println("The word " + args[0] + " is NOT a palindrome.");
		}
	}
	
	/**
	 * iterativePalindrome
	 *
	 * 		tests whether a given string is a palindrome iteratively
	 *
	 * @param word - the string to be tested
	 * @return returns true if the string is a palindrome
	 */
	public static boolean iterativePalindrome(String word){
		for(int i = 1; i < word.length(); i++){
			if(word.charAt(i - 1) != word.charAt(word.length() - i)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * recursivePalindrome
	 * 
	 *             recursively tests whether a given string is a palindrome
	 * 
	 * @param word - the string to be tested
	 * @return returns "isPal" if the string is a palindrome, returns "isNotPal" if it is not
	 */
	public static String recursivePalindrome(String word){
		if(word.length() < 2){
			return "isPal";
		}

		if(word.charAt(0) == word.charAt(word.length() - 1)){
			return recursivePalindrome(word.substring(1, word.length() - 1));
		}else{
			return "isNotPal";
		}
		
	}
}

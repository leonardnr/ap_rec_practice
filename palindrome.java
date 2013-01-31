/**
 * palindrome
 *
 * 		returns whether a string is a palindrome
 *
 * 		Nick LEonard
 */
class palindrome {
	
	public static void main(String[] args) {
		if(iterativePalindrome(args[0]) == true){
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

	public static void recursivePalindrome(String word){

	}
}
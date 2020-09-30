/**
 * 
 */
package dad.codesignal.intro;

/**
 * @author Ayoze Amaro
 *
 */
public class CheckPalindrome {

	public static boolean checkPalindrome(String inputString) {
	    int largoCadena = inputString.length();
	    
	    for (int i = 0; i < largoCadena/2; i++) {
	        if (inputString.charAt(i) != inputString.charAt(largoCadena-1-i)) {
	            return false;
	        }
	    }
	    return true; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("aabaa"));
	}

}

/**
 * 
 */
package dad.codesignal.intro;

/**
 * @author Ayoze Amaro
 *
 */
public class CenturyFromYear {

	public static int centuryFromYear(int year) {
		return ((year-1)/100) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(centuryFromYear(1805));
	}

}

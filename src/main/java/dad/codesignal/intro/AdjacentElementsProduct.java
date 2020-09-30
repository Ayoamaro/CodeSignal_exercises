/**
 * 
 */
package dad.codesignal.intro;

/**
 * @author Ayoze Amaro
 *
 */
public class AdjacentElementsProduct {

	public static int adjacentElementsProduct(int[] inputArray) {
	    int firstProduct = inputArray[0] * inputArray[1];
	    for(int x = 1; x < inputArray.length-1; x++){
	        int tempProduct = inputArray[x] * inputArray[x+1];
	        if (tempProduct > firstProduct) {
	            firstProduct = tempProduct;
	        }
	    }
	    return firstProduct;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_nums[] = {3, 6, -2, -5, 7, 3};
		
		System.out.println(adjacentElementsProduct(array_nums));
	}

}

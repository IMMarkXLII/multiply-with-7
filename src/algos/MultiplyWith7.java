/**
 * @author ashish.adhikari
 */
package algos;

/**
 * @author ashish.adhikari
 *
 */
public class MultiplyWith7 {
	public static void main (String arg[]) 
    {
        int n = 4;
         
        System.out.println(multiplyBySeven(n));
    }

	/**
	 * @param n
	 * @return
	 */
	private static int multiplyBySeven(int n) {
		
		return ((n<<3) - n);
	}
}

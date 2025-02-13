/**
 * GenericUtils
 *
 * @author Mario Milkov
 * @version 2025-02-13
 */
public class GenericUtils {
    /**
     * Reverses the given array in place.
     *
     * @param array The array to be reversed.
     * @param <T> The type of elements in the array.
     */
    public static <T> void reverse(T[] array){
        int l = 0;
        int r = array.length - 1;
        while(l < r){
            T temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }
    }
    /**
     * Sums the values of the numbers in the array.
     *
     * @param array The array of numbers.
     * @param <T> The type of elements (must extend Number).
     * @return The sum as a double.
     */
    public static <T extends Number> double sum(T[] array){
        double sum = 0;
        for(T element : array){
            sum += element.doubleValue();
        }
        return sum;
    }
}
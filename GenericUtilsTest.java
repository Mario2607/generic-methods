import java.util.Arrays;
/**
 * GenericUtilsTest
 *
 * @author Mario Milkov
 * @version 2025-02-13
 */
public class GenericUtilsTest{
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {6.9, 8.8};
        System.out.println("Original Array: " + Arrays.toString(intArray));
        GenericUtils.reverse(intArray);
        System.out.println("Reversed Array: " + Arrays.toString(intArray));
        System.out.println("Sum of Double Array: " + GenericUtils.sum(doubleArray));
        System.out.println("Sum of Integer Array: " + GenericUtils.sum(intArray));
    }
}
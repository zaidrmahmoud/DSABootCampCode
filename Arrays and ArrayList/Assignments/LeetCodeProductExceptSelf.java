// LeetCodeProductExceptSelf.java

import java.util.Arrays;

public class LeetCodeProductExceptSelf {
    public static void main(String[] args) {
        int[] firstSet = {1, 2, 3, 4};
        int[] secondSet = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(product(firstSet)));
        System.out.println(Arrays.toString(product(secondSet)));
    }
    public static int[] product(int[] array) {
        int[] product = new int[array.length];
        int multiply = 1;

        for (int i = 0; i < array.length; i++) {
            if (i==0) {
                for (int k = 1; k < array.length; k++){
                    multiply *= array[k];
                }
            }
            else if (i==(array.length-1)) {
                for (int k = 0; k < array.length-1; k++){
                    multiply *= array[k];
                }
            }
            else {
                for (int k = 0; k < i; k++){
                    multiply *= array[k];
                }
                for (int k = array.length-1; k > i; k--){
                    multiply *= array[k];
                }
            }
            product[i] = multiply;
            multiply = 1;
        }
        return product;
    }
}

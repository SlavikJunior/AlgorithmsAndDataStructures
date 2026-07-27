package com.github.slavikjunior.arrays;

public class MaximumProductOfThreeNumbersJavaSolution {

    public static int maximumProduct(int[] nums) {
        var max1 = Integer.MIN_VALUE;
        var max2 = Integer.MIN_VALUE;
        var max3 = Integer.MIN_VALUE;

        var min1 = Integer.MAX_VALUE;
        var min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        var firstProduct = max1 * max2 * max3;
        var secondProduct = max1 * min1 * min2;

        return Math.max(firstProduct, secondProduct);
    }

    public static void main(String[] args) {
        System.out.println(MaximumProductOfThreeNumbersJavaSolution.maximumProduct(new int[]{1, 2, -3, -4}));
    }
}

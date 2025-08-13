package org.malleswari.arraysPractice;

public class ArrayPractice {


    public static void main(String[] args) {
        int[] integerArray = {1, 1, 4, 3, 4};

        System.out.println("sum of array is ::" + sumOfArrayElements(integerArray));

    }

    public static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println(sum);
        }
        return sum;
    }
}

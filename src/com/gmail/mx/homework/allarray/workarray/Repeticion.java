package com.gmail.mx.homework.allarray.workarray;

public class Repeticion {
    public static void main(String[] args) {
        System.out.println("Elements array: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.println("index [" + i + "] number [" + array[i] + "]");
        }


        System.out.println("");
        System.out.println("Sum negative numbers from method: " + negativeSum(array));
        System.out.println("Number Pair Num: " + numberPairUnpair(array));
        System.out.println("Number Unpair Num: " + (array.length - numberPairUnpair(array)));
        maxElement(array);
        minElement(array);
        System.out.println("Var two - first negative: " + findNegativeVarTwo(array));
        findNegativeIndex(array);
    }


    public static int negativeSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int numberPairUnpair(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }

    public static void maxElement(int[] array) {
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println("Max element array: " + array[indexMax] + " index[" + indexMax + "]");
    }

    public static void minElement(int[] array) {
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println("Min element array: " + array[indexMin] + " index[" + indexMin + "]");
    }

    public static void findNegativeIndex(int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                index = i;
                System.out.println("first negative position " + array[index] + " and index " + (index));
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not negative value");
        }
    }


    public static int findNegativeVarTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return i;
            }
        }
        return -1;
    }


}








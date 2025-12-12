package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    public static int[] add(int[] source, int element) {
        int[] sourceRevamp = new int[source.length + 1];
        for (int i = 0; i < source.length ; i++) {
            sourceRevamp[i] = source[i];
        }
        sourceRevamp[sourceRevamp.length-1] = element;
        return sourceRevamp;
    }

    public static int[] addFirst(int[] source, int element) {
        return new int[1];
    }

    public static int[] addAll(int[] source, int... elements) {
        int[] result = new int[source.length + elements.length];

        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }

        for (int i = 0; i < elements.length; i++) {
            result[source.length + i] = elements[i];
        }

        return result;
    }

    public static boolean contains(int[] source, int element) {
        return false;
    }

    public static void copy(int[] sourceArray, int[] destinationArray, int count) {

    }

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

    }

    public static void fill(int[] source, int element) {

    }

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] insert(int[] source, int index, int element) {
        return new int[1];
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {
        return new int[1];
    }

    public static void reverse(int[] arrayToReverse) {
    }

    public static int[] section(int[] source, int startIndex, int endIndex) {
        return new int[1];
    }

}

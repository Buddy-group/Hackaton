package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    public static int[] add(int[] source, int element) {
        int[] sourceRevamp = new int[source.length + 1];
        for (int i = 0; i < source.length; i++) {
            sourceRevamp[i] = source[i];
        }
        sourceRevamp[sourceRevamp.length - 1] = element;
        return sourceRevamp;
    }

    public static int[] addFirst(int[] source, int element) {
        if (source.length == 0) {
            int[] emptyArr = new int[]{element};
            return emptyArr;
        } else {
            int[] filledArr = new int[source.length + 1];
            filledArr[0] = element;
            for (int i = 1; i < filledArr.length; i++) {
                filledArr[i] = source[i - 1];
            }
            return filledArr;
        }
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
        boolean contains = false;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == element) {
                contains = true;
            }
        }
        return contains;
    }

    public static void copy(int[] sourceArray, int[] destinationArray, int count) {

        if(sourceArray.length >= destinationArray.length){
            for (int i = 0; i < destinationArray.length; i++) {
                destinationArray[i] = sourceArray[i];
            }
        }
        else {
            int index = 0;
            for (int i = 0; i < sourceArray.length; i++) {
                destinationArray[i] = sourceArray[i];
                index++;
            }
            for (int i = index; i <destinationArray.length ; i++) {
                destinationArray[i] = 0;
            }
        }

    }

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {
        int indexSource = sourceStartIndex;
        int indexDest = destStartIndex;
        for (int i = 0; i < count; i++) {
            destinationArray[indexDest] = sourceArray[indexSource];
            indexSource++;
            indexDest++;
        }
    }

    public static void fill(int[] source, int element) {
        for (int i = 0; i < source.length; i++) {
            source[i] = element;
        }
    }

    public static int firstIndexOf(int[] source, int target) {
        for (int i = 0; i < source.length; i++) {
            if (target == source[i]){
                return i;
            }
        }
        return -1;
    }

    public static int[] insert(int[] source, int index, int element) {
        int[] result = new int[source.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = source[i];
        }
        result[index] = element;
        for (int i = index+1; i < result.length ; i++) {
            result[i] = source[i-1];
        }

        return result;
    }

    public static boolean isValidIndex(int[] source, int index) {

        if (source.length == 0){
            return false;
        }

        if (index >= 0 && index < source.length){
            return true;
        }
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

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

        if (sourceArray.length >= destinationArray.length) {
            for (int i = 0; i < destinationArray.length; i++) {
                destinationArray[i] = sourceArray[i];
            }
        } else {
            int index = 0;
            for (int i = 0; i < sourceArray.length; i++) {
                destinationArray[i] = sourceArray[i];
                index++;
            }
            for (int i = index; i < destinationArray.length; i++) {
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
            if (target == source[i]) {
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
        for (int i = index + 1; i < result.length; i++) {
            result[i] = source[i - 1];
        }

        return result;
    }

    public static boolean isValidIndex(int[] source, int index) {

        if (source.length == 0) {
            return false;
        }

        if (index >= 0 && index < source.length) {
            return true;
        }
        return false;
    }

    /**
     * Finds the last index of the given target element in the array.
     *
     * @param source the array in which the target is searched
     * @param target the value whose last index is returned
     * @return the index of the last occurrence of the target, or -1 if it is not found
     * @author Gabriela
     */
    public static int lastIndexOf(int[] source, int target) {
        int currentLastIndex = -1;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == target) {
                currentLastIndex = i;
            }
        }
        return currentLastIndex;
    }

    /**
     * Removes all occurrences of a given element from the source array.
     *
     * @param source  the array from which the element will be removed
     * @param element the value that should be removed from the array
     * @return a new array without the given element
     * @author Gabriela
     */
    public static int[] removeAllOccurrences(int[] source, int element) {
        int countElement = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == element) {
                countElement++;
            }
        }
        int[] newArray = new int[source.length - countElement];
        int j = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] != element) {
                newArray[j] = source[i];
                j++;
            }
        }
        return newArray;
    }

    /**
     * Reverses the given array by swapping elements from the beginning
     * with elements from the end until the middle is reached.
     *
     * @param arrayToReverse the array that should be reversed
     * @return void
     * @author Gabriela
     */
    public static void reverse(int[] arrayToReverse) {
        int tempNumber;
        for (int i = 0; i < arrayToReverse.length / 2; i++) {
            tempNumber = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[arrayToReverse.length - 1 - i];
            arrayToReverse[arrayToReverse.length - 1 - i] = tempNumber;
        }
    }

    /**
     * Returns a section of the source array starting from the given start index.
     * If the given range is longer than the array, all remaining elements are taken.
     *
     * @param source the original array
     * @param startIndex the index from which the section starts
     * @param endIndex the length of the section to take
     * @return a new array containing the selected section, or the source array if the start index is invalid
     *
     * @author Gabriela
     */
    public static int[] section(int[] source, int startIndex, int endIndex) {
        if (source.length == 0) {
            return new int[]{};
        }

        if (startIndex < 0 || startIndex >= source.length) {
            return source;
        }
        if (endIndex > source.length) {
            endIndex = source.length-1;
        }
        int[] newArray = new int[endIndex - startIndex + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = source[startIndex];
            startIndex++;
        }

        return newArray;
    }

}

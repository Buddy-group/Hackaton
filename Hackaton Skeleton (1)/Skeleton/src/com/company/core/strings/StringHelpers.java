package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    public static String abbreviate(String source, int maxLength) {
        if (source.length() <= maxLength) {
            return source;
        } else return source.substring(0, maxLength) + "...";
    }

    public static String capitalize(String source) {
        if (source.isEmpty()) {
            return "";
        }
        char first = source.charAt(0);
        first = (char) (first - ('a' - 'A'));

        return first + source.substring(1);
    }

    public static String concat(String string1, String string2) {
        return String.format("%s%s", string1, string2);
    }

    public static boolean contains(String source, char symbol) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == symbol) {
                return true;
            }
        }
        return false;
    }

    public static boolean endsWith(String source, char target) {
        if (source.length() > 0) {
            char lastChar = source.charAt(source.length() - 1);
            if (target == lastChar) {
                return true;
            }
        }
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        for (int i = 0; i < source.length(); i++) {
            if (target == source.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(String source, char symbol) {
        char[] sourceArr = source.toCharArray();
        int index = -1;

        for (int i = 0; i < sourceArr.length; i++) {
            if (symbol == sourceArr[i]) {
                index = i;
                break;
            }
        }
        return index;
    } // S

    public static String pad(String source, int length, char paddingSymbol) {

        int totalPadding = Math.abs(length - source.length());
        int leftPad = totalPadding / 2;
        int rightPad = totalPadding / 2;
        String leftPadding = "";
        String rightPadding = "";
        if (source.length() > length) {
            source = source;
        } else if (length % 2 != 0) {
            for (int i = 0; i < leftPad; i++) {
                leftPadding = leftPadding + paddingSymbol;
            }
            for (int i = 0; i < rightPad; i++) {
                rightPadding = rightPadding + paddingSymbol;
            }
        }
        return leftPadding + source + rightPadding;

    } // S

    public static String padEnd(String source, int length, char paddingSymbol) {
        if (source.length() == 0) {
            source = "";
        } else if (source.length() > length) {
            source = source;
        } else if (length > source.length()) {
            int paddingLength = length - source.length();
            String padding = "";
            for (int i = 0; i < paddingLength; i++) {
                padding = padding + paddingSymbol;
            }
            source = source + padding;
        }

        return source;
    } // S

    /**
     * This method adds the given padding symbol to the beginning of the string until the desired length is reached.
     *
     * @param source the original string
     * @param length the desired total length of the result string
     * @param paddingSymbol the character used for padding
     * @return the padded string, or the original string if it is already longer than the given length
     *
     * @author Gabriela
     */
    public static String padStart(String source, int length, char paddingSymbol) {
        String paddedSource = source;
        if (source.length() == 0) {
            source = "";
        } else if (source.length() > length) {
            source = source;
        } else if (length > source.length()) {
            for (int i = 0; i < (length-source.length()); i++) {
                paddedSource = paddingSymbol + paddedSource;
            }
        }
        return paddedSource;
    }

    /**
     * Repeats the given string a specified number of times.
     *
     * @param source the string to be repeated
     * @param times the number of times the string should be repeated
     * @return a new string that contains the source string repeated the given number of times
     *
     * @author Gabriela
     */
    public static String repeat(String source, int times) {
        String newSource = source;
        if (times == 0){
            return source;
        }
        else {
            for (int i = 0; i < times-1; i++) {
                newSource = newSource+source;
            }
        }
        return newSource;
    }

    public static String reverse(String source) {
        return null;
    } // G

    public static String section(String source, int start, int end) {
        return null;
    }

    public static boolean startsWith(String source, char target) {
        return false;
    }

}

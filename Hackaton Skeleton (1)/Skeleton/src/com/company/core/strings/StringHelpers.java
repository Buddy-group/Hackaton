package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    public static String abbreviate(String source, int maxLength) {
        return null;
    } // D

    public static String capitalize(String source) {
        return null;
    } // D

    public static String concat(String string1, String string2) {
        return null;
    } //D

    public static boolean contains(String source, char symbol) {
        return false;
    } // A

    public static boolean endsWith(String source, char target) {
        return false;
    } // A

    public static int firstIndexOf(String source, char target) {
        return 0;
    } // A

    public static int lastIndexOf(String source, char symbol) {
        char[] sourceArr = source.toCharArray();
        int index = -1;

        for (int i = 0; i < sourceArr.length ; i++) {
            if (symbol == sourceArr[i]) {
                index = i;
                break;
            }
        }
        return index;
    } // S

    public static String pad(String source, int length, char paddingSymbol)  {


        int totalPadding = length - source.length();
        int leftPad = totalPadding / 2;
        int rightPad = totalPadding / 2;
        String leftPadding = "";
        String rightPadding = "";
        if (source.length() > length) {
            source = source;
        }else if (length % 2 != 0) {
            for (int i = 0; i < leftPad; i++) {
                leftPadding = leftPadding + paddingSymbol;
            }
            for (int i = 0; i < rightPad; i++) {
                rightPadding = rightPadding + paddingSymbol;
            }
        }
        return leftPadding+source+rightPadding;

    } // S

    public static String padEnd(String source, int length, char paddingSymbol) {
        return null;
    } // S

    public static String padStart(String source, int length, char paddingSymbol) {
        return null;

    } // G

    public static String repeat(String source, int times) {
        return null;
    } // G

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

package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    public static String abbreviate(String source, int maxLength) {
        if (source.length() <= maxLength){
            return source;
        }
        else return source.substring(0,maxLength) + "...";
    } // D

    public static String capitalize(String source) {
        return null;
    } // D

    public static String concat(String string1, String string2) {
        return null;
    } //D

    public static boolean contains(String source, char symbol) {
        for (int i = 0; i < source.length(); i++) {
            if(source.charAt(i) == symbol){
                return true;
            }
        }
        return false;
    }

    public static boolean endsWith(String source, char target) {
        if(source.length() >0){
            char lastChar = source.charAt(source.length()-1);
            if(target == lastChar){
                return true;
            }
        }
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        for (int i = 0; i < source.length(); i++) {
            if(target == source.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(String source, char symbol) {
        return 0;
    } // S

    public static String pad(String source, int length, char paddingSymbol)  {
        return null;

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

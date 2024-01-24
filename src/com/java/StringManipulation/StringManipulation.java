package com.java.StringManipulation;

import java.util.ArrayList;

public class StringManipulation {

    public static boolean equals(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        return equals(str1.toLowerCase(), str2.toLowerCase());
    }

    public static String valueOf(int value) {
        return Integer.toString(value);
    }

    public static char[] toCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static String concat(String str1, String str2) {
        return str1 + str2; // "+" operator is used for concatenation
    }

    public static String toUpperCase(String str) {
        char[] chars = toCharArray(str);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - ('a' - 'A'));
            }
        }
        return new String(chars);
    }

    public static String toLowerCase(String str) {
        char[] chars = toCharArray(str);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + ('a' - 'A'));
            }
        }
        return new String(chars);
    }

    public static char charAt(String str, int index) {
        return str.toCharArray()[index];
    }

    public static int length(String str) {
        return str.toCharArray().length;
    }

    public static int indexOf(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static String substring(String str, int beginIndex, int endIndex) {
        char[] sub = new char[endIndex - beginIndex];
        for (int i = beginIndex; i < endIndex; i++) {
            sub[i - beginIndex] = str.charAt(i);
        }
        return new String(sub);
    }

    public static String replaceAll(String str, String oldStr, String newStr) {
        // Simple implementation assuming oldStr is not a regex
        StringBuilder sb = new StringBuilder();
        int lastIndex = 0;
        while (true) {
            int index = str.indexOf(oldStr, lastIndex);
            if (index == -1) {
                sb.append(str.substring(lastIndex));
                break;
            }
            sb.append(str.substring(lastIndex, index));
            sb.append(newStr);
            lastIndex = index + oldStr.length();
        }
        return sb.toString();
    }

    public static String[] split(String str, String delimiter) {
        // Simple implementation assuming delimiter is not a regex
        ArrayList<String> parts = new ArrayList<>();
        int lastIndex = 0;
        while (true) {
            int index = str.indexOf(delimiter, lastIndex);
            if (index == -1) {
                parts.add(str.substring(lastIndex));
                break;
            }
            parts.add(str.substring(lastIndex, index));
            lastIndex = index + delimiter.length();
        }
        return parts.toArray(new String[0]);
    }

    public static String trim(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) <= ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) <= ' ') {
            end--;
        }
        return (start > 0 || end < str.length() - 1) ? str.substring(start, end + 1) : str;
    }

    public static boolean isEmpty(String str) {
        return str.length() == 0;
    }

    public static void main(String[] args) {
        // Test the custom string methods
        String str1 = "Hello";
        String str2 = "HELLO";
        System.out.println("equals: " + equals(str1, str2));
        System.out.println("equalsIgnoreCase: " + equalsIgnoreCase(str1, str2));
        System.out.println("valueOf: " + valueOf(123));
        System.out.println("toCharArray: " + new String(toCharArray(str1)));
        System.out.println("concat: " + concat(str1, str2));
        System.out.println("toUpperCase: " + toUpperCase(str1));
        System.out.println("toLowerCase: " + toLowerCase(str2));
        System.out.println("charAt: " + charAt(str1, 1));
        System.out.println("length: " + length(str1));
        System.out.println("indexOf: " + indexOf(str1, 'e'));
        System.out.println("substring: " + substring(str1, 1, 4));
        System.out.println("replaceAll: " + replaceAll("Hello World", "World", "Java"));
        System.out.println("split: " + String.join(", ", split("Hello World", " ")));
        System.out.println("trim: " + trim("   Hello World   "));
        System.out.println("isEmpty: " + isEmpty(""));
    }

}

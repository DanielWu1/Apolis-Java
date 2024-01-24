package com.java.StringManipulation;
import java.util.*;

public class StringProblems {

    // Problem 1: Reverse a String
    public static String reverseString(String str) {
        char[] result = new char[str.length()];
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            result[i] = str.charAt(j);
        }
        return new String(result);
    }

    // Problem 2: Count the Occurrences of a Character
    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }

    // Problem 3: Check if a String is a Palindrome
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

    // Problem 4: Remove Duplicates from a String
    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        char[] copyCharArr = str.toCharArray();
        for (char c : copyCharArr) {
            seen.add(c);
        }
        String res = "";
        for (char c : seen) {
            res += c;
        }
        return res;
    }

    // Problem 5: Capitalize the First Letter of Each Word in a Sentence
    public static String capitalizeFirstLetter(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1)).append(" ");
            }
        }
        return sb.toString();
    }

    // Problem 6: Count the Occurrences of a Specific Character in a String
    public static int countOccurrencesOfChar(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    // Problem 7: Check if Two Strings are Anagrams
    public static boolean areAnagrams(String str1, String str2) {
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        return Arrays.equals(arr1, arr2);
        if (str1.length() != str2.length()){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (Character key: map1.keySet()){
            if(!map2.containsKey(key)){
                return false;
            }
            if(map1.get(key) != map2.get(key)){
                return false;
            }
        }
        return true;
    }

    // Problem 8: Remove All Whitespace Characters from a String
    public static String removeAllWhitespace(String str) {
//        return str.replaceAll("\\s+", "");
        StringBuilder res = new StringBuilder();
        for (Character s: str.toCharArray()){
            if(!s.equals(' ')){
                res.append(s);
            }
        }
        return res.toString();
    }

    // Problem 9: Find the Longest Common Prefix Among a Group of Strings
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];

    }

    // Problem 10: Convert a String to Uppercase or Lowercase
    public static String convertCase(String str, boolean toUpperCase) {
        return toUpperCase ? str.toUpperCase() : str.toLowerCase();
    }

    // Problem 11: Swapping Two Strings Without Using a Third Variable
    public static String[] swapStrings(String[] str1) {
        str1[0] = str1[0] + str1[1];
        str1[1] = str1[0].substring(0, str1[0].length() - str1[1].length());
        str1[0] = str1[0].substring(str1[1].length());
        return str1;
    }

    // Problem 12: Check if a String is a Rotation of Another String
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        if (concatenated.indexOf(str2) != -1) {
            return true;
        } else {
            return false;
        }
    }

    // Problem 13: Reverse Each Word of a String in a Sentence
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverseString(word)).append(" ");
        }
        return sb.toString();
    }

    // Problem 14: Print the First Non-Repeated Character in a String
    public static Character firstNonRepeatedChar(String str) {
        Map<Character, Integer> charCountMap = countCharacterOccurrences(str);
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    // Problem 15: Print All Duplicate Characters in a String
    public static Set<Character> allDuplicateChars(String str) {
        Map<Character, Integer> charCountMap = countCharacterOccurrences(str);
        Set<Character> duplicates = new HashSet<>();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    // Problem 16: Print the Largest Word in a String Sentence
    public static String largestWord(String sentence) {
        String[] words = sentence.split(" ");
        String largest = "";
        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }
        return largest;
    }

    // Problem 17: Reverse a String Without Using a Third Variable
    public static String reverseStringNoVariable(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            charArray[left] ^= charArray[right];
            charArray[right] ^= charArray[left];
            charArray[left] ^= charArray[right];

            left++;
            right--;
        }

        return new String(charArray);
    }
    public static void main(String[] args) {
        // Test cases for each problem
        System.out.println("Problem 1 - Reverse a String: " + reverseString("hello")); // "olleh"

        System.out.println("Problem 2 - Count the Occurrences of a Character:");
        Map<Character, Integer> occurrences = countCharacterOccurrences("hello");
        for(Character key: occurrences.keySet()){
            System.out.println(key + " - " + occurrences.get(key) + " times");
        }

        System.out.println("Problem 3 - Check if a String is a Palindrome:");
        System.out.println("radar: " + isPalindrome("radar")); // true
        System.out.println("hello: " + isPalindrome("hello")); // false

        System.out.println("Problem 4 - Remove Duplicates from a String: " + removeDuplicates("aabbcdd")); // "abcd"

        System.out.println("Problem 5 - Capitalize the First Letter of Each Word in a Sentence:");
        System.out.println(capitalizeFirstLetter("this is a sample sentence")); // "This Is A Sample Sentence"

        System.out.println("Problem 6 - Count the Occurrences of a Specific Character in a String:");
        System.out.println("'o' in 'hello world': " + countOccurrencesOfChar("hello world", 'o')); // 2

        System.out.println("Problem 7 - Check if Two Strings are Anagrams:");
        System.out.println("listen and silent: " + areAnagrams("listen", "silent")); // true
        System.out.println("hello and world: " + areAnagrams("hello", "world")); // false

        System.out.println("Problem 8 - Remove All Whitespace Characters from a String:");
        System.out.println(removeAllWhitespace("hello world")); // "helloworld"

        System.out.println("Problem 9 - Find the Longest Common Prefix Among a Group of Strings:");
        String[] strs = {"apple", "appetite", "apprehend"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(strs)); // "app"

        System.out.println("Problem 10 - Convert a String to Uppercase or Lowercase:");
        System.out.println(convertCase("Hello", true));  // "HELLO"
        System.out.println(convertCase("Hello", false)); // "hello"

        System.out.println("Problem 11 - Swapping Two Strings Without Using a Third Variable:");
        String[] str1 = {"hello", "world"};
        swapStrings(str1);
        System.out.println("After swap - str1: " + str1[0] + " str2 " + str1[1]); // "world", "hello"

        System.out.println("Problem 12 - Check if a String is a Rotation of Another String:");
        System.out.println("apple and leapp: " + isRotation("apple", "leapp")); // true
        System.out.println("hello and world: " + isRotation("hello", "world")); // false

        System.out.println("Problem 13 - Reverse Each Word of a String in a Sentence:");
        System.out.println(reverseEachWord("hello world")); // "olleh dlrow"

        System.out.println("Problem 14 - Print the First Non-Repeated Character in a String:");
        System.out.println("First non-repeated in 'hello': " + firstNonRepeatedChar("hello")); // "h"

        System.out.println("Problem 15 - Print All Duplicate Characters in a String:");
        Set<Character> duplicates = allDuplicateChars("programming");
        System.out.println("Duplicates in 'programming': " + duplicates); // r, g, m

        System.out.println("Problem 16 - Print the Largest Word in a String Sentence:");
        System.out.println("Largest word in 'This is a sample sentence': " + largestWord("This is a sample sentence")); // "sentence"

        System.out.println("Problem 17 - Reverse a String Without Using a Third Variable:");
        System.out.println("Reverse of 'hello' without third variable: " + reverseStringNoVariable("hello")); // "olleh"
    }
}

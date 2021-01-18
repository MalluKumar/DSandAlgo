package stacks.palindrome;

import java.util.LinkedList;

public class Palindrome {

    public static void main (String [] args) {

        System.out.println(checkPalindrome("abccba"));
        System.out.println(checkPalindrome(" Was it a car or a cat I saw?"));
        System.out.println(checkPalindrome("I did, did I?"));
        System.out.println(checkPalindrome("hello"));
        System.out.println(checkPalindrome("Don't nod"));

    }

    public static boolean checkPalindrome(String string) {

        if (string.length() == 0) {
            return false;
        }

        String lowerCase = string.toLowerCase();

        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder originalString = new StringBuilder(lowerCase.length());

        for (int i = 0; i < lowerCase.length(); i++) {

            char c = lowerCase.charAt(i);

            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                originalString.append(c);
            }

        }

        StringBuilder reversedString = new StringBuilder(stack.size());

        while (! stack.isEmpty()) {
            char c = stack.pop();
            reversedString.append(c);
        }

        if (originalString.toString().equals(reversedString.toString())) {
            return true;
        }

        return false;

    }

}

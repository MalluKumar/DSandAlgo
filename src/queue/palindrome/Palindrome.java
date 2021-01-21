package queue.palindrome;

import java.util.LinkedList;

public class Palindrome {

    public static void main(String[] args) {

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

        String lowerCaseString = string.toLowerCase();

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        for (int i = 0; i < lowerCaseString.length(); i++) {

            char c = lowerCaseString.charAt(i);

            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                queue.add(c);
            }

        }

        while (! stack.isEmpty()) {

            char stackCharacter = stack.pop();
            char queueCharacter = queue.remove();

            if (stackCharacter != queueCharacter) {
                return false;
            }

        }

        return true;

    }

}

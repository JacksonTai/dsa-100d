package org.example.validParentheses;

public class Main {

    public static void main(String[] args) {

    }

    public boolean solution(String s) {
        /*
        loop through every characters in the string
        every time the index number become even number: means it's a new combination of brackets
        ()[]{}[]
        01234567 <- index
        0 2 4 6  <- if index is even number, it's a new combination of brackets

        for each loop/characters
            if current index is even number, make sure to check the next characters is the same

        */
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char currentChar, nextChar;
            currentChar = nextChar = s.charAt(i);

            if (i != s.length()) {
                nextChar = s.charAt(i + 1);
            }

            if (currentChar == '(' && nextChar != ')') {
                return false;
            }
            if (currentChar == '{' && nextChar != '}') {
                return false;
            }
            if (currentChar == '[' && nextChar != ']') {
                return false;
            }
        }
        return true;
    }
}

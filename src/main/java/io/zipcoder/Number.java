package io.zipcoder;

public class Number {
    public static void main(String[] args) {
        MyStack<String> numbers = new MyStack();
        numbers.push("ABS");
        numbers.push("ABC");
        String aNumber = numbers.pop();
        System.out.println(aNumber);
    }
}

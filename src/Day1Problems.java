import java.util.List;

public class Day1Problems {

    /**
     * Lambda Expressions
     * Write a lambda expression to filter out all even numbers from a list of integers
     * Input: [1, 2, 3, 4, 5, 6]
     * Output: [1, 3, 5]
     */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter( num -> num % 2 == 0).toList();
    }

    /**
     * 2. Streams API
     * Given a list of strings, use the Streams API to convert them to uppercase and sort them alphabetically.
     *
     * Input: ["apple", "banana", "cherry"]
     * Output: ["APPLE", "BANANA", "CHERRY"]
     */
    public static List<String> toUpperCase(List<String> fruits) {
        return fruits.stream().map(String::toUpperCase).sorted().toList();
    }



}

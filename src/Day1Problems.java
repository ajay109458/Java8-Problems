import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

    /**
     * Functional Interfaces
     * Use the Predicate<T> functional interface to check if a string starts with the letter 'A'.
     *
     * Input: "Apple", "Banana", "Apricot"
     * Output: true, false, true
     */
    public static List<Boolean> CheckIfStartsWithA(List<String> fruits) {
        Predicate<String> predicate = input -> input.startsWith("A");
        return fruits.stream().map(fruit -> predicate.test(fruit)).toList();
    }

    /**
     * 5. Optional Class
     * Write a program to safely retrieve a value from an Optional. If the value is absent, provide a default value.
     *
     * Input: Optional.empty()
     * Output: "Default Value"
     */
    public static void printOptionalValues(List<String> fruits) {
        Optional<String> optinalWithoutValue = Optional.empty();
        String result = optinalWithoutValue.orElse("Some random value");
        System.out.println(result);
    }

    /**
     *  Method References
     * Use method references to simplify a program that prints each element of a list.
     *
     * Input: [10, 20, 30]
     * Output:
     * Copy code
     * 10
     * 20
     * 30
     */
    public static void printValueofList(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    /**
     * Find the product of all numbers in a list using the reduce() method.
     *
     * Input: [1, 2, 3, 4]
     * Output: 24
     */
    public static void streamReduction(List<Integer> numbers) {
        numbers.stream().reduce(0, Integer::sum);
    }

    /**
     * Use Collectors to group a list of strings by their length.
     *
     * Input: ["cat", "dog", "elephant", "bat"]
     * Output: {3=[cat, dog, bat], 8=[elephant]}
     */
    public static void collectorsExample(List<String> animals) {
        animals.stream().collect(Collectors.groupingBy(String::length));
    }

    /**
     * Parallel Streams
     * Demonstrate how to use parallel streams to sum all elements in a large list of integers efficiently.
     *
     * Input: [1, 2, 3, ..., 1000000]
     * Output: 500000500000
     */
    public static Integer sumOfIntegerParallelly(List<Integer> numbers) {
        return numbers.parallelStream().reduce(0, Integer::sum);
    }


}

/**
 * Default Methods in Interfaces
 * Create an interface Calculator with a default method square(int number) that returns the square of a number. Implement the interface and demonstrate the default method.
 */
interface TestInferface {
    default int square(int a, int b) {
        return a*b;
    }
}

package Task19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

    public static class ListProcessor {

        private List<Integer> numbers = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

        public void processNumbers(){
            while (true){
                System.out.println("Please enter a number (type 'done' to finish input):");
                String input = scanner.next();

                if ("done".equalsIgnoreCase(input)){
                    break;
                }

                try {
                    int num = Integer.parseInt(input);
                    numbers.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or type 'done' to finish.");
                }
            }
            processList();

        }

        private void processList() {
            System.out.println("a. Sum of even numbers: " + numbers.stream()
                    .filter(x -> x % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum());
            System.out.println("b. Doubled numbers: " + numbers.stream()
                    .map(x-> x*2)
                    .toList());
            System.out.println("c. Maximum number: "+numbers.stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .orElse(Integer.MIN_VALUE));
            System.out.println("d. Odd numbers: "+ numbers.stream()
                    .filter(x-> x%2 != 0)
                    .map(String::valueOf)
                    .collect(Collectors.joining(",")));
            System.out.println("e. Avarage of all nums: "+ numbers.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0));
        }

    }

        public static void main(String[] args) {
        ListProcessor listProcessor = new ListProcessor();
        listProcessor.processNumbers();


        }
    }

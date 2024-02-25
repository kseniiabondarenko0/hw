import  java.util.*;

public class MainHW13 {


    // на кожет таск свої лісти, тому не плутати, а дивитися уважно

    public static void main(String[] args) {
        // Task 1
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);   // а це я з Rush розбирала різницю з List.of
        //Collections.sort(numbers);
        //Collections.reverse(numbers);         і в чому різниця із reverseOrder, бо я її не побачила
        //System.out.println(numbers);          я по модному, через ф-ю
        sortNumbers(numbers, false);
        System.out.println("Sorted numbers in ascending order: " + numbers);

        // Task 2
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "melon", "apple", "kiwi")); // тут вже база
        removeDuplicates(strings);
        System.out.println("List after removing duplicates: " + strings);

        // Task 3
        List<Integer> numbers2 = Arrays.asList(5, 2, 8, 1, 9);
        int max = findMax(numbers2);
        int min = findMin(numbers2);
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

        // Task 4
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
        List<Integer> mergedList = mergeLists(list1, list2);
        System.out.println("Merged list without duplicates: " + mergedList);

        // Task 5
        boolean isPresent = isElementPresent(numbers2, 10);
        System.out.println("Is 10 present in the list? " + isPresent);
    }

    public static void sortNumbers(List<Integer> numbers, boolean ascending) {
        if (ascending) {
            Collections.sort(numbers);
        } else {
            Collections.sort(numbers, Collections.reverseOrder());
        }
    }

    public static void removeDuplicates(List<String> strings) {     //взяла ідею на StackOveflow
        Set<String> uniqueStrings = new HashSet<>(strings);
        strings.clear();
        strings.addAll(uniqueStrings);
    }

    public static int findMax(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static int findMin(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> mergedSet = new HashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);
        return new ArrayList<>(mergedSet);
    }

    public static boolean isElementPresent(List<Integer> numbers, int target) {
        return numbers.contains(target);
    }
}

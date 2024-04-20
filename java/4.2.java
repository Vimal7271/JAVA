import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        
        int[] uniqueArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniqueArray[i] = list.get(i);
        }

        return uniqueArray;
    }
}
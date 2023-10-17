public class FindDuplicate {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "apple", "date", "banana"};
        String[] array2 = {"apple", "banana", "grape", "kiwi", "orange"};

        System.out.println("Duplicate values in array1:");
        findAndPrintDuplicates(array1);

        System.out.println("\nDuplicate values in array2:");
        findAndPrintDuplicates(array2);
    }

    public static void findAndPrintDuplicates(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}

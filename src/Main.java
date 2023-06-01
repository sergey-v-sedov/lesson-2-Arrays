import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Document[] documents = new Document[] {new Document(100, 333),
        new Document(5, 1000), new Document(777, 9)};

        System.out.println("До сотрировки: " + Arrays.toString(documents));

        Arrays.sort(documents, new Document.SumComparatorAsc());

        System.out.println("После сотрировки: " + Arrays.toString(documents));

        // ===================================================

        int[] array = new int[]{1, 44, 7, 5, 100};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 44);
        System.out.println(index);
    }
}
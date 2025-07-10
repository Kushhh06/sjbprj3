package sjb.TimeComplexity;

public class Selection {
    public static void main(String[] args) {
        int[] array = {64, 25, 40, 22, 11};

        SelectionSort s = new SelectionSort();
        s.selectionSort(array);

        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.println(i);
        }
    }
}

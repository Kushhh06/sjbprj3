package sjb.TimeComplexity;

public class Binary {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {10, 20, 30, 40, 50};
        int element = 50
        		;

        int index = bs.binarySearch(array, element);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

}


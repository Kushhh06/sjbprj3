package sjb.TimeComplexity;

public class LinearSearch {

    public int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; 
            }
        }
        return -1; 
    }
}


package sjb.TimeComplexity;

public class Linear {
    public static void main(String[] args) {
        int[] ar = {10, 20, 40, 50}; 
        int ele = 50;

        LinearSearch l = new LinearSearch();
        int res = l.linearSearch(ar, ele);
        System.out.println(res);  
    }

}

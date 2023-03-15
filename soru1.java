import java.util.Random;

public class soru1 {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        long startTime = System.currentTimeMillis();
        int result = max(arr);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Max element: " + result);
        System.out.println("Duration: " + duration + " ms");
    }

     static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}


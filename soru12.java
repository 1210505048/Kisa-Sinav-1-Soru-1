import java.util.Random;

public class soru12 {

  public static int maxBruteForce(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
    }
    return max;
}


    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        long startTime = System.currentTimeMillis();
        int result = maxBruteForce(arr);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Max element: " + result);
        System.out.println("Duration: " + duration + " ms");
    }

  }

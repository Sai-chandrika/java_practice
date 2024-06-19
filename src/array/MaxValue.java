package array;

public class MaxValue {

    public static int max(int[] arr) {
        int maximum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int max = arr[i] - arr[j];
                maximum=max;
                if (maximum > max) {
                    maximum = max;
                }
            }
        }
return maximum;    }
    public static void main(String[] args) {
      int[] arr={3,2,1};
     int max= max(arr);
        System.out.println(max);
    }
}

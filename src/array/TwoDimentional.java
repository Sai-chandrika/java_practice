package array;

import java.util.*;


public class TwoDimentional {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n + 1];
        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);
            arr[a - 1] += k;
            arr[b] -= k;
        }
        long max = 0, sum = 0;
        for (long value : arr) {
            sum += value;
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> query = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                query.add(scanner.nextInt());
            }
            queries.add(query);
        }
        long result = arrayManipulation(n, queries);
        System.out.println(result);
        scanner.close();
    }



}



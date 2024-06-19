import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count {




    public static int countingValleys( int steps, String path) {
        int altitude = 0;
        int valleys = 0;
        boolean inValley = false;

        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);

            if (step == 'U') {
                altitude++;
            } else if (step == 'D') {
                altitude--;
            }

            if (!inValley && altitude < 0) {
                inValley = true;
            }

            if (inValley && altitude >= 0) {
                valleys++;
                inValley = false;
            }
        }
        return valleys;
    }


    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        for (int i = 0; i < c.size() - 1; ) {
            if (i + 2 < c.size() && c.get(i + 2) == 0) {
                i += 2;
            } else {
                i += 1;
            }
            jumps++;
        }
        return jumps;
    }
    public static long repeatedString(String s, long n) {

        long  occurrencesInInput = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                occurrencesInInput++;
            }
        }
        long repeats = n / s.length();
        int remainder = (int) (n % s.length());
        long totalCount = occurrencesInInput * repeats;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                totalCount++;
            }
        }

        return totalCount;
    }


    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int currentSum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    private static int calculateHourglassSum(List<List<Integer>> arr, int row, int col) {
        int sum = 0;
        sum += arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2);
        sum += arr.get(row + 1).get(col + 1);
        sum += arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);
        return sum;
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();
        d = d % n;
        List<Integer> rotatedList = new ArrayList<>(a.subList(d, n));
        rotatedList.addAll(a.subList(0, d));
        return rotatedList;
    }

    public static void main(String[] args) {
        Count count=new Count();
      int c=  count.countingValleys(8,"UDDDUDUU");
        System.out.println(c);
        List<Integer> integers=new ArrayList<>();
        integers.add(0);
        integers.add(0);
        integers.add(0);
        integers.add(0);
        integers.add(1);
        integers.add(0);
        int d=count.jumpingOnClouds(integers);
        System.out.println(d);
        long l=count.repeatedString("aba",10);
        System.out.println(l);
        List<List<Integer>> arr=new ArrayList<>();
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,1,0,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,0,2,4,4,0));
        arr.add(Arrays.asList(0,0,0,2,0,0));
        arr.add(Arrays.asList(0,0,1,2,4,0));
        int hourGlassSum=count.hourglassSum(arr);
        System.out.println(arr.get(0).get(3));
        System.out.println("hour_glass_sum   " + hourGlassSum);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int rotate=3;
         List<Integer> rotateList=count.rotLeft(list,rotate);
        System.out.println(rotateList+ "rotate list");


    }

}

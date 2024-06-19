import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws  IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = bufferedReader.readLine().trim().split("\\s+");

        for (String input : inputs) {
            int N = Integer.parseInt(input);
            if (N % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                } else if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }
        }

        bufferedReader.close();
    }
}


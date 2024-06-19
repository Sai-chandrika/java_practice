package array;

import java.util.Scanner;

public class Loops {

    public static void table(int a) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + a * i);
        }
    }

    public static void square() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " square is : " + i * i);
        }
    }

    public static int factorial(int a) {
      if(a==0 || a==1){
          return 1;
      }else {
          return a * factorial(a-1);
      }
}

public  static void prime() {
    int limit = 100;
    System.out.println("Prime numbers up to " + limit + ":");
    for (int num = 2; num <= limit; num++) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print(num + " ");
        }
    }
}


public static  void stringCompare(){
    StringBuilder even = new StringBuilder();
    StringBuilder odd = new StringBuilder();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of strings:");
    int number = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < number; i++) {
        String s = scanner.nextLine();
        for (int j = 0; j < s.length(); j++) {
            if (j % 2 == 0) {
                even.append(s.charAt(j));
            } else {
                odd.append(s.charAt(j));
            }
        }

even.append(" ");
odd.append(" ");
        System.out.println(even.toString() + " \n "+ odd.toString() );

    }


    scanner.close();
}



    public static void main(String[] args) {
        table(19);
        square();
       for(int i=0; i<=10; i++) {
           int fact = factorial(i);
           System.out.println(i + " factorial is " + fact);
       }
        stringCompare();
       prime();
    }
}

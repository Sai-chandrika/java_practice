package java_interview_practice;

public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
       int num1=0;
       int num2=1;

       for(int i=0; i<=10;i++){
           System.out.println(num1);
           int nextNum=num1+num2;
           num1=num2;
           num2=nextNum;
       }

    }
}

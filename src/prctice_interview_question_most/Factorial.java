package prctice_interview_question_most;

public class Factorial {
    public static long factorial(int n){
        if(n==1){
            return n;
        }else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long factorial = factorial(i);
            System.out.println(i + " factorial is :  " +factorial);
        }
    }
}

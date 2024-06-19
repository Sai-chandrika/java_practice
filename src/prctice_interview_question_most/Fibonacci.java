package prctice_interview_question_most;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("print fibonacci");
        int a=0;
        int b=1;
        int c=1;
        for(int i=1; i<=10; i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;

        }

    }
}

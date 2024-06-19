package java_interview_practice;

public class Fibonacci1 {

    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println(fib(i));

        }


    }

    public  static int fib(int i){
        if(i<=1){
            return  i;
        }else{
            return fib(i-1)+fib(i-2);
        }

    }
}

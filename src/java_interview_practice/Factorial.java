package java_interview_practice;

public class Factorial {
    public static void main(String[] args) {

       for(int j=0; j<=5;j++){
          factrorial(j);
       }
    }

    public static void factrorial(int j){
        int res = 1;
        for (int k = 1; k <= j; k++) {
            res *= k;
        }
        System.out.println(res);
    }




}

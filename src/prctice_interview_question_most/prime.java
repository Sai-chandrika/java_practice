package prctice_interview_question_most;

public class prime {

    public static Boolean primeNumber(int p){
        if(p==0 || p==1){
            return false;
        }
        if(p==2){
            return true;
        }
        for(int i=2; i<= p / 2; i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("print prime numbers");
        for (int i = 0; i <= 100; i++) {
            if (primeNumber(i).equals(true)) {
                System.out.println(i);
            }
        }
        System.out.println("*************************");
        System.out.println(" find prime or not");
        for (int num = 0; num <= 10; num++) {
            if (primeNumber(num).equals(true)) {
                System.out.println(num + " is PrimeNUmber");
            } else {
                System.out.println(num + " is Not PrimeNUmber");
            }

        }
    }
}

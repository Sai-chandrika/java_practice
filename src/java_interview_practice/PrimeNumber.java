package java_interview_practice;

public class PrimeNumber {
    public static void main(String[] args) {


        for(int i=0; i<100;i++){
           boolean b= isPrimary(i);
           if(b){
               System.out.println(i);
           }else {

           }

            }



        }

    public  static boolean  isPrimary(int i ){
        if(i<=1){
            return false;
        }
        if(i<=3){
            return true;
        }
        if(i%2==0 || i%3==0){
            return false;
        }

        for(int k=5; k*k<=i; k+=6){
            if(i*k==0 || i*(k+2)==0){
                return false;
            }
        }
        return true;
    }

    }


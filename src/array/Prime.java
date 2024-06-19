package array;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Prime {

    public static boolean primeNumber(int n){
        if(n <=1){
            return false;
        }
        if(n <=3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return  false;
        }

        for(int i=5; i*i<=n; i+=6){
            if(n*i==0 || n*(i+2) ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        for(int i=1; i<=num ; i++){
            int t=scanner.nextInt();
            if(primeNumber(t)){
                System.out.println("it is prime number");
            }else{
                System.out.println("it is not a prime number");

            }
        }
    }
}

public class Example {

    public static  void main(String args[]){
        System.out.println(fib(5));
    }

    public static int fib(int a){
        if(a<=2){
            return  a;
        }
        return fib(a-1) + fib(a-2);
    }


    }

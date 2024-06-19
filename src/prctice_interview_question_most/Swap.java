package prctice_interview_question_most;

public class Swap {



    public static void main(String[] args) {
        System.out.println("swapping two numbers without using third number a=10, b=20");
        int a=10;
        int b=20;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("number a : " + a) ;
        System.out.println("number b : " + b) ;

        System.out.println("************************************************************");
        System.out.println("swap the two chars or strings");

        int c='C';
        int m='M';

        c= (char)c+m;
        m= (char)c-m;
        c= (char)c-m;

        System.out.println("char of c: " +(char) c);
        System.out.println("char of m: " +(char) m);
        String child2="chandrika";
        String child1="mounika";
        child1=child1+child2;
        child2=child1.substring(0,child1.length()-child2.length());
        child1=child1.substring(child2.length());
        System.out.println("child1 is :"+ child1);
        System.out.println("child2 is :"+ child2);

        System.out.println("*********************************");


        System.out.println();


    }
}

package inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Student extends Person{
    private int[] testScores;

    public Student(String firstName, String lastname, int idNumber,int[] testScores) {
        super(firstName,lastname,idNumber);
        this.testScores = testScores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "testScores=" + Arrays.toString(testScores) +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public static char calculate(int score){
        if(score>=90 && score<=100){
            return  'O';
        }else if(score>=80 && score<90){
            return  'E';
        }else if(score>=70 && score<80){
            return  'A';
        }else if(score>=55 && score<70){
            return  'P';
        }else if(score>=40 && score<55){
            return  'D';
        }else if(score<40){
            return  'T';
        }
        return 'a';
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstName=scanner.nextLine();
        String lastName=scanner.nextLine();
        int idNo=scanner.nextInt();
        int no=scanner.nextInt();
        int score[]=new int[no];
        int totalScore=0;
        for(int i=0; i<no; i++){
            score[i]=scanner.nextInt();
            totalScore+=score[i];
        }
        int avgScore=totalScore/score.length;
        scanner.close();

        Student student=new Student(firstName,lastName, idNo,score);
        System.out.println(student);
        System.out.println(avgScore);
        char grade=calculate(avgScore);
        System.out.println("GRADE: " +grade);
    }
}

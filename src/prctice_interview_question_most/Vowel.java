package prctice_interview_question_most;

public class Vowel {

    public static void checkVowelOrNOt(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println( ch + " is vowel");
        }else {
            System.out.println(ch + " is consonant");
        }
    }

    public static void main(String[] args) {
        System.out.println("check which is Vowel  and which is  consonant");
        String name="chandrika";
        for(int i=0; i<name.length(); i++){
            checkVowelOrNOt(name.charAt(i));
        }
    }
}

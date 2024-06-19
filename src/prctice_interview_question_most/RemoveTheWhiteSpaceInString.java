package prctice_interview_question_most;

public class RemoveTheWhiteSpaceInString {
    public static void main(String[] args) {
        String name="Hello World ";
        System.out.println(name.replace(" ", ""));
        System.out.println(name.trim());
        System.out.println(name.strip());
        char[] letter=name.toCharArray();
        for(int i=0; i<letter.length; i++){
            if(!Character.isWhitespace(letter[i])){
                System.out.print(letter[i]);
            }
        }

    }
}

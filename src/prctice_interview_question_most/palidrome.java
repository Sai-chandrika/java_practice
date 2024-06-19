package prctice_interview_question_most;

public class palidrome {
  public static   Boolean checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
      String name="mom";
      if(checkPalindromeString(name).equals(true)){
          System.out.println(name);
      }else{
          System.out.println( name + " is not palindrome");
      }


    }
}

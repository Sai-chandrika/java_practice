package java_interview_practice;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("triangle**********");
triangle(5);
        System.out.println("reverseTriangle****************");

        reverseTriangle(5);
        System.out.println("numberTriangle****************");

        numberTriangle(5);
        System.out.println("diamond****************");

        diamond(5);
    }

private static void  triangle(int rows){

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

    private static void  numberTriangle(int rows){

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    private static void  reverseTriangle(int rows){

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private static void  diamond(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

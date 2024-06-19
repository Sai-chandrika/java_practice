package concepts;

public class Polymorphism {
    public static void main(String[] args) {
        School school=new School();
        College college=new College();
        school.fee();
        college.fee();
    }
}

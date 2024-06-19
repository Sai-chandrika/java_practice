package concepts;

public class StringConcept {

    public static void main(String[] args) {
        System.out.println("****** 1 ***********");
        System.out.println("what is String");

        System.out.println(
                " * string is a one type if datatype." +
                        "String object is represent the sequence of characters . String is immutable in java . immutable means once created object that content can not be changed" +
                        "String class is part of  the java.lang package"
        );
        System.out.println("****** 2 ***********");
        System.out.println(" how to create String in java");

        System.out.println(
                "string is create in two ways " +
                        "* literal" +
                        "*  using new keyword"
        );

        String s="chandrika";
        System.out.println(s);
        String string=new String("chandrika");
        System.out.println(string);
        System.out.println("****** 3 ***********");
        System.out.println("how to compare and equal String literal and Object");
       String name="mounika";
       String name2="mounika";
       String name3=new String("mounika");

        System.out.println(name2.equals(name));
        System.out.println(name2==name);
        System.out.println(name2==name3);
        System.out.println(name2.equals(name3));

        System.out.println("**** 4 ******");
        System.out.println(" how to merge two strings ");

        String s1="chandrika";
        String s2="Ganugapenta";
        String s3=new String("mounika");
        String s4=new String("Ganugapenta");

        System.out.println(s1+s2);
        System.out.println(s3+s4);
        System.out.println(s1.concat(s2));
        System.out.println(s3.concat(s4));
        System.out.println(s3.concat( " "+s2));

        System.out.println("******** 5 **********");
        System.out.println("how to convert string to char of array");
        String maa="swathi";
        char[] cha=maa.toCharArray();
        for(char i:cha){
            System.out.println(i);
        }
        System.out.println(  maa +" string length is " + maa.length());
       String a="chandrika Ganugapenta";
        System.out.println(  a +" subString is  "+a.substring(7));
        System.out.println(  a +" subString is  "+a.substring(10,20));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());


        System.out.println(" once string is created can not change the concept value but new object ois created so tell string is immutable");
String fullName="chandrika";
String surName=fullName.concat("Ganugapenta");
        System.out.println(fullName);
        System.out.println(surName);

    }
}

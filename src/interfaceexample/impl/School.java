package interfaceexample.impl;

public class School {
    public void name(){
        System.out.println("chandrika");
    }
    private void mobileNo(){
        System.out.println("8019271662");
    }

    public static void age(){
        System.out.println("22");
    }

    public static void main(String[] args) {
        SingleToneExample singleToneExample=new SingleToneExample();
        SingleToneExample singleToneExample1=new SingleToneExample();

        System.out.println(singleToneExample);
        System.out.println(singleToneExample1);


        
    }
}

package interfaceexample.impl;

public class SingleToneExample {
    private  static SingleToneExample singleTone=null;

    private  static SingleToneExample getInstance(){
        if(singleTone==null){
            singleTone=new SingleToneExample();
        }
        return singleTone;
    }

    public static void main(String[] args) {
        SingleToneExample singleTone1= SingleToneExample.getInstance();
        SingleToneExample singleTone2= SingleToneExample.getInstance();
        System.out.println(singleTone2);
        System.out.println(singleTone1);

    }
}

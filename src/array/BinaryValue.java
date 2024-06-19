package array;

public class BinaryValue {

    public static void binary(int a){
        String s=Integer.toBinaryString(a);
        int con=0;
        int min=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                con++;
                min=Math.max(min,con);
            }else{
                con=0;
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        binary(13);
    }
}

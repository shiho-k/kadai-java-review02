
public class Review01 {

    public static void main(String[] args) {
       int num1=1500;
       int num2=num1*10/100;
       int num3=num1+num2;



    System.out.println(num1+"円の商品の税込価格は"+num3+"円" +"(消費税は"+num2+"円）です。");
}
    public static int taxMethod(int num1,int num2) {
        int num=num1+num2;
        return num;


    }


}

public class Review01 {

    public static void main(String[] args) {
       int price=1500;
       int zei=10;
       int result;
       result=tax(price,zei);
       System.out.println(price+"円の商品の税込価格は"+(price+result)+"円" +"(消費税は"+result+"円）です。");
}
    public static int tax(int price,int zei) {
        int result=price*zei/100;
        return result;
}
}




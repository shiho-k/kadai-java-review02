
public class Review01 {

    public static void main(String[] args) {
       int price=1500;
       int taxPrice=tax(price);
       int zeikomiPrice=price+taxPrice;
       System.out.println(price+"円の商品の税込価格は"+zeikomiPrice+"円" +"(消費税は"+taxPrice+"円）です。");
}
    public static int tax(int price) {
        int taxPrice=price*10/100;
        return taxPrice;
}
}





public class SwitchSample {

    public static void main(String[] args) {
        int score=-10;

        int rank=ranking(score);

        switch(rank) {

        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:

            System.out.println("赤点です・・・補講を行います");
            break;

         case 6:
         case 7:

             System.out.println("合格です！");
             break;

          case 8:
          case 9:

             System.out.println("よくできました！");
             break;

          case 10:

             System.out.println("満点です！ご褒美をあげます！");
             break;

          default:
              System.out.println("点数は０以上１００以内で代入してください。");
              break;

        }
    }
    public static int ranking(int score) {
        if(score<0) {
            return-1;

        }else if(score>100) {
            return 11;

        }else {
            return score/10;

        }
    }
}

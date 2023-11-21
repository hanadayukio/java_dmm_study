
	
//while文(繰り返し処理)
public class Capter09 {
    public static void main(String[] args) {
//    	int型　numberクラスの定義と初期化
        int number = 50;
//        numberが50未満の場合繰り返す
        while (number < 50) {
//        	numberにnumber*2を代入する
            number *= 2;
//            出力
            System.out.println("While01 = " + number);
        }

        int number_1 = 50;
        do {
            number_1 *= 2;
            System.out.println("DoWhile01 = " + number_1);
        } while (number_1 < 50);
    }
}
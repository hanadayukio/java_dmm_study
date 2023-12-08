//
////while文(繰り返し処理)
//public class Chapter09 {
//    public static void main(String[] args) {
////    	int型　numberクラスの定義と初期化
//        int number = 50;
////        numberが50未満の場合繰り返す
//        while (number < 50) {
////        	numberにnumber*2を代入する
//            number *= 2;
////            出力
//            System.out.println("While01 = " + number);
//        }
////do-while文
//        int number_1 = 50;
////        do-while文開始
//        do {
////        	numberにnumber*2を代入する
//            number_1 *= 2;
////            出力
//            System.out.println("DoWhile01 = " + number_1);
////           50未満なら繰り返し、50以上なら終了
//        } while (number_1 < 50);
//    }
//}
///* 
//whileとdo-whileの違いは一度目の処理後にループ条件を確認するか、処理前にループ条件を確認するかの違い
//while 処理前にループ条件を確認し終了or処理
//do-while 処理後にループ条件を確認して終了or再処理
// */

//public class Chapter09 {
//    public static void main(String[] args) {
//        // for文：
//        // 初期化式：numberを1で初期化
//        // 条件式：numberが5未満の場合、ブロックの処理を行う
//        // 変化式：ブロックの処理後に、numberをインクリメント
//    	for (int number = 1; number <= 5; number++) {
//            // ブロック：numberを出力
//            System.out.println("For01 = " + number);
//        }
//    	
//    }
//}
//再帰処理
//public class Chapter09 {
//public static void main(String[] args) {
//        int number = 1;
//        printNum(number);
//    }
//
//    public static int printNum(int number) {
//        if (number < 50) {
//            number *= 2;
//            System.out.println("While01 = " + number);
//            // 条件にマッチしたら自分自身を再度呼び出す
//            //public static int 『printNum(int number)』の部分を呼び出す {
//            printNum(number);
//        }
//        //演算最終結果をnumberに返している
//        return number;
//    }
//}
//九九表を表示するプログラムを作成してください
//public class Chapter09 {
//    public static void main(String[] args) {
//    	for (int number = 1; number <= 9; number++) {
//            // ブロック：numberを出力
//    		for (int j = 1; j < 10; j++) {
//    			System.out.println(number + "*" + j + "=" + number * j + " ");
//    		}
//            System.out.println();
//        }
//    }
//}

//
public class Chapter09 {
    public static void main(String[] args) {
        int a = 976;
        int b = 427;
		//gcd(a, b)は static int gcd(int a, int b) の処理を呼び出す
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
    }

    // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
        // b(余り)が0になった時のaが最大公約数
        if (b == 0) {
			//結果をaに返す
            return a;
        }
        // 再帰呼び出し
        return gcd(b, a % b);
    }
}





public class Chapter08 {

/*問題1  if文を使用して「Chapter08_1.java」ファイルに以下を満たすプログラムを作成してください。

距離を表すint型の変数を定義し、任意の値で初期化する
距離が5以下の場合は "とても近いです" を出力する
距離が5より大きく10以下の場合は "近いです" を出力する
距離が10より大きく15以下の場合は "遠いです" を出力する
距離が15より大きい場合は "とても遠いです" を出力する*/
	
	public static void main(String[] args) {
		int lenge = 16;
		
		if (lenge < 5)
			System.out.println("距離がとても近いです");
		else if (lenge <= 10)
			System.out.println("距離が近いです");
		else if (lenge <= 15)
			System.out.println("距離が遠いです");
		else 
			System.out.println("距離がとても遠いです");
		
	
/*問題2 switch文を使用して「Chapter08_2.java」ファイルに以下を満たすプログラムを作成してください。

曜日を表すString型の変数を定義し、 英単語で初期化する
英単語に該当する日本語で曜日を出力する
曜日以外の単語の場合は "曜日ではありません" を出力する*/
		String week = "Suday";
		
		switch (week) {
		case "Sunday":
			System.out.println("日曜日");
			break;
		case "Monnday":
			System.out.println("月曜日");
			break;
		case "Tuesday":
			System.out.println("火曜日");
			break;
		case "Wednesday":
			System.out.println("水曜日");
			break;
		case "Thursday":
			System.out.println("木曜日");
			break;
		case "Friday":
			System.out.println("金曜日");
			break;
		case "Saturday":
			System.out.println("土曜日");
			break;
			
		default:
			System.out.println("曜日ではありません");
			break;
		
		}
				
	}
}
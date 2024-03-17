package classmethod.human;

public class Task {
	 // メンバー変数
   // 日付
	private int date; // インスタンス変数
	// タスク内容
	private String content; // インスタンス変数
	// 状態（trueで完了）
	private boolean done = false; // インスタンス変数

	// コンストラクタを作成
	public Task(int date, String content) {
		// 引数で指定された値を代入
		this.date = date;
		this.content = content;
	}

	
	public void done() {
		System.out.println("タスク『" + content + "』を完了します。");
		done = true;
	}
	public void print() {
		if (done) {
			System.out.println(date + "のタスク「" + content + "」は完了しています。");
		} else {
			System.out.println(date + "のタスク「" + content + "」は未完了です。");
		}
	}
}

//20211010のタスク「牛乳を買う」は未完了です。
//タスク「牛乳を買う」を完了します。
//20211010のタスク「牛乳を買う」は完了しています。
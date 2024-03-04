
public class operator_if {

	public static void main(String[] args) {
		// if文(判定)の基礎
		// 比較演算子
		// if (条件) {処理内容;}
		
		// もし、”ある数”(a)が20より小さい場合は、Aと表示する
		int a = 10;
		
		if(a < 20) {
			System.out.println("A" + "\n");
		}
		
		// もし、”ある数”(a)が30以下だった場合は、Bと表示する
		int a2 = 20;
		
		if(a2 <= 30) {
			System.out.println("B" + "\n");
		}
		
		// もし、”ある文字列”(b)が「山田(人の名前)」だった場合は、
		//「山田さん」を表示する
		// 文字列はStringクラスを参照して型を定義します。
		// その場合、比較演算子は使用できないためequalsメソッドを用いて比較します。 
		String b = "山田";
		
		if(b.equals("山田")) {
			System.out.println(b + "さん");
		}

	}

}


public class Text3 {

	public static void main(String[] args) {
		// if文(判定)の基礎
		// elseif文
		// if (条件1) {処理内容1;} 
		// else if(条件2) {処理内容2;}
		
		// もし”ある数”(a)が8より大きい場合は、Aと表示する。 
		// そうでない場合で”ある数”(a)が10未満の場合は、Bと表示する。
		int a = 7;
		
		if(a > 8) {
			System.out.println("A");
		} else if(a < 10) {
			System.out.println("B" + "\n");
		}
		
		// もし、”ある数”(a)が8より大きい場合は、Aと表示する。
		// そうでない場合で”ある数”(a)が10未満の場合は、Bと表示する。
		int a2 = 11;
		
		if(a2 > 8) {
			System.out.println("A");
		} else if(a2 < 10) {
			System.out.println("B");
		}

	}

}

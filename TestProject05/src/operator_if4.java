
public class operator_if4 {

	public static void main(String[] args) {
		// if文(判定)の基礎
		// else文
		// if (条件) {処理内容1;}
		// else {処理内容2;
		
		// もし、”ある数”(a)が5より大きい場合は、Aと表示する。
		// そうでない場合は、Zと表示する。
		int a = 3;
		
		if(a > 5) {
			System.out.println("A");
		} else {
			System.out.println("Z" + "\n");
		}
		
		// もし、”ある数”(a)が8より小さい場合は、Aと表示する。
		// そうでない場合で”ある数”(a)が8の場合は、Bと表示する。
		// そうでない場合は、Cと表示する。
		
		int a2 = 20;
		
		if(a2 < 8) {
			System.out.println("A");
		} else if(a2 == 8) {
			System.out.println("B");
		} else {
			System.out.println("C" + "\n");
		}
		
		// もし、”ある数”(b)が20以上の場合は、「成人」と表示する。
		// そうでない場合は、「未成年」と表示する。
		int b = 18;
		
		if(b >= 20) {
			System.out.println("成人");
		} else {
			System.out.println("未成年");
		}

	}

}

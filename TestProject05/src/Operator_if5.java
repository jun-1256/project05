
public class Operator_if5 {

	public static void main(String[] args) {
		// if文(判定)の基礎
		// else文
		
		// もし、”ある数”(age)が20未満なら、未成年と表示。
		//そうでない場合で、80より大きければ、高齢者と表示。
		//それ以外の場合は、成人と表示する。
		int age = 35;
		
		if(age < 20) {
			System.out.println("未成年");
		} else if(age > 80) {
			System.out.println("高齢者");
		} else {
			System.out.println("成人" + "\n");
		}
		
		// もし、”ある数”(age)が20未満なら、未成年と表示。
		// そうでない場合で、20以上で80以下であれば、成人と表示。
		// それ以外の場合は、高齢者と表示する。
		// 下記のように『20より大きく かつ 80未満』という条件を2番目に指定し、 
		// 最後のelseで高齢者を記述しても、上記のif文と同じ意味になります。
		int age2 = 35;
		
		if(age2 < 20) {
			System.out.println("未成年");
		} else if(age2 >= 20 && age2 <= 80) {
			System.out.println("成人" + "\n");
		} else {
			System.out.println("高齢者");
		}
		
		// 下記のように『剰余(%)』条件を指定することで偶数と奇数の表示が出来ます。
		int a = 5;
		
		if(a % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		
	}

}

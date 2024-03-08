
public class Text2 {

	public static void main(String[] args) {
		// if文(判定)の基礎
		// 論理演算子
		
		// もし、”ある数”(a)が10未満であり、 かつ 3より大きい場合は、Aと表示する
		int a = 5;
		
		if(a<10 && 3<a) {
			System.out.println("A" + "\n");
		}
		
		// もし、”ある数”(b)が5以上である、
		// または0以下のどちらかである場合は、Bと表示する
		int b = 5;
		
		if(b >= 5 || b <= 0) {
			System.out.println("B" + "\n");
		}

	}

}

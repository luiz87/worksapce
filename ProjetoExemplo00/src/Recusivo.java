
public class Recusivo {

	public static void main(String[] args) {
		int n = soma(5);
		System.out.println(n);

//		int f = 0;
//		for(int i = 5; i >= 0; i--) {
//			f = f + i;
//		}
//		System.out.println(f);
	}

	static int soma(int n) {
		if (n > 0) {
			return n + soma(n - 1);
		} else {
			return 0;	
		}
		
	}

}

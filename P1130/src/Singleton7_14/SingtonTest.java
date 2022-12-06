package Singleton7_14;
final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	public static Singleton getInstance() {
		if(s==null)
			s= new Singleton();
		return s;
	}
}
public class SingtonTest {
	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance(); // 인스턴스를 생성못하기 때문에 get인스턴스를 사용한다

	}

}

import static java.lang.System.out; // 빼고 싶은걸 임포트문으로 작성 
import static java.lang.Math.*;

public class StaticImportEx1 {
	public static void main(String[] args) {
		// System.out.println(Math.random());
		out.println(random());

		// System.out.println("Math.PI :"+Math.PI);
		out.println("Math.PI :" + PI);

	}

}

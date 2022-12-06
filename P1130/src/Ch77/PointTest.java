package Ch77;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}
}

class Point {
	int x, y;

	Point(int x, int y) {  // 부모클래스에 있는 생성자를 명시적으로 호출해야오류안남
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x,y); // 부모 생성자를 명시적으로 호출해서 오류 사라짐
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}

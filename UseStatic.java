package Day1Problems;

public class UseStatic {
static int x = 10;
static int y;
static void func(int z) {
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	System.out.println("z = " + z);
}
static {
		System.out.println("static block initialized.");
		y = x+5;
}
public static void main(String args[]) {
	func(8);
	}
	
}


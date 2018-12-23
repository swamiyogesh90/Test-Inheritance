package inheritance;

public class Test1 {

	static class Base {
		private static void display() {
			System.out.println("Static or class method from Base");
		}

		public void print() {
			System.out.println("Non-static or instance method from Base");
		}
	}

	static class Derived extends Base {
		private static void display() {
			System.out.println("Static or class method from Derived");
		}

		public void print() {
			System.out.println("Non-static or instance method from Derived");
		}
	}

	public static void main(String args[]) {
		Base obj = new Derived();
		obj.display();
		obj.print();
	}
}

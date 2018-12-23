package inheritance;

public class Test {

	static class Parent {

		static protected int salary = 2000;

		void printSalary() {
			System.out.println(salary);
		}
	}
	
	static class Child extends Parent{

		static void changeSalary(Parent p) {
			p.salary = 1000;
		}
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		c.changeSalary(p);
		c.printSalary();
	}

}

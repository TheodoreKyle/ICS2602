class Parent {
void display() {
	System.out.println("Parent method"); 
	}
}

class Child extends Parent {
} 
	
public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}

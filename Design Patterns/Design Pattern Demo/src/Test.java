
public class Test {
	public static void main(String[] args) {
		if(true)
			if(false)
				System.out.println("12");
			else
				System.out.println("34");
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append(1);
		A.B b = new A.B();
	}
}

class A {
	public static class B {
		
	}
}


package pack1;

public class MethodOverloading {
	void meth1() {
		System.out.println("meth1 called");
	}
	final public void meth2(int a) {
		System.out.println(a);
	}
	final protected void meth3(String s,int b) {
		System.out.println(s);
	}
	private void meth4(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.meth1();
		obj.meth2(10);
		obj.meth3("java", 20);
		obj.meth4("java is awesome");
	}

}
